package my.algo.raheddin.leetcode;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber_202 {
    public static void main(String[] args) {
        System.out.println(isHappy(1));
    }

    public static boolean isHappy(int n) {

        int sum;
        int h;
        int a;
        List<Integer> all = new ArrayList<>();

        while (true) {
            all.add(n);
            sum = 0;
            a = n;
            while (a > 0) {
                h = a % 10;
                a = a / 10;
                sum = sum + h * h;
            }
            if (sum == 1) {
                return true;
            }

            for (int i = 0; i < all.size(); i++) {
                if (all.get(i) == sum) {
                    return false;
                }
            }

            n = sum;
        }
    }
}
