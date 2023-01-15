package my.algo.raheddin.leetcode;
public class N_2259 {
    public static void main(String[] args) {
        System.out.println(removeDigit("123",'3'));
    }

    public static String removeDigit(String number, char digit) {

        for (int i=0;i<number.length()-1;i++){

            if(number.charAt(i)==digit){
                if (number.charAt(i+1)>number.charAt(i)){
                    return number.substring(0,i)+number.substring(i+1);
                }
            }
        }
        int li=number.lastIndexOf(digit);
        return number.substring(0,li)+number.substring(li+1);

    }

}
