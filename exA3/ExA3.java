package exA3;

import java.util.ArrayList;
import java.util.List;

public class ExA3 {
	public static void main(String [] args) {
		String title = "Python";
		int numberOfDays = 5;
		double pricePerDay = 400.00;
		boolean priorKnowledge = false;
		List<String> instructors = new ArrayList<>();
		double totalPrice = 0.0;
		
		instructors.add("Sandy");
		instructors.add("Marc");
		
		System.out.println("Everything is ok for " + title + " course, duration " + numberOfDays + " days, at a price of " + pricePerDay + " EUR per day");
		System.out.println("numbers of instructors " + instructors.size());
		
		totalPrice = numberOfDays * pricePerDay*1.21;
		System.out.println("Total price of the course " + totalPrice + " EUR");
	}
}