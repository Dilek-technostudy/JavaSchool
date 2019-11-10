package Day16;

public class MultiDimensionalTask6 {
//    how to find 5 in the array
    public static void main(String[] args) {
        boolean haveFive = false;
        for (int i = 6; i < 10; i++) {
            if (i == 5) {
                haveFive = true;
            }
        }

        if(haveFive) {
            System.out.println("you have 5 in array");
        }else{
            System.out.println("you dont have");
        }
    }
}
