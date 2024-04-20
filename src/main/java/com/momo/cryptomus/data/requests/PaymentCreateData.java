package com.momo.cryptomus.data.requests;

import cn.hutool.core.util.StrUtil;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.annotations.SerializedName;
import com.momo.cryptomus.data.ICryptoRequestData;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class PaymentCreateData implements ICryptoRequestData, JsonSerializer<BigDecimal> {

    private final UUID id;

    @JsonProperty("order_id")
    @SerializedName("order_id")
    private final String orderId;
    private final String amount;
    private final String currency;
    private final String network;
    @JsonProperty("url_return")
    @SerializedName("url_return")

    private final String redirectUrl;
    @JsonProperty("url_callback")
    @SerializedName("url_callback")
    private final String callbackUrl;
    private final int lifetime;

    @SerializedName("is_refresh")
    private final boolean isRefresh;


    private PaymentCreateData(Builder builder) {
        id = builder.id;
        orderId = builder.orderId;
        amount = builder.amount;
        currency = builder.currency;
        network = builder.network;
        redirectUrl = builder.redirectUrl;
        callbackUrl = builder.callbackUrl;
        lifetime = builder.lifetime;
        isRefresh = builder.isRefresh;
    }

    @Contract(value = " -> new", pure = true)
    public static @NotNull Builder builder() {
        return new Builder();
    }

    @Override
    public JsonElement serialize(@NotNull BigDecimal bigDecimal, Type type, JsonSerializationContext jsonSerializationContext) {
        System.out.println("serialize");
        return new JsonPrimitive(bigDecimal.toString());
    }


    public static final class Builder {
        private UUID id;
        private String amount;

        private String orderId;
        private String currency;
        private String network;
        private String redirectUrl;
        public String callbackUrl;
        private int lifetime;
        private boolean isRefresh;

        private Builder() {
        }

        public Builder id(UUID id) {
            this.id = id;
            return this;
        }

        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }


        public Builder amount(String amount) {
            this.amount = amount;
            return this;
        }

        public Builder amount(@NotNull BigDecimal amount) {
            this.amount = amount.toString();
            return this;
        }

        public Builder currency(@NotNull String currency) {
            this.currency = currency;
            return this;
        }
        public Builder network(@NotNull String network) {
            this.network = network;
            return this;
        }

        public Builder redirectUrl(@NotNull String redirectUrl) {
            this.redirectUrl = redirectUrl;
            return this;
        }

        public Builder lifetime(int lifetime) {
            this.lifetime = lifetime;
            return this;
        }
        public Builder isRefresh(boolean isRefresh) {
            this.isRefresh = isRefresh;
            return this;
        }
        public Builder callbackUrl(String callbackUrl) {
            this.callbackUrl = callbackUrl;
            return this;
        }



        public Builder lifetime(long duration, TimeUnit unit) {
            return lifetime((int) unit.toSeconds(duration));
        }


        public PaymentCreateData build() {
            if (id == null)
                id = UUID.randomUUID();
            if (lifetime <= 0)
                lifetime = 3600;
            if (StrUtil.isEmpty(network))
                network = "TRON";

            return new PaymentCreateData(this);
        }


    }

    public UUID getId() {
        return id;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public String getNetwork() {
        return network;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public int getLifetime() {
        return lifetime;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public boolean isRefresh() {
        return isRefresh;
    }
}
