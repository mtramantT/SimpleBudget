package com.budget.services;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Digester {
	/**
	 * Hashes string. Uses "MD5" hashing algorithm.
	 * @param text
	 * @return digested password
	 */
	public static String digester(String text) {
		  //Initialize Variables
		  String digest = null;

		  //Time to hash!
		  try {
		    //Instantiate MessageDigest and set to MD5 hasher
		    MessageDigest md = MessageDigest.getInstance("MD5");
		    md.update(text.getBytes());
		    byte[] bytes = md.digest();
		    StringBuilder sb = new StringBuilder();

		     for(int i=0; i< bytes.length ;i++){
		      //Convert it to hexadecimal format
		       sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
		            }

		     digest = sb.toString();
		     return digest;

		  }catch(NoSuchAlgorithmException e) {
		    return null;
		  }catch(NullPointerException e) {
		    return null;
		  }
		}//digester End

}