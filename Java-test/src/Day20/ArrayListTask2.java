package Day20;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTask2 {
    //4. Write a Java program to retrieve an element
    // (at a specified index) from a given array list.


    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("White");
        colors.add("Black");
        colors.add("Green");
        System.out.println(colors);

        System.out.println(colors.get(2));

        colors.set(2, "Blue");
        System.out.println(colors);
        // print third element in arrayList

        colors.remove("Green");
        System.out.println(colors);

        if (colors.contains("Red")) {
            System.out.println("Found ");
        } else {
            System.out.println("There is no such element");
        }
//      other way
        boolean containsBlack1 = false;
        for (String color : colors) {
            if (color.equals("Black")) {
                containsBlack1 = true;
            }

        }
        if (containsBlack1) {
            System.out.println("It has Black color");
        } else {
            System.out.println("It doesn't have Black color");
        }

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Red"); // 0
        list1.add("White");// 1
        list1.add("Black"); // 2
        list1.add("Green");
        System.out.println("List 1: "+list1);

        ArrayList<String> list2 = new ArrayList<>();

//            for (String element:list1){
//                list2.add(element);
//                System.out.println("List 2: " + list2);
//                System.out.println("\n2. way");

        for (int i = 0; i < list1.size(); i++) {
            String element = list1.get(i);
            list2.add(element);
        }
        System.out.println("List 2: " + list2);

//       reverse the list
        Collections.reverse(list1);
        System.out.println(list1);

            }
    }

