package com.luv3code.java8Features.mapAndFlatterMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDAO {

	public static List<Customer> getAll()
	{
		return Stream.of(
				new Customer(100, "subham", "subbham@gmail.ocm", Arrays.asList("9684315")),
				new Customer(102, "mamny", "many@gmail.ocm", Arrays.asList("7846182")),
				new Customer(104, "johny", "johny@gmail.ocm", Arrays.asList("7846281")),
				new Customer(105, "danue", "danue@gmail.ocm", Arrays.asList("5413285"))
				)
				.collect(Collectors.toList());
    }
}