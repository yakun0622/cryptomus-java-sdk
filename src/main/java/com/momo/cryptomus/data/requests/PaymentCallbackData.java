
package com.momo.cryptomus.data.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class PaymentCallbackData {

    @JsonProperty("additional_data")
    @SerializedName("additional_data")
    private String additionalData;

    private String amount;

    private String commission;

    private Convert convert;

    private String currency;

    private String from;
    @JsonProperty("is_final")
    @SerializedName("is_final")
    private Boolean isFinal;
    @JsonProperty("merchant_amount")
    @SerializedName("merchant_amount")
    private String merchantAmount;

    private String network;
    @JsonProperty("order_id")
    @SerializedName("order_id")
    private String orderId;
    @JsonProperty("payer_currency")
    @SerializedName("payer_currency")
    private String payerCurrency;
    @JsonProperty("payment_amount")
    @SerializedName("payment_amount")
    private String paymentAmount;
    @JsonProperty("payment_amount_usd")
    @SerializedName("payment_amount_usd")
    private String paymentAmountUsd;

    private String sign;

    private String status;

    private String txid;

    private String type;

    private String uuid;
    @JsonProperty("wallet_address_uuid")
    private String walletAddressUuid;

    public class Convert {


        private String amount;

        private String commission;

        private String rate;
        @JsonProperty("to_currency")
        @SerializedName("to_currency")
        private String toCurrency;

        public String getAmount() {
            return amount;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }

        public String getCommission() {
            return commission;
        }

        public void setCommission(String commission) {
            this.commission = commission;
        }

        public String getRate() {
            return rate;
        }

        public void setRate(String rate) {
            this.rate = rate;
        }

        public String getToCurrency() {
            return toCurrency;
        }

        public void setToCurrency(String toCurrency) {
            this.toCurrency = toCurrency;
        }

        @Override
        public String toString() {
            return "{" +
                    "amount='" + amount + '\'' +
                    ", commission='" + commission + '\'' +
                    ", rate='" + rate + '\'' +
                    ", toCurrency='" + toCurrency + '\'' +
                    '}';
        }
    }

    public String getAdditionalData() {
        return additionalData;
    }

    public void setAdditionalData(String additionalData) {
        this.additionalData = additionalData;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCommission() {
        return commission;
    }

    public void setCommission(String commission) {
        this.commission = commission;
    }

    public Convert getConvert() {
        return convert;
    }

    public void setConvert(Convert convert) {
        this.convert = convert;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public Boolean getIsFinal() {
        return isFinal;
    }

    public void setIsFinal(Boolean isFinal) {
        this.isFinal = isFinal;
    }

    public String getMerchantAmount() {
        return merchantAmount;
    }

    public void setMerchantAmount(String merchantAmount) {
        this.merchantAmount = merchantAmount;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getPayerCurrency() {
        return payerCurrency;
    }

    public void setPayerCurrency(String payerCurrency) {
        this.payerCurrency = payerCurrency;
    }

    public String getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(String paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getPaymentAmountUsd() {
        return paymentAmountUsd;
    }

    public void setPaymentAmountUsd(String paymentAmountUsd) {
        this.paymentAmountUsd = paymentAmountUsd;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTxid() {
        return txid;
    }

    public void setTxid(String txid) {
        this.txid = txid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getWalletAddressUuid() {
        return walletAddressUuid;
    }

    public void setWalletAddressUuid(String walletAddressUuid) {
        this.walletAddressUuid = walletAddressUuid;
    }

    @Override
    public String toString() {
        return "{" +
                "additionalData='" + additionalData + '\'' +
                ", amount='" + amount + '\'' +
                ", commission='" + commission + '\'' +
                ", convert=" + convert +
                ", currency='" + currency + '\'' +
                ", from='" + from + '\'' +
                ", isFinal=" + isFinal +
                ", merchantAmount='" + merchantAmount + '\'' +
                ", network='" + network + '\'' +
                ", orderId='" + orderId + '\'' +
                ", payerCurrency='" + payerCurrency + '\'' +
                ", paymentAmount='" + paymentAmount + '\'' +
                ", paymentAmountUsd='" + paymentAmountUsd + '\'' +
                ", sign='" + sign + '\'' +
                ", status='" + status + '\'' +
                ", txid='" + txid + '\'' +
                ", type='" + type + '\'' +
                ", uuid='" + uuid + '\'' +
                ", walletAddressUuid='" + walletAddressUuid + '\'' +
                '}';
    }
}
