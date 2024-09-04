package chap02;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //2~100 소수들만 배열에 할당하기.(또는 출력하기)
        List<Integer> list = new ArrayList<>();

        for (int i = 2; i < 100; i++) {
            if (isPrime(i)){
                list.add(i);
            }
        }
        System.out.println(list);
    }//end main

    private static boolean isPrime(int num) {

        for (int i = 2; i <= num/2; i++) {
            if (num%i==0){
                return false;
            }
        }

        return true;
    }
}//end class