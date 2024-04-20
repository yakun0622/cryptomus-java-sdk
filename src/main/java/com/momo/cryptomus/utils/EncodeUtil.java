package com.momo.cryptomus.utils;

import org.jetbrains.annotations.NotNull;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class EncodeUtil {

	public static byte[] digestMD5(byte[] input) {
		MessageDigest messageDigest;
		try {
			messageDigest = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			throw new IllegalArgumentException(e);
		}
		return messageDigest.digest(input);
	}

	public static @NotNull String bytesToHex(byte @NotNull [] bytes) {
		StringBuilder sb = new StringBuilder();
		for (byte b : bytes) {
			sb.append(String.format("%02x", b));
		}
		return sb.toString();
	}

	public static @NotNull String createSign(@NotNull String json, @NotNull String apiKey) {
		String jsonBase64 = Base64.getEncoder().encodeToString(json.getBytes(StandardCharsets.UTF_8));
		String sign = EncodeUtil.bytesToHex(
				EncodeUtil.digestMD5((jsonBase64 + apiKey).getBytes(StandardCharsets.UTF_8))
		);
		return sign;
	}
}
