package Day21;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashMapTask2 {

    //10. Write a Java program to get the
    //          value of a specified key in a map.
    // 11. Write a Java program to get a set view of the keys contained in this map.

    public static void main(String[] args) {


        HashMap<Integer, String> map = new HashMap<>();
        map.put((1), "purple");
        map.put((2), "pink");
        map.put((3), "red");
        map.put((4), "brown");
        map.put((5), "blue");
        System.out.println("At key 1 we have =" + map.get(1));

        Set<Integer > String = map.keySet();
        System.out.println(String);

        System.out.println(map.keySet());

        System.out.println(map.clone());

        System.out.println(map.values());

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            String value = entry.getValue();

            System.out.println("value is " + value);
        }

    }
}
