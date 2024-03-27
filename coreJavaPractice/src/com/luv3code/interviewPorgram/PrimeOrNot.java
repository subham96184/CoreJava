package com.luv3code.interviewPorgram;

public class PrimeOrNot {

	public static void main(String[] args) {
		int num=87;
	 System.out.println(rimeOrNot(num));
	}

	private static boolean rimeOrNot(int num) {
		if(num==0|| num==1)
			return false;
		if (num==2) {
			return true;
		}
		else {
			for (int i = 2; i <= num/2; i++) {
				if (num%i==0) {
					return false;
				}
			}
			
		}return true;
	}

}
