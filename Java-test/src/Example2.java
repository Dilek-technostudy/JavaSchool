import java.lang.reflect.Array;
import java.util.Arrays;

public class Example2 {
    public static void main(String[] args) {

        //Write a Java program to sort a numeric array and a string array.

        int[] numbers = {1, 2, 4, 10, 2, 0};
        String[] names = {"Zeynep ", "Serkan", "Hakan"};
        System.out.println("first Array " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println("First String array : " + Arrays.toString(names));
        Arrays.sort(names);
        System.out.println("Sorted String array : " + Arrays.toString(names));

// 2. Write a Java program to sum values of an array.

        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        System.out.println(sum);
        }
    }
