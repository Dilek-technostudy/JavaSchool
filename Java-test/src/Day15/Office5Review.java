package Day15;

import java.util.Random;

public class Office5Review {
    public static void main(String[] args) {

        Random rnd = new Random();
        int num1 = rnd.nextInt(30);
        System.out.println("1.Random number is here " + num1);
        int num2 = rnd.nextInt(30);
        System.out.println("2.Random number is here " + num2);
        int num3 = rnd.nextInt(30);
        System.out.println("3.Random number is here " + num3);

        int sum = num1 + num2 + num3 ;
        System.out.println("sum is here :"  + sum);



        int total=0;
        for (int i = 1; i < 3; i++) {
            int num4 = rnd.nextInt(30);
            total= total +num4 ;
            System.out.println("total is here  "+ total);



        }


    }
}
