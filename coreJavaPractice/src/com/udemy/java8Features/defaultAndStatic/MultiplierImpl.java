package com.udemy.java8Features.defaultAndStatic;

import java.util.List;

public class MultiplierImpl implements Multiplier{

	@Override
	public int multyply(List<Integer> list) {
		// TODO Auto-generated method stub
		return list.stream().reduce( 1,(x,y)->x*y);

	}

}
