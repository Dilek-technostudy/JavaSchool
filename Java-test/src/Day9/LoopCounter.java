package Day9;

import java.util.Scanner;

public class LoopCounter {
    public static void main(String[] args) {
        int counter= 0;
        int sum =0;
        for (int i = 1; i <=100 ; i=i+3) {
            System.out.println(i);
            counter=counter+1;
            sum+=i;
        }
        System.out.println("counter is "+ counter);
        System.out.println("Sum is here " + sum);
        System.out.println((double)sum/counter);


        System.out.println("--------------------------------");

        Scanner scan =new Scanner(System.in);
        System.out.println("Provide a number  ");
        int max=scan.nextInt();
        int total=0;
        int c =0;
        for (int i = 0; i < max; i++) {
            System.out.println(i);
            sum+=i;
            c++;

        }
        System.out.println("sum is :"+total);
        System.out.println("average is : "+ (double)sum/c);




    }
}
