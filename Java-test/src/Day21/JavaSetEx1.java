package Day21;

import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
public class JavaSetEx1 {

    public static void main(String[] args) {


        System.out.println("ArrayList------------------------");
        ArrayList<Integer> listNumbers = new ArrayList<>();
        listNumbers.add(1);
        listNumbers.add(1);
        listNumbers.add(1);
        System.out.println(listNumbers);

        System.out.println("HashSet------------------------");
        Set<Integer> setNumbers = new HashSet<>();
        setNumbers.add(1);
        setNumbers.add(1);
        setNumbers.add(1);
        System.out.println(setNumbers);

        System.out.println("ArrayList------------------------");
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Max");
        myList.add("Max");
        System.out.println(myList);

        System.out.println("HashSet------------------------");
        Set<String> mySet = new HashSet<>();
        mySet.add("Ali");
        mySet.add("Max");
        mySet.add("Max");
        System.out.println(mySet);
    }
}




