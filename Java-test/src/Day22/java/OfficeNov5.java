package Day22.java;

import java.util.*;

public class OfficeNov5 {
    public static void main(String[] args) {
//        Collections in java

//        Answer --->> : Collection has multiple types and I am using the arrylist and also I can use set and map



//        differences between collection types

//        set vs list vs map

    Set<Integer> set1 = new LinkedHashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(1);
        set1.add(5);
        set1.add(10);
        set1.add(6);
        set1.add(null);
        set1.add(null);

        System.out.println("set1 ----> "+set1);

        /*     Set :
                Does not allow duplicates
                Able to store just one null value
                Set has multiple print types

                Set vs map
                Able to store just a values in the set
         */

    List<Integer> list1 = new ArrayList<>();

        list1.add(5);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(1);
        list1.add(5);
        list1.add(10);
        list1.add(6);
        list1.add(null);
        list1.add(null);


        System.out.println("list1 --->  "+list1);

        /*
                List :
                     Allow the duplicates
                    Able to store multiple null value
                    Able to print with first in first out

                    List vs map
                    Able to store just a value in the list
         */

        System.out.println("Linked hash map --------->>>>>  ordered by how you put in the map  ");
    Map<String , String> map1 = new LinkedHashMap<>();
        map1.put("James" , "USA");
        map1.put("Carly" , "London");
        map1.put("Steven" , "USA");
        map1.put("David" , "Mexico");
        map1.put("Lionel" , "Italy");
        map1.put("Andres" , "Spain");

        System.out.println(map1);

//         --------------------
        System.out.println("HashMap ----------->>>>>>>>>   print randomly");

    Map<String , String> map2 = new HashMap<>();
        map2.put("James" , "USA");
        map2.put("Carly" , "London");
        map2.put("Steven" , "USA");
        map2.put("David" , "Mexico");
        map2.put("Lionel" , "Italy");
        map2.put("Andres" , "Spain");

        System.out.println(map2);

        System.out.println("TreeMap ----------->>>>>>>>> is print by alphabet (String ) or  smaller number to bigger number(Integer) ");

    Map<String , String> map3 = new TreeMap<>();
        map3.put("James" , "USA");
        map3.put("Carly" , "London");
        map3.put("Steven" , "USA");
        map3.put("David" , "Mexico");
        map3.put("Lionel" , "Italy");
        map3.put("Andres" , "Spain");

        System.out.println(map3);

//     hashmap and linkedhashmap are same ?
        /*
           Map
                   Able to store key and value pair
                   Key should be unique
                   Value can be duplicated
                   different print types  -> linked hash map , hashmap , tree map
         */

//        treeset vs LinkedHashset vs hashset

    Set<Integer> LinkedHashSet1 = new LinkedHashSet<>();

        LinkedHashSet1.add(1);
        LinkedHashSet1.add(3);
        LinkedHashSet1.add(5);
        LinkedHashSet1.add(2);
        LinkedHashSet1.add(4);

        System.out.println("Linked hash set -------->>   "+LinkedHashSet1);

//        set methods --->> add , clear , contains , isEmpty  , remove , size


}

}
