public class Example3 {

    public static void main(String[] args) {


//    Write a Java program to print the grid of zeros with length m and n.
        //create a 2D array
        int m = 10;
        int n = 5;

        int[][] twoD_arr = new int[m][n];

//        for (int i = 0; i < twoD_arr.length; i++) {
//            for (int j = 0; j < twoD_arr.length; j++)
//                System.out.print("arr[" + i + "][" + j + "] = "
//                        + twoD_arr[i][j]);
//        }
//        System.out.println();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(twoD_arr[i][j]);
            }
            System.out.println();

        }
    }
}