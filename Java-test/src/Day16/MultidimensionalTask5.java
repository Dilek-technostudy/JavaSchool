package Day16;

import java.util.Random;

public class MultidimensionalTask5 {

    public static void main(String[] args) {
//            int[]a ={1, 2,3, 4, 5, 6};
//            int counter =0;
//       for (int i = 0; i < a.length; i++) {
//            if (a[i] % 2 == 0) {
//                counter++;
//            }
//        }
//
//        System.out.println("there are  " + counter + "     even numbers in the array");


            // 1. Return the number of even ints in the given array.
            // {1,2,3,4,5,6} => 3
            // Hint: you need to count "even numbers"

                Random rand = new Random();

                int[] arr = new int[10];
                int evenCounter = 0;
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = rand.nextInt(20);
                }

                for (int n : arr) {
                    System.out.println("  it is an number " + n);
                }


                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] % 2 == 0) {
                        evenCounter++;
                    }
                }

                System.out.println("you have " + evenCounter + " even numbers");
            }
        }


