package tester;

import java.util.Comparator;

import publicationManagementSystem.Publication;

public class SortDate implements Comparator<Publication>{
@Override
public int compare(Publication p1,Publication p2) {
	return p2.getDate().compareTo(p1.getDate());
}
}
