package com.chat.util;
import java.security.*;
import java.math.*;

public class Md5 {

	public static String criptografa(String s) {
		String senha = s;
		MessageDigest m;
		try {
			m = MessageDigest.getInstance("MD5");
			m.update(s.getBytes(),0,s.length());
			senha = new BigInteger(1,m.digest()).toString(16);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return senha;
		
	}
	
}



