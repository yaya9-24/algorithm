package test.com;

import java.math.BigInteger;
import java.util.Arrays;

public class test16 {

    /*  215 = 32768 의 각 자릿수를 더하면 3 + 2 + 7 + 6 + 8 = 26 입니다.

        21000의 각 자릿수를 모두 더하면 얼마입니까? */

    public static void main(String[] args) {

        BigInteger su = new BigInteger("2").pow(1000);
        System.out.println(su);

        char[] cs = su.toString().toCharArray();
        int sum = 0;
        for (char x : cs){
            sum += Integer.parseInt(String.valueOf(x));
        }
        System.out.println(sum);



    }//end main
}//end class
