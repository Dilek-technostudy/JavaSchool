package Day17;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {


        BinarySearch ob = new BinarySearch();
        int arr[] = {2, 3, 4, 10, 40};
        int target = 10;

        int size = arr.length;

        int result = binarySearch(arr, target);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                    + "index " + result);
    }

    // Returns index of x if it is present in arr[],
    // else return -1
    static int binarySearch(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0;//start from 0
        int right = arr.length - 1;//end position is 9

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if x is present at mid
            if (arr[mid] == target)
                return mid;

            // If x greater, ignore left half
            if (arr[mid] < target)
                left = mid + 1;

                // If x is smaller, ignore right half
            else
                right = mid - 1;
        }


        return -1;
    }

}