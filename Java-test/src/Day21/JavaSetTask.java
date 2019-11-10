package Day21;

import java.util.ArrayList;
import java.util.Random;
import java.util.HashSet;
public class JavaSetTask {
    //15. Populate you hash set with random numbers
    //    you hashSet size <= 100
    //    random numbers must be between 0-50
    //add random number to Set 100 times
    public static void main(String[] args) {
        // Hint:
        // 1. create set
        // 2. iterate 100 times
        // 3. add number to set
        Random rand = new Random();

        HashSet <Integer> mySet = new HashSet<>();
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            int randomNumber = rand.nextInt(5); // 0 1 2 3 4

            mySet.add(randomNumber);
            myList.add(randomNumber);
        }

        System.out.println("myList: " + myList);
        System.out.println("mySet: " + mySet);
    }
}
