package com.udemy.java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeAndDeclarative2 {

	public static void main(String[] args) {
		
     List<Integer> intList=Arrays.asList(1,2,4,6,7);
     
     List<Integer> uniqueList=new ArrayList<>();
     
     for(Integer integer: intList)
     {
    	 if(!uniqueList.contains(integer))
    	 {
    		 uniqueList.add(integer);
    	 }
     }
     
     System.out.println(uniqueList);
     
	 List<Integer> newList=	intList.stream().distinct().collect(Collectors.toList());
	 System.out.println(newList);
	}

}
