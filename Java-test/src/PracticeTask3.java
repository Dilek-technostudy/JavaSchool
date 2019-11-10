public class PracticeTask3 {
    //       Write a Java program to find the largest element in an array.
//       {1,34,66,1000,23,4,7,9} => 1000
    public static void main(String[] args) {

        int[] arr = {1, 34, 66, 1000, 23, 4, 7, 9};
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
            System.out.println(max);

        }
//        int min1 = Integer.MAX_VALUE;
//        for (int n : arr) {
//            if (n < min1) {
//                min1 = n;
//            }
//        }
//        System.out.println(min1);


    }



