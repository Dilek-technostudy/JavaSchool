package com.company;

import java.util.Scanner;

public class IfElseTask1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please type your quiz score");
        int quiz = scan.nextInt();
        System.out.println("plese write your midterm score");
        int midterm = scan.nextInt();
        System.out.println("plese write your final score");
        int finals = scan.nextInt();
        int average = (quiz + midterm + finals )/ 3 ;
        System.out.println("Your average score is :" + average);
        if (average >= 90){
            System.out.println("your grade is A");
        }
        else if  (average >= 70){
            System.out.println("your grade is B");
        }
        else if  (average >= 50){
            System.out.println("your grade is C");
        }
        else if (average <=49){
            System.out.println("your grade is D");
        }




    }
}
