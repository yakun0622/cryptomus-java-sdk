package com.momo.cryptomus.data;

import com.momo.cryptomus.utils.JsonUtil;
import org.jetbrains.annotations.NotNull;

public interface ICryptoRequestData {

	@NotNull
	default String toJson() {
		return JsonUtil.toJson(this);
	}
}
