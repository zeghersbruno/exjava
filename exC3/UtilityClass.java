public class UtilityClass {
    public static double average(int[] arrayInt) {
        double totalInt=0;
        for (int i:arrayInt) {
            totalInt+=i;
        }
        if (arrayInt.length == 0) return 0;
        return totalInt/arrayInt.length;
    }
}