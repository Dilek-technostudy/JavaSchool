package Day21;

import java.util.Random;

public class Homework1 {
    public static void main(String[] args) {
        int[][] examResult = {
                {100, 100, 100},
                {100, 100, 100, 100, 100}
        };
        Random rnd =  new Random();
        for (int row = 0; row < examResult.length; row++) {
            for (int col = 0; col <examResult[row].length ; col++) {

                examResult[row][col]= rnd.nextInt(100);
                System.out.print (examResult[row][col ]+ "  ");
            }
            System.out.println();
        }



        }

        }


