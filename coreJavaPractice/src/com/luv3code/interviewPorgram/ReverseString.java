package com.luv3code.interviewPorgram;

public class ReverseString {

	public static void main(String[] args) {
		
		String string="12345678";
		
		System.out.println(reverse(string));
	}

	private static String reverse(String in) {
	
		StringBuilder outBuilder=new StringBuilder();
		char[] chars=in.toCharArray();
		for (int i= chars.length-1;i>=0 ; i--) {
			outBuilder.append(chars[i]);
			
		}
		return outBuilder.toString();
	}

}
