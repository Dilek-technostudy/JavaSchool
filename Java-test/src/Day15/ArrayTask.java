package Day15;

import java.util.Scanner;

public class ArrayTask {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int[]arr =new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("provide a number :");
            arr[i]=scan.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "   ");
         }
        System.out.println("                              ");
        System.out.println("---------reverse--------------");
        for (int i = arr.length-1; i>=0; i--) {
            System.out.print(arr[i] +"  ");

        }
        }
    }

