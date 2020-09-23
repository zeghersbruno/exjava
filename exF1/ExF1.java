import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ExF1 {
    public static void main(String[] args) {
        // Add some courses
        try {
            Course c1 = new Course("java", 28, 200.00, true);
            c1.printInfos();
            Course c2 = new Course("C++", 18, 210.00, true);
            c2.printInfos();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Add some instructors
        try {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            LocalDate iBiDa = LocalDate.parse("20.10.1960", dtf);
            LocalDate iEnDa = LocalDate.parse("03.04.1980", dtf);
            Instructor i1 = new Instructor("Jean", "Pierre", iBiDa, iEnDa, 2000.0);
            System.out.println("Starting age of " + i1.getInstFirstName() + " " + i1.calculateStartingAge());
            System.out.println("Current age of " + i1.getInstFirstName() + " " + i1.calculateAge());
            iBiDa = LocalDate.parse("15.08.1956", dtf);
            iEnDa = LocalDate.parse("03.04.1989", dtf);
            Instructor i2 = new Instructor("Peter", "Frampton", iBiDa, iEnDa, 1500.0);
            System.out.println("Starting age of " + i1.getInstFirstName() + " " + i1.calculateStartingAge());
            System.out.println("Current age of " + i1.getInstFirstName() + " " + i1.calculateAge());
            i2.printSalaryHistory();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
