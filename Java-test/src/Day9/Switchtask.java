package Day9;

import java.util.Scanner;

public class Switchtask {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("please write a number of a weekday ");
        int day = scan.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday is a weekday");
                break;
            case 2:
                System.out.println("Tuesday is a weekday");
                break;
            case 3:
                System.out.println("Wednesday is a weekday");
                break;

            case 4:

                System.out.println("Thursday is a weekday");
                break;

            case 5:

                System.out.println("Friday is a weekday");
                break;
            case 6:
                System.out.println("Saturday is  a day ");
                break;
            case 7:
                System.out.println("Sunday is a day" );
                break;
            default:
                    System.out.println("not a weekday");


        }
    }
}