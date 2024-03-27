package com.luv3code.java8Features.lambdaExample;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

	public List<Book> getBooks()
	{
		List<Book> books=new ArrayList<>();
		books.add(new Book(100, "stoicism", 153));
		books.add(new Book(101, "meditations", 100));
		books.add(new Book(100,"be the one", 140));
		return books;
	
	}
	
}

