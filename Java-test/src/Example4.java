import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Example4 {
    public static void main(String[] args) {
        // 4. Write a Java program to test if an array contains a specific value


        int[] arr1 = {1, 2, 4, 10, 6, 0};

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 2) {

                System.out.println("I have that number");
            } else {
                System.out.println("I don't have it");
            }
        }

        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.print(arr1[i]+" ");
        }

    }


    }
