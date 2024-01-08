package my.algo.raheddin.leetcode;

import java.util.Arrays;

public class twoSum_1 {
    public static void main(String[] args) {
        int[] a = {2,4,11,3};
        int[] r = twoSum(a, 6);
        System.out.println(r[0]);
        System.out.println(r[1]);

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] r = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    r[0] = i;
                    r[1] = j;
                    return r;
                }
            }
        }
        return null;
    }
}
