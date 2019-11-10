package Day21;

import java.util.HashMap;
import java.util.Map;

public class hashMaptask1 {
    public static void main(String[] args) {


        HashMap<Integer, String> map = new HashMap<>();
        map.put((1), "purple");
        map.put((2), "pink");
        map.put((3), "red");
        map.put((4), "brown");
        map.put((5), "blue");

        System.out.println("size =" + map.size());
        System.out.println("map1: " + map);
        HashMap<Integer, String> map2 = new HashMap<>(map);

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
                Integer key = entry.getKey();
            String value = entry.getValue();
            map2.put(key, value);
        }
        System.out.println("map 2: " + map2);

         int key = 3 ;
         if  (map.containsKey(key)){
            System.out.println( "value is :    "  + map.get(key));
         }else {
             System.out.println("no we dont have");
         }
//        map.clear();
//        System.out.println("Size of map is: " + map.size());

        if (map.isEmpty()) {
            System.out.println("it is empty");
        } else {
            System.out.println("it is not empty");
        }
        for (Map.Entry<Integer,String>entry :map.entrySet()){
            Integer entryKey = entry.getKey();
            String entryValue = entry.getValue();

            if (entryValue.equals("blue")) {
                System.out.println("key is:" + entryKey);
            }
        }
    }
}
