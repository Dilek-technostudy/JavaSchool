package Day15;

public class ArrayTask4 {
    //        TODO
    // Given 2 arrays of ints, a and b, print "have the same first elements"
    //       if they have the same first element

    public static void main(String[] args) {

        int [] a = {10,3, 5,4, 7, 8};
        int [] b = {10, 5, 6,4, 9,8};
        if (a[0] ==b [0] ){
            System.out.println("have the same first elements");
        }

        int lengthOfA =a.length;
         int lengthOfB =b.length;
        if (a[lengthOfA -1] ==b [lengthOfB -1] ){
            System.out.println("have the same last elements");
        }
        System.out.println("Part3------------------------");
        if (a[lengthOfA / 2] == b[lengthOfB / 2]) {
            System.out.println("have the same middle elements");
        }

    }


}
