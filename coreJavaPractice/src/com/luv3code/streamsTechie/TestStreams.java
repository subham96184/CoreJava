package com.luv3code.streamsTechie;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStreams {

	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 30000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));

		// filtring
		productsList.stream().filter(p -> p.getPrice() == 30000f).forEach(p -> System.out.println(p));

		// converting list to map
		Set<String> collect = productsList.stream().map(p -> p.getBrand()).collect(Collectors.toSet());
		// terminal operations collect, set, min , max, forEach

		List<String> stringList = new ArrayList<>();
		stringList.add("one");
		stringList.add("two");
		stringList.add("three");
		stringList.add("one");

		stringList.forEach(t -> {
			System.out.println(t);
		});

		// get max

		Product maxProd = productsList.stream().max((p1, p2) -> p1.getPrice() > p2.getPrice() ? 1 : -1).get();
		System.out.println(maxProd);

		// List of String and you want
		// to convert that to a List of Integer, you can use map()

		List<String> list = Arrays.asList("1", "2", "3");
		List<Integer> intList = list.stream().map(Integer::valueOf).collect(Collectors.toList());
		System.out.println(intList);

		List<String> lines = Arrays.asList("java", "c", "python");

		List<String> result = lines.stream() // convert list to stream
				.filter(line -> !line.equals("c")) // we dont like c
				.collect(Collectors.toList());
		System.out.println(result);
		
		// flat map
		
		List<Integer> evens = Arrays.asList(2, 4, 6);
        List<Integer> odds = Arrays.asList(3, 5, 7);
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11);
            List<List<Integer>> collect2 = Stream.of(evens, odds, primes).collect(Collectors.toList());
            List<Integer> collect3= Stream.of(evens, odds, primes).flatMap(l->l.stream()) .collect(Collectors.toList());
            System.out.println(collect2);
            
            System.out.println(collect3);
            
            // comparator sortinh
            List < String > fruits = new ArrayList < String > ();
            fruits.add("Banana");
            fruits.add("Apple");
            fruits.add("Mango");
            fruits.add("Orange");
            
              List<String> collect4 = fruits.stream().sorted((t1,t2)->t1.compareTo(t2)).collect(Collectors.toList());
              System.out.println(collect4);
              List<String> collect5 = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
              System.out.println(collect5);
              
              // Grouping by function in java8
              
              
              
	}

}
