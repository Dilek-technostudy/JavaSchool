package Day21;

import java.util.HashMap;

public class HashMapTask7 {

    //17. Given map, update the values
    // Apple 333
    // Lemon 444
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 100);
        map.put("Lemon", 200);
        System.out.println(map);
        map.put("Apple", 333);
        map.put("Lemon", 444);
        System.out.println(map);


        if (map.containsKey("Apple")){
            map.put("Apple", 500);

        }
        System.out.println(map);

    }
}







