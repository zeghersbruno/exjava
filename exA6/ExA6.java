package exA6;

import java.util.HashMap;
import java.util.Scanner;

public class ExA6 {
    public static void main(String[] args) {
        HashMap<String, Integer> daysInAMonth = new HashMap<String, Integer>();
        daysInAMonth.put("January", 31);
        daysInAMonth.put("February", 28);
        daysInAMonth.put("March", 31);
        daysInAMonth.put("April", 30);
        daysInAMonth.put("May", 31);
        daysInAMonth.put("June", 30);
        daysInAMonth.put("July", 31);
        daysInAMonth.put("August", 31);
        daysInAMonth.put("September", 30);
        daysInAMonth.put("October", 31);
        daysInAMonth.put("November", 30);
        daysInAMonth.put("December", 31);

        Scanner userInput = new Scanner(System.in);
        String nextLine = "";
        int userDay = 0;
        String userMonth = "";
        System.out.println("Enter the month and the day :");
        userMonth = userInput.nextLine();
        userDay = userInput.nextInt();

        userInput.close();
        System.out.println("days " + userDay + " month " + userMonth);
        if (daysInAMonth.get(userMonth) != null) {
            int remainingDays = daysInAMonth.get(userMonth) - userDay;
            System.out.println("days remaining for " + userMonth + " : " + remainingDays);
        }
    }
}
