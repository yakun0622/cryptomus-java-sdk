package com.momo.cryptomus.requests;

import com.momo.cryptomus.data.CryptomusRequest;
import com.momo.cryptomus.utils.CryptoRequestUtil;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public class PaymentInfoRequest extends CryptomusRequest {

	private final UUID paymentId;

	public PaymentInfoRequest(@NotNull UUID paymentId) {
		super(CryptoRequestUtil.PAYMENT_INFO, null);
		this.paymentId = paymentId;
	}

	@Override
	public @NotNull String getDataAsJson() {
		return String.format("{\"uuid\":\"%s\"}", paymentId.toString());
	}
}
