import com.momo.cryptomus.Cryptomus;
import com.momo.cryptomus.data.requests.PaymentCreateData;
import com.momo.cryptomus.response.PaymentResponse;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.UUID;

public class Test {

    public static final String PAYMENT_KEY = "111111";
    public static final String MERCHANT_UUID = "56e5aee6-3d76-4077-b7ae-f98aacdd5df6";


    public static void main(String[] args) {
        UUID id = UUID.fromString(MERCHANT_UUID);
        Cryptomus cryptomus = Cryptomus.create(id, PAYMENT_KEY);
        PaymentCreateData payData = PaymentCreateData.builder()
                .amount(BigDecimal.valueOf(15))
                .orderId("100025")
                .currency("USDT")
                .redirectUrl("http://test.momoproxy.com/dashboard")
                .build();
        try {
            PaymentResponse paymentResponse = cryptomus.createPayment(payData);
            System.out.println(paymentResponse);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
