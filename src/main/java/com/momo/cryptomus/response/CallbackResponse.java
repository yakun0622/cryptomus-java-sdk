package com.momo.cryptomus.response;

public class CallbackResponse {

    private String amount;
    private String currency;
    private String network;
    private String txid;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getTxid() {
        return txid;
    }

    public void setTxid(String txid) {
        this.txid = txid;
    }

    @Override
    public String toString() {
        return "CallbackResponse{" +
                "amount='" + amount + '\'' +
                ", currency='" + currency + '\'' +
                ", network='" + network + '\'' +
                ", txid='" + txid + '\'' +
                '}';
    }
}
