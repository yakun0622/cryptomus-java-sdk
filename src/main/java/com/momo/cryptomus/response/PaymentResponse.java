
package com.momo.cryptomus.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Date;

public class PaymentResponse implements Serializable {

    private static final long serialVersionUID = 1618721748847646688L;

    @SerializedName("additional_data")
    private String additionalData;
    private String address;
    private String amount;
    private String comments;
    private String commission;
    @SerializedName("created_at")
    private Date createdAt;
    private String currency;
    private String discount;
    @SerializedName("discount_percent")
    private Double discountPercent;
    @SerializedName("expired_at")
    private Long expiredAt;
    private String from;
    private String url;
    @SerializedName("is_final")
    private Boolean isFinal;
    @SerializedName("merchant_amount")
    private Double merchantAmount;

    private String network;
    @SerializedName("order_id")
    private String orderId;
    @SerializedName("payer_amount")
    private String payerAmount;
    @SerializedName("payer_amount_exchange_rate")
    private Double payerAmountExchangeRate;
    @SerializedName("payer_currency")
    private String payerCurrency;
    @SerializedName("payment_amount")
    private Double paymentAmount;
    @SerializedName("payment_amount_usd")
    private Double paymentAmountUsd;
    @SerializedName("payment_status")
    private String paymentStatus;
    
    private String status;
    
    private String txid;

    public String getAdditionalData() {
        return additionalData;
    }

    public void setAdditionalData(String additionalData) {
        this.additionalData = additionalData;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getCommission() {
        return commission;
    }

    public void setCommission(String commission) {
        this.commission = commission;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public Double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(Double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public Long getExpiredAt() {
        return expiredAt;
    }

    public void setExpiredAt(Long expiredAt) {
        this.expiredAt = expiredAt;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public Boolean getFinal() {
        return isFinal;
    }

    public void setFinal(Boolean aFinal) {
        isFinal = aFinal;
    }

    public Double getMerchantAmount() {
        return merchantAmount;
    }

    public void setMerchantAmount(Double merchantAmount) {
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

    public String getPayerAmount() {
        return payerAmount;
    }

    public void setPayerAmount(String payerAmount) {
        this.payerAmount = payerAmount;
    }

    public Double getPayerAmountExchangeRate() {
        return payerAmountExchangeRate;
    }

    public void setPayerAmountExchangeRate(Double payerAmountExchangeRate) {
        this.payerAmountExchangeRate = payerAmountExchangeRate;
    }

    public String getPayerCurrency() {
        return payerCurrency;
    }

    public void setPayerCurrency(String payerCurrency) {
        this.payerCurrency = payerCurrency;
    }

    public Double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public Double getPaymentAmountUsd() {
        return paymentAmountUsd;
    }

    public void setPaymentAmountUsd(Double paymentAmountUsd) {
        this.paymentAmountUsd = paymentAmountUsd;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "PaymentResponse{" +
                "additionalData='" + additionalData + '\'' +
                ", address='" + address + '\'' +
                ", amount='" + amount + '\'' +
                ", comments='" + comments + '\'' +
                ", commission='" + commission + '\'' +
                ", createdAt=" + createdAt +
                ", currency='" + currency + '\'' +
                ", discount='" + discount + '\'' +
                ", discountPercent=" + discountPercent +
                ", expiredAt=" + expiredAt +
                ", from='" + from + '\'' +
                ", url='" + url + '\'' +
                ", isFinal=" + isFinal +
                ", merchantAmount=" + merchantAmount +
                ", network='" + network + '\'' +
                ", orderId='" + orderId + '\'' +
                ", payerAmount='" + payerAmount + '\'' +
                ", payerAmountExchangeRate=" + payerAmountExchangeRate +
                ", payerCurrency='" + payerCurrency + '\'' +
                ", paymentAmount=" + paymentAmount +
                ", paymentAmountUsd=" + paymentAmountUsd +
                ", paymentStatus='" + paymentStatus + '\'' +
                ", status='" + status + '\'' +
                ", txid='" + txid + '\'' +
                '}';
    }
}
