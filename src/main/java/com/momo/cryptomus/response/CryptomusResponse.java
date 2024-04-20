
package com.momo.cryptomus.response;

public class CryptomusResponse<T> {

    private T result;
    private Long state;

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }

}
