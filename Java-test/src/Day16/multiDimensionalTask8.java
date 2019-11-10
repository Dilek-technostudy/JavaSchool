package Day16;

public class multiDimensionalTask8 {
//    walmart  costco  corrado's  AVG
//    apple  3         4     5       4
//    milk  3         3     3       3
//    meat  4          5     4       4.33
//    bread  1         1     2       1.33
//    TOTAL  11        13     14

    // given table,
    // part1. calculate sum of price in each market(walmart,costco,corrado's)
    // expected output is:
    // Total at Walmart is: ???
    // Total at costco is: ???
    // Total at corrado's is: ???

    // part2. calculate average price of each item(apple, milk, meat, bread)
    // expected output is:
    // average price of apple is: ???
    // average price of milk is: ???
    // average price of meat is: ???
    // average price of bread is: ???

    public static void main(String[] args) {
        int[][] prices = {
                {3, 4, 5},
                {3, 3, 3},
                {4, 5, 4},
                {1, 1, 2}
        };

        for (int i = 0; i < prices.length; i++) {
            int sum = 0;

            for (int j = 0; j < prices[i].length; j++) {
                System.out.print(prices[i][j] + " ");
                sum+=prices[i][j];
            }
            double avg = (double) sum / prices[i].length;
            System.out.print("   Sum is: " + sum);
            System.out.println("  average is : "+ avg);
            System.out.println();
        }

        String[][] array = {
                {"apple", "lemon", "peach"},
                {"red", "green", "blue"}
        };
        for (int i = 0; i < array.length; i++) {
            for (int j= 0; j < array[i].length; j++) {
                System.out.print(array[i][j ] + " ");
            }
            System.out.println();

        }
        System.out.println("_________________________________");

        System.out.println(array[0][0] + " " + array[0][1] + " " + array[0][2]);
        System.out.println(array[1][0] + " " + array[1][1] + " " + array[1][2]);
        System.out.println("HARDCODED 2-----------");



//        red apple
        // green lemon
        // blue peach
        System.out.print(array[0][0] + " ");
        System.out.print(array[1][0] + " ");
        System.out.println();
        System.out.print(array[0][1] + " ");
        System.out.print(array[1][1] + " ");
        System.out.println();
        System.out.print(array[0][2] + " ");
        System.out.print(array[1][2] + " ");
        System.out.println("\nHARDCODE ");

        System.out.println("________________________________");

        System.out.print(array[1][0] + " ");
        System.out.print(array[0][0] + " ");
        System.out.println();
        System.out.print(array[1][1] + " ");
        System.out.print(array[0][1] + " ");
        System.out.println();
        System.out.print(array[1][2] + " ");
        System.out.print(array[0][2] + " ");

    }



}
























