package inf02number.test06.reverseprime;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num = Integer.parseInt(s.nextLine());
        String str = s.nextLine();
//        int num = 9;
//        String str ="32 55 62 20 250 370 200 30 100";

        System.out.println(solution(num,str));
    }//end main

    private static String solution(int num,String str){
        StringBuffer sb = new StringBuffer(str).reverse();
        System.out.println(sb);
        String[] arr = String.valueOf(sb).split(" ");
        int [] sus = new int[num];
        String answer = "";
        for (int i = 0; i < sus.length; i++) {
            sus[i] = Integer.parseInt(arr[i]);
        }
        System.out.println(Arrays.toString(sus));

        for (int i = 0; i < sus.length; i++) {
            if (isPrime(sus[i])){
                answer += sus[i] + " ";
            }
        }
        return answer;
    }

    private static boolean isPrime(int i) {
        if (i==2) return true;
        if (i%2==0 || i<2) return false;
        for (int j = 3; j <= Math.sqrt(i); j+=2) {
            if (i%j==0) return false;
        }
        return true;
    }
}//end class