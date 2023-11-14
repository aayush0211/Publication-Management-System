package publicationManagementSystem;

import java.time.LocalDate;

public class Publication implements Comparable<Publication>{
	private static int cnt=0;
	private int id;
	private String title;//primary key
	private int price;
	private LocalDate pubDate;
	private Short rating;
	
	public Publication( String title, int price, LocalDate pubDate, short rating) {
		super();
		this.id = ++cnt;
		this.title = title;
		this.price = price;
		this.pubDate = pubDate;
		this.rating = rating;
	}

	public Publication(String title) {
		super();
		this.title = title;
	}
	
	public Short getRating() {
		return rating;
	}

	public void setRating(Short rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Publication Details [ id: "+id +" title : "+title+" price : "+price+"INR publish date : "+pubDate+" rating : "+rating ;
	}
	public LocalDate getDate() {
		return pubDate;
	}
	@Override
	public boolean equals(Object o) {
		if(o instanceof Publication) {
			Publication p = (Publication)o;
			return title.equals(p.title);
		}
	return false;
	}
	
	@Override
	public int compareTo(Publication anotherPublication) {
		return anotherPublication.rating.compareTo(rating);
	}
		
}
