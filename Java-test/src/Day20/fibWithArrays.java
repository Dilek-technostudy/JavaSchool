package Day20;

import java.util.HashSet;

public class fibWithArrays {
            public static void main(String[] args) {
                //BigInteger to hold big numbers
                long[] nums = new long[100];

                //fib(n) = fib(n-2) + fib(n-1);
                nums[0] = 0;
                nums[1] = 1;
                nums[2] = 1;
                nums[3] = nums[1] + nums[2];

                for (int i = 3; i < nums.length; i++) {
                    nums[i] = nums[i - 2] + nums[i - 1];
                    // nums[3] = nums[3-2] + nums[3-1];
                    // nums[3] = nums[1] + nums[2];
                }

                for (long num : nums) {
                    System.out.print(num + " ");
                }


            }

    public static class JavaSetex3 {
        public static void main(String[] args) {
            HashSet<Integer> setNumbers = new HashSet<>();
            setNumbers.add(1);
            setNumbers.add(2);
            setNumbers.add(3);
            setNumbers.add(10);
            for (int i = 0; i < 5; i++) {
                setNumbers.add(5);

            }
            System.out.println(setNumbers.size());
            setNumbers.iterator();
            System.out.println(setNumbers);
    //        setNumbers.clear();
    //        setNumbers.removeAll(setNumbers);
    //        System.out.println(setNumbers);

            HashSet<Integer> s2 = new HashSet<>();
            s2.add(1);
            s2.add(2);

            setNumbers.removeAll(s2);
            System.out.println(setNumbers); //=> [3, 5, 10]

            System.out.println(setNumbers.isEmpty());
        }
    }
}

