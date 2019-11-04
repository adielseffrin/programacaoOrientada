package com.chat.util;
import java.security.*;
import java.math.*;

public class Md5 {

	public static String criptografa(String s) throws NoSuchAlgorithmException {
		MessageDigest m=MessageDigest.getInstance("MD5");
		m.update(s.getBytes(),0,s.length());
		return new BigInteger(1,m.digest()).toString(16);
	}
	
}



