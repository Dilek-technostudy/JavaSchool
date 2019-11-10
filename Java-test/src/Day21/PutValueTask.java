package Day21;

import java.util.HashMap;

public class PutValueTask {
    public static void main(String[] args) {


        String[] names = {"Max", "Drake", "Susan"};
        HashMap<String, Integer> map = new HashMap<>();
        for (String c : names) {
            map.put(c, 0);

            //output:
            //{"Max"=0,"Drake"=0,"Susan"=0}
        }

        System.out.println(map);
        System.out.println("                     ");

        String[] firstNames = {"Max", "Drake", "Susan"};
        String[] lastNames = {"Smith", "Jones", "Miller"};

        HashMap<String, String > map1 = new HashMap<>();
        for (int i = 0; i< firstNames.length; i++) {
            System.out.println(firstNames[i]+ lastNames[i]);

            String key = firstNames[i];
            String value = lastNames[i];
            map1.put(key, value);
            }
            System.out.println(map1);

            //output:
            //{Max=Smith,Drake=Jones,Susan=Miller}

        }
    }
