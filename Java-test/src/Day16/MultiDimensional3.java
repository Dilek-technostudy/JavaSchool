package Day16;

import java.util.Random;

public class MultiDimensional3 {
    //TODO Using 2D Array fill the table of exam
// exam is provided with percentages 0-100%
//              JAVA  Math  English
//    Max      ???      ???       ???
//    Bayram  ???      ???       ???

    ///part1. give number

    public static void main(String[] args) {
        int[][] grades = {
                {70, 95, 80},
                {68, 87, 92}
        };
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {

                System.out.print(grades[i][j] + " ");
            }
            System.out.println("    ");
        }
        System.out.println("----------------------------");

        int[][] examResult = {
                {100, 100, 100},
                {100, 100, 100, 100, 100}
        };
        //part2
        System.out.println("Length: " + examResult[0].length);
        Random random = new Random();
        for (int row = 0; row < examResult.length; row++) {
            for (int col = 0; col < examResult[row].length; col++) {
                //part2.1
                examResult[row][col] = random.nextInt(100);
                System.out.println(examResult[row][col] + " ");
            }
            System.out.println();
        }
        int i1 = 5;

        int i2 = 10;

        int i3 = i1+i2;

        System.out.println(i3);
    }

}
