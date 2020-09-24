package exC1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExC1 {
    enum labelOfCourse {
        CHEAP,
        OK,
        EXPENSIVE;
    }

    public static void main(String [] args) {
        String title = "";
        int numberOfDays = 0;
        double pricePerDay = 00.00;
        boolean priorKnowledge = false;
        String pK = "";
        List<String> instructors = new ArrayList<>();
        double totalPrice = 0.0;

        instructors.add("Sandy");
        instructors.add("Marc");


        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the course name ");
        title = userInput.nextLine();
        System.out.println("Do you need prior knowledge (Y/N) ");
        pK = userInput.nextLine();
        System.out.println("Enter the number of days ");
        numberOfDays = userInput.nextInt();
        System.out.println("Enter the price:");
        pricePerDay = userInput.nextDouble();

        if (pK.equals("Y")) {
            priorKnowledge = true;
        } else {
            priorKnowledge = false;
        }

//        System.out.println("Everything is ok for " + title + " course\n duration " + numberOfDays + " days\n at a price of " + pricePerDay + " EUR per day");
        printInfo(title, numberOfDays, pricePerDay, priorKnowledge);
        if (priorKnowledge && numberOfDays > 3) {
            totalPrice = (numberOfDays * pricePerDay);
            System.out.println("You've got a best price !");
        } else {
            totalPrice = (numberOfDays * pricePerDay) * 1.21;
        }
        String totalLabel = "";
        if (totalPrice < 500) {
            totalLabel = labelOfCourse.CHEAP.name();
        } else {
            if (totalPrice > 1500) {
                totalLabel = labelOfCourse.EXPENSIVE.name();
            } else {
                totalLabel = labelOfCourse.OK.name();
            }
        }

        System.out.println("Total price of the course " + totalPrice + " EUR " + "(" + totalLabel + ")");
    }

    public static void printInfo(String title, int numberOfDays, double pricePerDay, boolean priorKnowledge) {
        System.out.println("Your " + title + " course\n with duration " + numberOfDays + " days\n at a price of " + pricePerDay + " EUR per day");
        System.out.println("This course needs prior knowledge : " + priorKnowledge);
    }
}
