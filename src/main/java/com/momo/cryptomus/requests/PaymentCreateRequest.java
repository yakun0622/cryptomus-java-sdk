package com.momo.cryptomus.requests;

import com.momo.cryptomus.data.CryptomusRequest;
import com.momo.cryptomus.data.requests.PaymentCreateData;
import com.momo.cryptomus.utils.CryptoRequestUtil;
import org.jetbrains.annotations.NotNull;


public class PaymentCreateRequest extends CryptomusRequest {

	public PaymentCreateRequest(@NotNull PaymentCreateData data) {
		super(CryptoRequestUtil.PAYMENT_CREATE, data);
	}
}
