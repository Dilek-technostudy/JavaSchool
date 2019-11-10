package Day21;

import java.util.HashMap;

public class IncrementValueTask {

    // Given map, update map values each time of iteration

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "b");


        for (int i = 0; i < 3; i++) {

            String value = map.get("A");
            map.put("A", value + "b");
            System.out.println(map);
        }
        //output:
        // ["A", 0]
        // ["A", 1]
        // ["A", 2]
        System.out.println("----------------------------------");


        HashMap<Character, Integer> map1 = new HashMap<>();
        String sentence = "ABC";
        char[] chars = sentence.toCharArray();
        //sentence.toCharArray() => ['A', 'B',' C']
        for (char c : chars) {
            map1.put(c, 0);

        }
        System.out.println(map1);


    }
}
