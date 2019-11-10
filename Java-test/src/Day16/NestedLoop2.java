package Day16;

public class NestedLoop2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " " + "*");
            }
            System.out.println();
        }

        System.out.println("----------------------------");
        for (int count = 5; count > 0; count--) {
            for (int index = 0; index < count - 1; index++)
                System.out.print(" ");
            for (int star = 5; star > count - 1; star--)
                System.out.print("*");
            System.out.println();
        }
        for (int i = 0; i < 1; i++) {
            for (int j = 0; i <= i; j++) {
                String a = "     *    ";
                String b = "   *   *    ";
                String c = " *   *    * ";
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
                break;
            }
        }
        for (int i = 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                String a = "     *    ";
                String b = "   *   *    ";
                System.out.println(b);
                System.out.println(a);
                break;
            }
        }
        }
    }

