package Day21;

import java.util.HashMap;
import java.util.Map;
public class hashMapTask3 {
    //13. calculate sum of items,
    //  size of map should be at least 5
    //14. print
    // Apple Lemon Peach Melon Berry
    // 100 200 150 145 250
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 100);
        map.put("Lemon", 200);
        map.put("pomegranate", 500);
        map.put("Banana", 100);
        map.put("Pear ", 200);
        int sum = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            Integer values = entry.getValue();
            sum += values;
        }

        System.out.println("Sum items =" + sum);


        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String keys = entry.getKey();
            System.out.println(keys + " ");
        }


        System.out.println(map.keySet());
        System.out.println(map.values());
    }
}