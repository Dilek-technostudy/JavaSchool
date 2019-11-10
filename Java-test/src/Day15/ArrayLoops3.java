package Day15;

import java.util.Random;

public class ArrayLoops3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[30];
        for (int num = 0;num < array.length;num++){

            array[num] = (int)(Math.random()*100);
            System.out.println(array[num]);
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum is: " +sum);

        double average = (double) sum / array.length;
        System.out.println("\nAverage:  " + average);


    }

    public static class ArrayTask1 {
        public static void main(String[] args) {

           Random rnd = new Random();
           int [] arr = new int[10];
            int sum = 0 ;
            for (int i = 0; i < arr.length  ; i++) {
                arr[i] = rnd.nextInt(50);
                System.out.print(arr[i] + "   ");
                sum+=arr[i];
            }
            System.out.println("              ");
            System.out.println("sum  "+ sum);
            double average = (double) sum/arr.length;
            System.out.println("average  "+average);

        }
    }
}
