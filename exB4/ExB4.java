package exB4;

import java.util.Scanner;

public class ExB4 {

    public static void main(String[] args) {

        String lCode;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a language Code ");
        lCode = userInput.nextLine();
        switch (lCode) {
            case "NL":
                System.out.println("Goeiedag !");
                break;
            case "FR":
                System.out.println("Bonjour !");
                break;
            case "EN":
                System.out.println("Good Day !");
                break;
            default:
                System.out.println("Asta Luego !");
                break;
        }
    }
}
