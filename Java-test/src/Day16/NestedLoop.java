package Day16;

public class NestedLoop {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                System.out.print("#");
//            }
//            System.out.println("\n--------------");
//        }

//        for (int i = 1; i <= 10; i++) {
//
//            System.out.println("1 "+ "x  "+ i+ " ="+ i);

            for (int x = 1; x <= 10; x++){
                for (int y = 1; y <= 10; y++){
                    System.out.println( x + " *" + y + " = " + (x*y) );
                }System.out.println("-----------------");

            }
        }
    }

