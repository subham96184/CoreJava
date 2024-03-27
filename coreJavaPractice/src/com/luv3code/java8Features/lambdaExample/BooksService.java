package com.luv3code.java8Features.lambdaExample;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BooksService {

	/*
	 * new Comparator<Book>() {
	 * 
	 * @Override public int compare(Book o1, Book o2) { // TODO Auto-generated
	 * method stub return o2.getName().compareTo(o1.getName()); } });
	 */

	public List<Book> getBooksInSort()
	{
	List<Book> books =new BookDAO().getBooks();
	/*
	 * Collections .sort(books, (o1,o2)->o2.getName().compareTo(o1.getName()));
	 * return books;
	 */
			Collections.sort(books, (o1, o2)->o2.getName().compareTo(o1.getName()));
	return books;
	}

	public static void main(String[] args) {

		BooksService service = new BooksService();
		System.out.println(service.getBooksInSort());
		// BookDAO book=new BookDAO();
		// book.getBooks().forEach(t->System.out.println(t));
	}
}

/*
 * class MyComparator implements Comparator<Book> {
 * 
 * @Override public int compare(Book o1, Book o2) { // TODO Auto-generated
 * method stub return o2.getName().compareTo(o1.getName()); } }
 */
