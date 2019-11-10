package Day9;

public class TernaryOperator2 {
    public static void main(String[] args) {
        int val1 = 10;
        int val2 = 20;
        int min = (val1 <= val2) ? val1:val2;
        System.out.println(min);



    }

    public static class OfficeHours5 {
        public static void main(String[] args) {
    //        for (int i = 1; i < 100; i++) {
    //            if (i% 2 ==1) {
    //                System.out.println("Even numbers are here" + i);

    //            }
    //        }
            int i1 = 10;
            int i2 = 12;
            int i3 = 14;

            if (i1 > i2 && i1 > i3) {
                System.out.println("this is the bigger number i1" + i1);
            } else if (i2 > i1 && i2 > i3) {
                System.out.println("this is bigger i2 " + i2);
            } else {
                System.out.println("This is the bigger i3" + i3);
            }
        }
    }
}
//find out min number between two inputs, use user input and ternary operator
//    int val1 = 10;
//    int val2 = 20;
//
//    int min =
//    output
//    10