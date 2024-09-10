package inf02number.test05.primenumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        System.out.println(solution(num));
    }//end main

    private static String solution(int num){
        int count = 0;
        String answer = "";
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)){
                count++;
            }
        }
//        System.out.println(count);
        return answer+count;
    }

    private static boolean isPrime(int i) {
        if (i==2) return true;
        if (i%2==0) return false;
        for (int j = 3; j <= Math.sqrt(i); j+=2) {
            if (i%j==0) return false;
        }
        return true;
    }
}//end class