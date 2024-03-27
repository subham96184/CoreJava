package com.luv3code.java8Features.consumer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("suam");
		list.add("haorih");
		list.add("shamm");
		list.add("kuriay");
		list.add("jurya");

		for(String s:list)
		{
			System.out.println(s);
		}
	//	list.forEach((t)->System.out.println(t));
		//list.stream().filter(t->t.startsWith("s")).forEach(t->System.out.println(t));
		
		Map<Integer, String> map=new HashMap<>();
		map.put(1, "A");
		map.put(3, "B");
		map.put(5, "A");
		map.put(8, "B");
		//map.forEach((key,value)->System.out.println(key + " "+ value));
		//map.entrySet().stream().forEach(obj->System.out.println(obj));
		map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(obj->System.out.println(obj));
	}

}
