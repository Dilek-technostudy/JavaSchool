import java.util.Arrays;

public class Practicetask6 {
    // Given an array of ints,
    // print true if it contains no 1's or it contains no 4's.
    // {1,2,3} => true
    // {2,3,4} => true
    // {1,2,4} => false

    public static void main(String[] args) {

//         for (int i = 0; i < a.length; i++) {
//
//            if (a[i] == 1 || a[i] == 4) {
//
//                System.out.println("It is true  ");
//            } else if (a[i] == 1 && a[i] == 4) {
//                System.out.println("false");
//            }
//
//        }

//            for(int b: a){
//            if (b!=4){
//                System.out.println(("true "+ Arrays.toString(a)));
//                break;
        int[] a = {1, 2, 3};
        boolean one = false;
        boolean four = false;
        for (int number : a) {
            if (number == 1) {
                one = true;
            } else if (number == 4) {
                four = true;
            }
        }
                if (one && four) {
                    System.out.println(false);
                } else {
                    System.out.println(true);

                }

            }
        }


