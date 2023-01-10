package my.algo.raheddin.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger_13 {
    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII"));
    }

    public static int romanToInt(String s) {

        Map<String, Integer> main = new HashMap<>();
        main.put("I", 1);
        main.put("V", 5);
        main.put("X", 10);
        main.put("L", 50);
        main.put("C", 100);
        main.put("D", 500);
        main.put("M", 1000);

        int sum = 0;
        String ss = String.valueOf(s.charAt(s.length() - 1));
        sum = sum + main.get(ss);

        for (int i = s.length() - 2; i >= 0; i--) {

            if (main.get(String.valueOf(s.charAt(i))) < main.get(ss)) {
                sum = sum - main.get(String.valueOf(s.charAt(i)));
            } else {
                sum = sum + main.get(String.valueOf(s.charAt(i)));
                ss = String.valueOf(s.charAt(i));
            }
        }
        return sum;

    }
}
