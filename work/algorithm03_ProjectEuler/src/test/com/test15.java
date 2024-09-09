package test.com;

import java.math.BigInteger;

public class test15 {

    /*  아래와 같은 2 × 2 격자의 왼쪽 위 모서리에서 출발하여 오른쪽 아래 모서리까지
        도달하는 길은 모두 6가지가 있습니다 (거슬러 가지는 않기로 합니다).
        그러면 20 × 20 격자에는 모두 몇 개의 경로가 있습니까? */

    //격자 공식(!는팩토리얼) : su!/(h!*v!) = 4*3*2*1/2*1 * 2*1 = 6
    public static void main(String[] args) {
        //방법1. double 타입으로 해결하기 !
        int a = 20;
        int b = 20;
        int su = a+b;

        double path = getFactorialDouble(su) / (getFactorialDouble(a)*getFactorialDouble(b)) ;
        System.out.println((long)path); // 소수점으로 나오기 때문에 long으로 캐스팅

        //방법2. BigInteger 타입으로 해결하기

        BigInteger totalCount = getFactorialBigInteger(su).divide(getFactorialBigInteger(a).multiply(getFactorialBigInteger(b)));
        System.out.println("totalCount:" + totalCount);//137846528820


    }//end main

    private static BigInteger getFactorialBigInteger(int su) {
        BigInteger factorial = BigInteger.ONE;

        for (int i = 1; i <= su; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }

    private static double getFactorialDouble(double su) {
        double factorial = 1;
        for (int i = 1; i <= su; i++) {
            factorial *=i;
        }
        return  factorial;
    }
}//end class
