package Day16;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
//        int i =1;
//        while(i<=5){
//            System.out.println(i);
//            i++;
//        }
        Scanner scan = new Scanner(System.in);
        System.out.println("write a string");
        String s = scan.nextLine();
        while (!s.equals("quit")) {
            System.out.println("write a string  :");
            s = scan.nextLine();
        }

    }
}
