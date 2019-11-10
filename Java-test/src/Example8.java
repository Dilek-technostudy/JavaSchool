import javax.crypto.spec.PSource;

public class Example8 {
    //write a java program that iterates an array using while-loop

    public static void main(String[] args) {
        int[] intArray = {100, 2, 4, 5, 6, 7, 8, 9, 10};
//        int i=0;
//        while(i <intArray.length){
//            System.out.println(intArray[i]);
//            i++;
//        }

            int i1 = intArray.length-1;
            int j = 0;
            while(i1 >= 0) {
                System.out.print(intArray[i1] + "  " + intArray[j]);
                i1--;
            }

    }

}
