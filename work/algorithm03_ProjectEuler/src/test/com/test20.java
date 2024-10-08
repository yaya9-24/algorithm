package test.com;

import java.math.BigInteger;
import java.util.*;

public class test20 {

    /*  n! 이라는 표기법은 n × (n − 1) × ... × 3 × 2 × 1을 뜻합니다.

        예를 들자면 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800 이 되는데,
        여기서 10!의 각 자릿수를 더해 보면 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27 입니다.

        100! 의 자릿수를 모두 더하면 얼마입니까? */

    public static void main(String[] args) {

        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= 100; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(result);

        String str = String.valueOf(result);
        int answer = Arrays.stream(str.split("")).mapToInt(Integer::parseInt).sum();
        System.out.println(answer);

    }//end main
}//end class
