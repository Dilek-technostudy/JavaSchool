package Day21;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
//1. Write a Java program to append the specified
// element to the end of a hash set.
// ex: [1, 2 , 3] you add 10 => [1, 2, 3, 10]

//part 2. add number 5, five times

public class JavaSetEx2 {
    public static void main(String[] args) {
        ArrayList<Integer> listNumbers = new ArrayList<>();
        listNumbers.add(1);
        listNumbers.add(2);
        listNumbers.add(3);
        System.out.println(listNumbers);

        System.out.println("HashSet------------------------");
        HashSet<Integer> setNumbers = new HashSet<>();
        setNumbers.add(1);
        setNumbers.add(2);
        setNumbers.add(3);
        setNumbers.add(10);
        System.out.println(setNumbers);
        for (int i = 0; i < 5; i++) {
            setNumbers.add(5);
        }

        for (Integer setNumber : setNumbers) {
            System.out.println(setNumber);
        }
        Iterator<Integer> iterator = setNumbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.println(number);
        }
    }
}
