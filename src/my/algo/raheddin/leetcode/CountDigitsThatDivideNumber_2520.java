package my.algo.raheddin.leetcode;

import java.util.HashMap;
import java.util.Map;

public class CountDigitsThatDivideNumber_2520 {
    public static void main(String[] args) {
        System.out.println(countDigits(54));
    }

    public static int countDigits(int num) {
        int i = 1;
        int count = 0;
        int h = num;

        while (num > 0) {
            int a = num % 10;
            if (a != 0 && h % a == 0) {
                count++;
            }

            num = num / 10;
        }

        return count;

    }
}
