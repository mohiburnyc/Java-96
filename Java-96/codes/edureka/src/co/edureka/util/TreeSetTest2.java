package co.edureka.util;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest2 {

	public static void main(String[] args) {
		Set<Book> books = new TreeSet<Book>(new BookComparator());
		
		books.add(new Book(234, "Java Reference")); 
		books.add(new Book(123, "Python Reference"));
		books.add(new Book(222, "React Reference"));
		
		System.out.println(books);	
		
		for(Book bk : books) {
			System.out.println(bk);
		}
	}
}

class BookComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		if(o1.getBookId() > o2.getBookId())
			return 1;
		else if(o1.getBookId() < o2.getBookId())
			return -1;
		else
			return 0;
	}
}
