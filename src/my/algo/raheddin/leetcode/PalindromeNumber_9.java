package my.algo.raheddin.leetcode;

public class PalindromeNumber_9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(0));
    }

    public static boolean isPalindrome(int x) {
        int newX=0;
        int oldX=x;
        boolean ancver=false;
        if(x<0) return false;
        while(x>0){
            newX=newX*10+(x%10);
            x=x/10;
        }
        if(newX==oldX) return true;
        return ancver;
    }
}
