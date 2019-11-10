package Day21;

import java.util.HashSet;

public class HashMapTask8 {
    public static void main(String[] args) {

        String str = "BECOME SOFTWARE ENGINEER IN 6 MONTHS";
        System.out.println("\n"+str);
        char [] c=str.toCharArray();

        for(int i=0; i<c.length;i++) {

            System.out.println(str .charAt(i));
        }
        HashSet<Character> mySet = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char aChar = str.charAt(i);
            mySet.add(aChar);
        }
        System.out.println(mySet);

        }

    }

