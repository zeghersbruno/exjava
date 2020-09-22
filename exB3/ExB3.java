public class ExB3 {
    public static void main(String[] args) {
        int[] myArray = {19, 5, 8, 9, 3};
        double totalInt = 0.0;
        for (int i=0; i < myArray.length; i++) {
            totalInt = totalInt + myArray[i];
        }
        double arrayAverage = totalInt / myArray.length;
        System.out.println("average " + arrayAverage);
    }
}