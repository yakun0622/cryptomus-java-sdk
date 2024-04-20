package com.momo.cryptomus.requests;

import com.google.gson.annotations.SerializedName;
import com.momo.cryptomus.data.CryptomusRequest;
import com.momo.cryptomus.utils.CryptoRequestUtil;
import com.momo.cryptomus.utils.EncodeUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.nio.charset.StandardCharsets;
import java.util.UUID;

public class PaymentListRequest extends CryptomusRequest {

	@SerializedName("cursor")
	private final UUID cursor;


	public PaymentListRequest(@Nullable UUID cursor) {
		super(CryptoRequestUtil.PAYMENT_LIST, null);
		this.cursor = cursor;
	}

	public UUID getCursor() {
		return cursor;
	}

	@Override
	public String getUrlParameters() {
		if (getCursor() == null)
			return super.getUrlParameters();

		return "?cursor=" + EncodeUtil.bytesToHex(
				EncodeUtil.digestMD5(getCursor().toString().getBytes(StandardCharsets.UTF_8))
		);
	}

	@Override
	public @NotNull String getDataAsJson() {
		return "{}";
	}
}
