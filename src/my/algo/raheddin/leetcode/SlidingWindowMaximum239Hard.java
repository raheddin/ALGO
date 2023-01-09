package my.algo.raheddin.leetcode;

import java.util.Arrays;

public class SlidingWindowMaximum239Hard {

    public static void main(String[] args) {
        int[] nums = {1,-1};
        int[] ints = maxSlidingWindow(nums, 1);
        for (int i:
             ints) {
            System.out.println(i);
        }
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int newArr[]=new int[nums.length-k+1];
        int o=0;
        int from =0;
        while (k <= nums.length) {
            int a = findToMax(Arrays.copyOfRange(nums, from, k));
            k++;
            from++;
            newArr[o++]=a;
        }
        return newArr;
    }

    public static int findToMax(int[] newArr) {
        int max = newArr[0];
        for (int i = 1; i < newArr.length; i++) {
            if (newArr[i] > max)
                max = newArr[i];
        }
        return max;
    }

}
