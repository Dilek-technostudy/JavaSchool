package Day21;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapTask6 {

    //16. given map, print it like this:
    // Lemon 200
    // Apple 100
    //my approach 2
    //1. use treeMap
    //2. put key in list and value in list
    //3. reverse lists
    //4. print lists
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 100);
        map.put("Lemon", 200);
//      Easy way

        System.out.println("Lemon 200");
        System.out.println("Apple 100");
        System.out.println("--------------------------------");
//      Better Way
        HashMap<String, Integer> map2 = (HashMap<String, Integer>) map.clone();
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());

        }

        System.out.println("----------------------");
        //1. use TreeMap, and reverse it
        TreeMap<String, Integer> t1 = new TreeMap<>(Collections.reverseOrder());
        t1.put("Apple", 100);
        t1.put("Lemon", 200);
        for (Map.Entry m : t1.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

    }
}








