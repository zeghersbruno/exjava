package exD2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExD2 {
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

        try {
            File myInstructorsFile = new File("C:/Users/bruno/workspace/git/JavaReskilling/GitProjects/exjava/exD1/instructors.txt");
            Scanner myReader = new Scanner(myInstructorsFile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                instructors.add(data);
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred reading instructors.txt");
            e.printStackTrace();
        }


        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the course name ");
        title = userInput.nextLine();
        do {
            System.out.println("Do you need prior knowledge (Y/N) ");
            pK = userInput.nextLine();
        } while (!pK.equals("Y") && !pK.equals("N"));

        if (pK.equals("Y")) {
            priorKnowledge = true;
        } else {
            priorKnowledge = false;
        }
        
        System.out.println("Enter the number of days ");
        numberOfDays = userInput.nextInt();
        System.out.println("Enter the price:");
        pricePerDay = userInput.nextDouble();


        ExD2.printInfo(title, numberOfDays, pricePerDay, priorKnowledge);



    }

    public static void printInfo(String title, int numberOfDays, double pricePerDay, boolean priorKnowledge) {
        System.out.println("Your " + title + " course\n with duration " + numberOfDays + " days\n at a price of " + pricePerDay + " EUR per day");
        System.out.println("This course needs prior knowledge : " + priorKnowledge);
        double totalPrice = calculateTotal(numberOfDays, pricePerDay, priorKnowledge);
        System.out.println("Total price " + totalPrice + "(" + labelTotalPrice(totalPrice) + ")");

        String fileName = "C:\\Users\\bruno\\IdeaProjects\\exjava\\resources\\courseinfo.txt";
        try {
            File myOutputFile = new File(fileName);
            if (myOutputFile.createNewFile()) {
                System.out.println("File created: " + myOutputFile.getName());
            } else {
                System.out.println("File "+fileName+" already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred creating " + fileName);
            e.printStackTrace();
        }
        try {
            FileWriter myWriter = new FileWriter(fileName);
            myWriter.write("Your " + title + " course\n with duration " + numberOfDays + " days\n at a price of " + pricePerDay + " EUR per day");
            myWriter.write("\nThis course needs prior knowledge : " + priorKnowledge);
            myWriter.write("\nTotal price " + totalPrice + "(" + labelTotalPrice(totalPrice) + ")");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred writing to " + fileName);
            e.printStackTrace();
        }
    }

    public static double calculateTotal(int numberOfDays, double pricePerDay, boolean priorKnowledge) {
        double totalPrice;
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
        return totalPrice;
    }

    public static String labelTotalPrice(double totalPrice) {
        String totalLabel;
        if (totalPrice < 500) {
            totalLabel = labelOfCourse.CHEAP.name();
        } else {
            if (totalPrice > 1500) {
                totalLabel = labelOfCourse.EXPENSIVE.name();
            } else {
                totalLabel = labelOfCourse.OK.name();
            }
        }
        return totalLabel;
    }
}
