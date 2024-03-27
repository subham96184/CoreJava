package com.udemy.java8Features.methodReference;

interface Sayable{  
    void say();  
}  
public class MethodReference {  
    public static void saySomething(){  
        System.out.println("Hello, this is static method.");  
    }  
    public static void main(String[] args) {  
        // Referring static method  
        Sayable sayable = MethodReference::saySomething;  
        // Calling interface method  
    	 
    	//Sayable sayable=()->System.out.println("sys some");
    	
        sayable.say();  
    }  
}  