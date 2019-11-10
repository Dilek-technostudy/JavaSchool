package com.company;

import java.util.Scanner;

public class Main {

    public  static void  main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("provide a grade");
        String grade = scan.nextLine();

        if (grade.equals("A")) {
            System.out.println("Excellent");
        } else if ("B".equals(grade) || "B+".equals(grade)){
            System.out.println("Good");
        } else if (grade.equals("C")) {
            System.out.println("Middle");
        } else if (grade.equals("D")) {
            System.out.println("pass");
        } else if (grade.equals("F")) {
            System.out.println("fail");
        } else {
            System.out.println("invalid grade");
        }
    }


}

