package com.momo.cryptomus;

import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpStatus;
import cn.hutool.http.HttpUtil;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.momo.cryptomus.data.CryptoPayment;
import com.momo.cryptomus.data.CryptomusRequest;
import com.momo.cryptomus.data.PaymentList;
import com.momo.cryptomus.data.requests.PaymentCreateData;
import com.momo.cryptomus.exceptions.BadRequestException;
import com.momo.cryptomus.requests.PaymentCreateRequest;
import com.momo.cryptomus.requests.PaymentInfoRequest;
import com.momo.cryptomus.requests.PaymentListRequest;
import com.momo.cryptomus.response.PaymentResponse;
import com.momo.cryptomus.utils.CryptoRequestUtil;
import com.momo.cryptomus.utils.EncodeUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.UUID;

public class Cryptomus {

    private final UUID merchantId;
    private final String token;

    protected Cryptomus(@NotNull UUID merchantId, @NotNull String token) {
        this.merchantId = merchantId;
        this.token = token;
    }

    public UUID getMerchantId() {
        return merchantId;
    }

    public String getToken() {
        return token;
    }

    public static @NotNull Cryptomus create(UUID merchantId, String token) {
        return new Cryptomus(merchantId, token);
    }

    public PaymentResponse createPayment(@NotNull PaymentCreateData data) throws IOException {
        return parseResponse(PaymentResponse.class, new PaymentCreateRequest(data));
    }

    public CryptoPayment getPayment(@NotNull UUID paymentId) throws IOException {
        return parseResponse(CryptoPayment.class, new PaymentInfoRequest(paymentId));
    }

    public PaymentList getPayments(@Nullable UUID cursor) throws IOException {
        return parseResponse(PaymentList.class, new PaymentListRequest(cursor));
    }

    private <T> T parseResponse(@Nullable Class<T> clazz, @NotNull CryptomusRequest cryptomusRequest) {
        String json = cryptomusRequest.getDataAsJson();
        System.out.println(json);
        String responseBody;
        try {
            HttpResponse response = HttpUtil.createPost(cryptomusRequest.getUrl())
                    .header("merchant", merchantId.toString())
                    .header("sign", EncodeUtil.createSign(json, this.token))
                    .contentType(CryptoRequestUtil.CONTENT_TYPE)
                    .body(json)
                    .execute();
            responseBody = response.body();
            System.out.println(responseBody);

            if (response.getStatus() != HttpStatus.HTTP_OK || responseBody == null)
                throw new BadRequestException(responseBody);
            if (clazz == null)
                return null;
            JsonObject object = JsonParser.parseString(responseBody).getAsJsonObject();
            return new Gson().fromJson(object.get("result"), clazz);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
