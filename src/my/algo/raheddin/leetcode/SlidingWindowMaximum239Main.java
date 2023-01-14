package my.algo.raheddin.leetcode;


import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum239Main {

    public static void main(String[] args) {
        int[] nums = {1, 3, 1, 2, 0, 5};
        int[] ints = maxSlidingWindow(nums, 3);
        for (int i :
                ints) {
            System.out.println(i);
        }
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] end = new int[nums.length - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();
        int n = 0;
        for (int i = 0; i < nums.length; i++) {

            if (!deque.isEmpty() && deque.peek() == i - k) {
                deque.pollFirst();
            }

            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            deque.offer(i);

            if (i >= k - 1) {
                end[n++] = nums[deque.peek()];
            }
        }
        return end;
    }
}
