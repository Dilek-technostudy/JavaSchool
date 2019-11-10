package Day21;

import java.util.HashMap;

public class PutValueTask1 {

    // put letters as keys into your HashMap,
    // put value = 0
    public static void main(String[] args) {
//        String sentence = "hello";
        //{h=0,e=0,l=0,o=0}

//        HashMap<Character,Integer> s=new HashMap<>();
//        String sentence  = "hello";
//        char[] ch= sentence.toCharArray();
//
//        for(char c:ch) {
//
//            s.put(c,0);
//        }
//        System.out.println(s);
//
//
//        System.out.println("------------------------------");

        HashMap<Character, Integer> letterMap = new HashMap<>();
        String sentence ="hello";
        char[] sentenceArray = sentence.toCharArray();
        for (char letter : sentenceArray) {
            if(letter == 'h') {
                letterMap.put(letter, 0);
            }
        }

        System.out.println(letterMap);
        // {h=0}
    }

}
