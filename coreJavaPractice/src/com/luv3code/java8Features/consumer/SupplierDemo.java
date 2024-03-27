package com.luv3code.java8Features.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		
		  Supplier<String> supplier=()->"hii imm string";
		  System.out.println(supplier.get());
		 
		List<String> list=Arrays.asList();
		List<String> list1=Arrays.asList("b", "d");
		System.out.println(list1.stream().findAny().orElseGet(()->"hii"));
	}
}
