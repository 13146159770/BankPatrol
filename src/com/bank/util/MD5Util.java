package com.bank.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD5 加密工具类
 * 
 * @author CrazyBunQnQ
 *
 */
public class MD5Util {
	public static String getMD5(String str) {
		MessageDigest md = null;
		String result = "123456";
		try {
			md = MessageDigest.getInstance("MD5");
			md.update(str.getBytes());
			BigInteger lHashInt = new BigInteger(1, md.digest());
			result = String.format("%1$032X", lHashInt);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return result;
	}
}
