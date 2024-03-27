package com.luv3code.streamsTechie;

public class GHY {

	public static void main(String[] args) {
		System.out.println(100+100+"data");
		System.out.println("data"+100+100+20);
		String s1= new String("subham");
		String s2= new String("subham");
        System.out.println(s1==s2);
        String s3=s1.intern();
        System.out.println(s3);
        System.out.println(s1==s3);
        
        
        String r1="subham";
        String r2="subham";
        System.out.println(r1.equals(r2));
        
        System.out.println(r1==r2);
        
        StringBuilder w1 = new StringBuilder("Hello");    //String 1  
        StringBuilder w2 = new StringBuilder(" World");    //String 2  
        StringBuilder e = w1.append(w2);   //String 3 to store the result  
            System.out.println(e);  //Displays result  
	}
}
