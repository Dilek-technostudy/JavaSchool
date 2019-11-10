package Day9;

import java.util.Scanner;

public class TaskDay10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Provide min number : ");
        int min = scan.nextInt();
        System.out.println("provide max number : ");
        int max = scan.nextInt();

        for (int i = min; i <= max; i++) {
            if (i % 2 == 0) {
                System.out.println(i);


                }
            }

        }
    }





