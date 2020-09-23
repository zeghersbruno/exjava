public class Course {
    private String title;
    private int numberOfDays;
    private double pricePerDay;
    private boolean priorKnowledge;

    public Course(String title, int numberOfDays, double pricePerDay, boolean priorKnowledge) {
        this.title = title;
        this.numberOfDays = numberOfDays;
        this.pricePerDay = pricePerDay;
        this.priorKnowledge = priorKnowledge;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public boolean isPriorKnowledge() {
        return priorKnowledge;
    }

    public void setPriorKnowledge(boolean priorKnowledge) {
        this.priorKnowledge = priorKnowledge;
    }

    public void printInfos() {
        System.out.println("Your " + title + " course\n with duration " + numberOfDays + " days\n at a price of " + pricePerDay + " EUR per day");
        System.out.println("This course needs prior knowledge : " + priorKnowledge);
        double totalPrice = calculateTotal(numberOfDays, pricePerDay, priorKnowledge);
        System.out.println("Total price " + totalPrice + "(" + labelTotalPrice(totalPrice) + ")");
    }

    public double calculateTotal(int numberOfDays, double pricePerDay, boolean priorKnowledge) {
        double totalPrice;
        if (priorKnowledge && numberOfDays > 3) {
            totalPrice = (numberOfDays * pricePerDay);
            System.out.println("You've got a best price without VAT !");
        } else {
            totalPrice = (numberOfDays * pricePerDay) * 1.21;
        }
        return totalPrice;
    }

    public String labelTotalPrice(double totalPrice) {
        String totalLabel;
        if (totalPrice < 500) {
            totalLabel = LabelOfCourse.CHEAP.name();
        } else {
            if (totalPrice > 1500) {
                totalLabel = LabelOfCourse.EXPENSIVE.name();
            } else {
                totalLabel = LabelOfCourse.OK.name();
            }
        }
        return totalLabel;
    }
}