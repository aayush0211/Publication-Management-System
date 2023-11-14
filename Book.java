package publicationManagementSystem;

import java.time.LocalDate;

public class Book extends Publication {
	private int pageCount;

	public Book(String title, int price, LocalDate pubDate, short rating, int pageCount) {
		super( title, price, pubDate, rating);
		// TODO Auto-generated constructor stub
		this.pageCount = pageCount;
	}

	@Override
	public String toString() {
		return "Book "+super.toString()+" pageCount: "+pageCount;
	}
	
	
	
}
