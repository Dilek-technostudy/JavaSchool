package Day20;

import java.util.ArrayList;

public class ArrayListTask1 {
    public static void main(String[] args) {
        ArrayList<String > colors = new ArrayList<>();
        colors.add("Yellow");
        colors.add("Blue");
        colors.add("Red");
        colors.add("Black");
        colors.add("Beige");
        colors.add("Purple");

//        System.out.println(colors);
        System.out.println("1. way -----------------------------------");
        //for-each
        for (String color : colors) {
            System.out.println(color);
        }
        System.out.println("2. way -----------------------------------");

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

    }
}
