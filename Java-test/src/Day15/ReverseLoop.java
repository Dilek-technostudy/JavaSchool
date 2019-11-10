package Day15;
//shortcuts in InteliJ IDEA
       //arr.for, gives for-each loop
//        for (int i : myIntArray) {

//                }
//                //arr.fori, gives for loop starting with 0 index to last index
//                for (int i = 0; i < myIntArray.length; i++) {
//
//        }
        //arr.forr, gives reverse loop starting from last index to 0
        //for (int i = myIntArray.length - 1; i >= 0; i--) {



public class ReverseLoop {

    public static void main(String[] args) {
        System.out.println("normal");
        int[] myIntArray = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }
        //shortcuts in InteliJ IDEA
        //arr.for, gives for-each loop
        for (int i : myIntArray) {

        }
        //arr.fori, gives for loop starting with 0 index to last index
        for (int i = 0; i < myIntArray.length; i++) {

        }
        //arr.forr, gives reverse loop starting from last index to 0
        for (int i = myIntArray.length - 1; i >= 0; i--) {

        }

        System.out.println("\nreverse");
        for (int i = 4; i >= 0; i--) {
            System.out.print(i + " ");
        }


    }

    public static class MultiDimensionalTask4 {

    // you have string array of numbers,
        // change data type to int, using loop
        // the array size should be minimum 15
        //ex: {"11", "13", "17"} =>  {11, 13, 17}

        public static void main(String[] args) {
            String[] strArray = new String[15];
            for (int i = 0; i < strArray.length; i++) {
                strArray[i] = "" + i;
                // stringNumbers[0] = "0"
                // stringNumbers[1] = "1"
                // ...
                // stringNumbers[14] = "14"
            }
            String stringSum = "";
            for (String a : strArray) {
                stringSum += a;
            }
            System.out.println("StringConcatenate: " + stringSum);

            int[] intArray = new int[15];
            for (int i = 0; i < intArray.length; i++) {
                intArray[i] = Integer.valueOf(strArray[i]);
            }

            int intSum = 0;
            for (int n : intArray) {
                intSum += n;
            }
            System.out.println("IntSum: " + intSum);

        }
    }
}

