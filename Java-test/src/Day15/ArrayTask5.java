package Day15;

public class ArrayTask5 {
    // part4. check every element, if they are same print => "arrays are same"
    //ex:
    // a = {5, 6, 7}
    // b = {5, 6, 7}
    // => "arrays are same"
    //ex2:
    // a = {3, 2, 6}
    // b = {5, 6, 7}
    // => "arrays are different"


    public static void main(String[] args) {
//        int[] a = {5, 6, 7};
//        int[] b = {5, 6, 7};

//        boolean equal = true;
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] != b[i]) {
//                equal = false;
//                break;
//            }
//        }
//        System.out.println("Arrays are same  " + true);
//
//        System.out.println("_________________________________");
//
//        int[] a1 = {3, 2, 6};
//        int[] b2 = {5, 6, 7};
//        boolean equals = true;
//
//        for (int i2 = 0; i2 < a.length; i2++) {
//            if (a1[i2] != b2[i2]) {
//                equals = false;
//
//            }
//        }

//        System.out.println("Arrays are different  ");
//    }
//}
    // way 1
//        boolean areEqual = false;
//        for(int i = 0; i < a1.length; i++){
//            if(a1[i] == b1[i]){
//                areEqual = true;
//            }else {
//                areEqual = false;
//                break;
//            }
//        }
        int[] arrayA =  {5, 8, 7};
        int[] arrayB =  {5, 6, 7};
         boolean isEqual = true;
        for (int i = 0; i < arrayA.length; i++) {
        // 1. 5 != 5 => false
        // 2. 8 != 6 => true
        if (arrayA[i] != arrayB[i]) {
        isEqual = false;
        break;
        }
        }
        if (isEqual == true) {
        System.out.println("they are equal");
        } else {
        System.out.println("they are not equal");
        }
        }
        }