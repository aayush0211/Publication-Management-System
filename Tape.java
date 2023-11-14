package publicationManagementSystem;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class Tape extends Publication{
          
          private Duration mins;

		public Tape( String title, int price, LocalDate pubDate, short rating,Duration t) {
			super(title, price, pubDate, rating);
			// TODO Auto-generated constructor stub
			this.mins=t;
		}

		@Override
		public String toString() {    
			return "Tape "+super.toString()+"Tape : mins=" + mins + "]";
		}
		
           
}
