import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExA5 {
	public static void main(String [] args) {
		String title = "Python";
		int numberOfDays = 5;
		double pricePerDay = 400.00;
		boolean priorKnowledge = false;
		List<String> instructors = new ArrayList<>();
		double totalPrice = 0.0;
		
		instructors.add("Sandy");
		instructors.add("Marc");
		
	
	    Scanner userInput = new Scanner(System.in);

	    System.out.println("Enter the course name, number of days and price:");

	    title = userInput.nextLine();
	    numberOfDays = userInput.nextInt();
	    pricePerDay = userInput.nextDouble();
	    
		System.out.println("Everything is ok for " + title + " course, duration " + numberOfDays + " days, at a price of " + pricePerDay + " EUR per day");
		totalPrice = (numberOfDays * pricePerDay)*1.21;
		System.out.println("Total price of the course " + totalPrice + " EUR");
	}
}