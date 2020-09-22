import java.util.Scanner;

public class ExB5 {
    public static void main(String[] args) {

        String answer = "N";
        Scanner userInput = new Scanner(System.in);
        do {
            System.out.println("Welcome ! ");
            System.out.println("Would you like to be greeted again ? (Y/N)");
            answer = userInput.nextLine();
        } while (answer.equals("Y"));
    }
}
