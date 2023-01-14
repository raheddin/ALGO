package my.algo.raheddin.leetcode;

public class MaximumCountPositiveIntegerNegativeInteger_2529 {
    public static void main(String[] args) {

        int a[] = {-3, -2, -1, 0, 0, 1, 2};
        System.out.println(maximumCount(a));

    }

    public static int maximumCount(int[] nums) {
        int mp = 0, mm = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                mp++;
            } else if (nums[i] < 0) {
                mm++;
            }
        }
        if (mp >= mm) {
            return mp;
        } else {
            return mm;
        }
    }
}
