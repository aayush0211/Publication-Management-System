package utilty;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

import publicationManagementSystem.Book;
import publicationManagementSystem.Publication;
import publicationManagementSystem.Tape;
import tester.SortDate;

public class PublicationValidationRule {
            public static LocalDate validDate(String date)throws IllegalArgumentException {
            	LocalDate validDate=LocalDate.parse(date);
            	return validDate;
            }
            public static Duration validTime(String time) {
            	Duration validTime = Duration.parse(time);
            	return validTime;
            }
            public static Publication allInputBookCheck(String title,int price,String date,short rating,int pageCount) {
            	LocalDate pubDate=validDate(date);
            	return new Book(title,price,pubDate,rating,pageCount);
            }
            
            public static Publication allInputTapeCheck(String title,int price,String date,short rating,String mins) {
           		Duration validTime = validTime(mins);
           		LocalDate pubDate=validDate(date);
            		return new Tape(title,price,pubDate,rating,validTime);
            }
            //we can also use this validation
            
//            public static List<Publication> checkCurrentYear(Map<String, Publication> publications) {
//            		TreeSet<Publication> sets = new TreeSet<>(new SortDate());
//            		List<Publication> years = new ArrayList<>();
//            		sets.addAll(publications.values());
//            		for(Publication p: sets) {
//            			if(p.getDate().getYear()==2023) {
//            				years.add(p);
//            			}
//            		}
//            	return years;
//            }
}
