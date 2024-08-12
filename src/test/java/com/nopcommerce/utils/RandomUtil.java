package com.nopcommerce.utils;

import java.util.Random;

public class RandomUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getRandomEmail());
	}

	
	public static String getRandomEmail() {
		Random random = new Random();
		char[] ch = new char[10];
		for(int i=0; i<ch.length ;i++) {
			int x = random.nextInt(97, 122);
			ch[i] = (char)x;
		}
		String s = new String(ch);
		return s+"@gmail.com";
	}
}
