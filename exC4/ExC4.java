package exC4;

import java.util.Scanner;

public class ExC4 {
    public static void main(String[] args) {
        welcome();
    }

    public static void welcome() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome ! ");
        System.out.println("Would you like to be greeted again ? (Y/N)");
        if (userInput.nextLine().equals("Y")) {
            welcome();
        }
    }
}