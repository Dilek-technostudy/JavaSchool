package Day21;

import java.util.HashSet;
import java.util.Set;

public class JavaSetEx4 {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(10);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);


        int setSize =numbers.size();
        Integer [] array = new Integer[numbers.size()];
        numbers.toArray(array);
        System.out.println("New ARRAYS ELENMENTS ");


        for (Integer elements : array) {
            System.out.println(elements);
        }
    }
}
