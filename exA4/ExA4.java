import java.util.ArrayList;
import java.util.List;

public class ExA4 {
	public static void main(String [] args) {
		String title = "Python";
		int numberOfDays = 5;
		double pricePerDay = 400.00;
		boolean priorKnowledge = false;
		List<String> instructors = new ArrayList<>();
		double totalPrice = 0.0;
		
		instructors.add("Sandy");
		instructors.add("Marc");
		
//		System.out.println("Everything is ok for " + title + " course, duration " + numberOfDays + " days, at a price of " + pricePerDay + " EUR per day");
		System.out.println("numbers of instructors " + instructors.size());
//		totalPrice = (numberOfDays * pricePerDay)*1.21;
//		System.out.println("Total price of the course " + totalPrice + " EUR");
		
		
		int i=0;
		for (String param:args) {
			System.out.println("arg " + param);
			switch (i) {
				case 0: title = param;
				break;
				case 1: numberOfDays = Integer.parseInt(param);
				break;
				case 2: pricePerDay = Double.parseDouble(param);
				break;
			}
			i++;
		}
		System.out.println("Everything is ok for " + title + " course, duration " + numberOfDays + " days, at a price of " + pricePerDay + " EUR per day");
		totalPrice = (numberOfDays * pricePerDay)*1.21;
		System.out.println("Total price of the course " + totalPrice + " EUR");
	}
}