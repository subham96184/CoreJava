package com.luv3code.streamsTechie;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringOpsStreams {

	public static void main(String[] args) {
		String string = "ilovetechie";
		String[] split = string.split("");
		Map<String, List<String>> collect = Arrays.stream(split).collect(Collectors.groupingBy(t->t));
		System.out.println(collect);
		Map<String, Long> collect2 = Arrays.stream(split).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect2);
		List<Entry<String, Long>> collect3 = collect2.entrySet().stream().filter(t->t.getValue()==1).collect(Collectors.toList());
		System.out.println(collect3);
	}

}
