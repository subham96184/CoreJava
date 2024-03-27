package com.udemy.java8Features.streamsAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);

/*		List<Integer> sortedList = list.stream()
		      .sorted( (i1, i2) -> i1.compareTo(i2) )
		      .collect(Collectors.toList()); */
		List<Integer> sortedList = list.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());

		System.out.println(sortedList);
                  List<Integer> collect = list.stream()
                  .sorted(Comparator.naturalOrder()).collect(Collectors.toList());
                  System.out.println(collect);
                  
					List<String> list2 = Arrays.asList("A", "B", "C", "D");

					Optional<String> result2 = list2.stream().findAny();
					System.out.println(result2.isPresent());
					System.out.println(result2);
				}

}
