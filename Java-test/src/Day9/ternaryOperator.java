package Day9;

public class ternaryOperator {
    public static void main(String[] args) {
        int val1 = 10;
        int val2 = 20;

        int max = (val1 >= val2) ? val1 : val2;

        int min = (val1 <= val2) ? val1 : val2;

        System.out.println(max);

    }
}
