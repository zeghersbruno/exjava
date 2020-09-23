import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ExE1 {
    public static void main(String [] args) {
        String instructorFirstName;
        String instructorLastName;

        int instructorAge = 0;
        int instructorSenority = 0;
        double instructorFirstSalary = 0;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate currentDate = LocalDate.now();
        String currentDateFmt = currentDate.format(dtf);
        System.out.println(currentDateFmt);
        int currentYear = Integer.parseInt(currentDateFmt.substring(6));
        int instructorSartingAge=0;
        String instructorEntryDate="";
        String instructorBirthDate="";

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the instructor First Name ");
        instructorFirstName = userInput.nextLine();
        System.out.println("Enter the instructor Last Name ");
        instructorLastName = userInput.nextLine();

        do {
            try {
                System.out.println("Enter the instructor birthdate (dd.MM.yyyy)");
                instructorBirthDate = userInput.nextLine();
                System.out.println(instructorBirthDate);
                instructorAge = currentYear - Integer.parseInt(instructorBirthDate.substring(6));
                System.out.println("Instructor's age " + instructorAge);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (instructorAge==0);
        do {
            try {
                System.out.println("Enter the instructor's service entry date (dd.MM.yyyy)");
                instructorEntryDate = userInput.nextLine();
                System.out.println(instructorEntryDate);
                instructorSartingAge = Integer.parseInt(instructorEntryDate.substring(6)) - Integer.parseInt(instructorBirthDate.substring(6));
                instructorSenority = currentYear - Integer.parseInt(instructorEntryDate.substring(6));
                System.out.println("Instructor's seniority " + instructorSenority);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (instructorSenority==0);
        do {
            try {
                System.out.println("Enter the instructor's salary at the beginning (" + instructorEntryDate + ")");
                instructorFirstSalary = userInput.nextDouble();

            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (instructorFirstSalary==0);
        userInput.close();
        List<String> listLine = new ArrayList<>();
        listLine = printSalaryHistory(instructorFirstName, instructorLastName, instructorAge, instructorSartingAge, instructorFirstSalary);
        String fileName = "C:/Users/bruno/workspace/git/JavaReskilling/GitProjects/exjava/exE1/courseinfo.txt";
        UtilityClass.writeToFile(listLine, fileName);
    }

    public static List<String> printSalaryHistory(String fName, String lName, int currentAge, int startingAge, double startingSalary) {
        List<String> listLine = new ArrayList<>();
        double salary= startingSalary;
        int seniority=0;
        for (int i=startingAge; i<= currentAge;i+=5) {
            seniority = i-startingAge;
            if (seniority<36) {
                System.out.println("Salary of "+ fName+" at " + i + " is " + salary);
                listLine.add("Salary of "+ fName+ "at " + i + " is " + salary + "\n");
                salary *= 1.03;
            } else {
                System.out.println("Maximum salary reached");
                listLine.add("Maximum salary reached");
            }
        }
        return listLine;
    }
}
