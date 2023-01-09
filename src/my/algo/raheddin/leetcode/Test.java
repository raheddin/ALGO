package my.algo.raheddin.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class Test {

    public static void main(String[] args) {
        int[] nums = {1,3,1,2,0,5};
        int[] ints = maxSlidingWindow(nums, 3);
        for (int i :
                ints) {
            System.out.println(i);
        }
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int [] r= new int[n-k+1];
        // Store index
        int ri=0;

        // Creating a deque
        Deque<Integer> q=new ArrayDeque<>();
        for(int i =0;i<nums.length;i++){
            // Remove Numbers out of range k (Looking From BackSide)
            if(!q.isEmpty()&&q.peek()==i-k){
                q.poll();
            }
            // Remove Smaller Number
            while(!q.isEmpty() && nums[q.peekLast()]<nums[i]){
                q.pollLast();
            }
            q.offer(i);
            if(i>=k-1){
                r[ri++]=nums[q.peek()];
            }
        }
        return r;
    }
}
