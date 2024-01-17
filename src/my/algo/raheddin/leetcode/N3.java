package my.algo.raheddin.leetcode;

import java.util.LinkedHashSet;
import java.util.Set;

public class N3 {
    public static void main(String[] args) {

        String s = "pwwkew";
        Set k = new LinkedHashSet<>();

        for (int i = 0; i < s.length(); i++) {
            k.add(s.charAt(i));
        }

        System.out.println(k.size());

    }
}
