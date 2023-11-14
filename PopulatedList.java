package utilty;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Map;

import publicationManagementSystem.Book;
import publicationManagementSystem.Publication;
import publicationManagementSystem.Tape;

public class PopulatedList {
	public static Map<String ,Publication> populatedMap(Map<String ,Publication> list)
	{
		list.put("Geeta" , new Book("Geeta",1000,LocalDate.parse("2023-02-01"),(short) 8,1000));
		list.put("Mahabharat" , new Book("Mahabharat",500,LocalDate.parse("2017-02-01"),(short) 6, 5100));
		list.put("Bhagwat" , new Book("Bhagwat",1000,LocalDate.parse("2021-02-01"),(short) 10,200));
		list.put("Panchtantra" , new Tape("Panchtantra",500,LocalDate.parse("2016-02-01"),(short) 8,Duration.ofMinutes(150)));
		list.put("Vetal" , new Tape("Vetal",200,LocalDate.parse("2016-02-01"),(short) 9,Duration.ofMinutes(100)));
	//	list.put("Geeta " , new Book("Geeta",1000,LocalDate.parse("2023-02-01"),(short) 8,1000));
	//	list.put("Geeta " , new Book("Geeta",1000,LocalDate.parse("2023-02-01"),(short) 8,1000));
		
		return list;
		
	}
}
