public class PracticeTask5 {

    // Write a Java program to find the second largest element in an array.
    // {1, 34, 66, 1000, 23, 4, 7, 9} => 66
    public static void main(String[] args) {

        int[] a = {1, 1000, 34, 66};
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MAX_VALUE;
        for (int num : a) {
            if (num > max) {
                max2 = max;
                max = num;
            } else if (num > max2) {
                max2 = num;
            }
        }
        System.out.println(max);
        System.out.println(max2);
    }
}



