package test.com;

import java.util.ArrayList;
import java.util.List;

public class test07 {

    /*  소수를 크기 순으로 나열하면 2, 3, 5, 7, 11, 13, ... 과 같이 됩니다.

        이 때 10,001번째의 소수를 구하세요. */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int num = 2;
        long startTime = System.currentTimeMillis();
        while (list.size()<10001){
            if (isPrime(num)) {
                list.add(num);
            }
            num++;
        }
        //System.out.println(list);
        System.out.println(list.get(list.size()-1));
        System.out.println("경과 시간:"+(System.currentTimeMillis()-startTime));


    }// end main

    //외우기!!!!!!
    public static boolean isPrime(int num){
        if (num==2) return true;

        if (num<2 || num%2==0) return false;

        for (int i = 3; i <= Math.sqrt(num); i+=2) {
            if (num % i ==0) {
                return false;
            }
        }
        return true;
    }
}// end class
