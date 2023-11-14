package tester;

import java.time.LocalDate;
import java.time.Period;
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Collections;
import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
import java.util.Scanner;
//import java.util.stream.Collectors;

import static utilty.PublicationValidationRule.*;

import publicationManagementSystem.Publication;
import utilty.PopulatedList;

public class PublicationManagement {

	public static void main(String[] args) {
	
		try (Scanner sc = new Scanner(System.in)) {
			HashMap<String, Publication> publicationList = new HashMap<>();
			boolean exit = false;
			PopulatedList.populatedMap(publicationList);
			while (!exit) {

				System.out.println("Enter choice: \n 1)Publish NeW Book\n2)Publish New Tape \n "
						+ "3)List all books publications order by publish date in desc\n"
						+ "4)List Top 5 Publication of Current year based on Ratings \n "
						+ "5) Remove all Publications which are 5 Years old\n 0)Exit");
				try {
					switch (sc.nextInt()) {

					case 1:
						System.out.println("Enter Book details as follows :title, price, pubDate, rating, pageCount ");
						String name = sc.next();
						if (publicationList.putIfAbsent(name,
								allInputBookCheck(name, sc.nextInt(), sc.next(), sc.nextShort(), sc.nextInt())) == null)
							System.out.println("Successfully Published");
						else {
							throw new PublicationException("Already Published");
						}

						break;
					case 2:
						System.out.println(
								"Enter Tape details as follows :title, price, pubDate, rating, Time Duration(hh:mm:ss) ");
						name = sc.next();
						if (publicationList.putIfAbsent(name,
								allInputTapeCheck(name, sc.nextInt(), sc.next(), sc.nextShort(), sc.next())) == null) {
							System.out.println("Successfully Published");
						} else {
							throw new PublicationException("Already Published");
						}
						break;
					case 3:// List<Publication>listPublication =new ArrayList<>( publicationList.values());
//					       Collections.sort( listPublication,new SortDate());
//					        for(Publication c : listPublication) {
//					        	System.out.println(c);
//					        }
						System.out.println("Details in Descending order of Publish Date");
						publicationList.values().stream().sorted((p1, p2) -> p2.getDate().compareTo(p1.getDate()))
								.forEach(p -> System.out.println(p));
						break;
					case 4:
						System.out.println("Top 5 Publications of Current year a/c its ratings");
						 publicationList.values().stream()
								.filter(p -> p.getDate().getYear() == 2023)
								.sorted((p1, p2) -> p2.getRating().compareTo(p1.getRating()))
								//.collect(Collectors.toList()); // use this for collect result as list
								.limit(5).forEach(p-> System.out.println(p));


						break;
						
					case 5:
						publicationList.values()
								.removeIf(p -> Period.between(p.getDate(), LocalDate.now()).getYears() >= 5);
						System.out.println("Modified List is ");
						publicationList.forEach((k, v) -> System.out.println(v));
						break;
					case 0:
						System.out.println("Thank You!!!!!!!!!!!!!!");
						exit = true;
						break;
					}
				}

				catch (Exception e) {
					System.out.println("Catch-all");
					e.printStackTrace();
				}
			}
		}
	}

}
