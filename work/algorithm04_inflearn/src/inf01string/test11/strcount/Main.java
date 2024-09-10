package inf01string.test11.strcount;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        String str = s.nextLine();
        String str = "KKHSSSSSSSE";

        System.out.println(solution(str));
    }//end main

    private static String solution(String str){
        StringBuffer sb = new StringBuffer(str).append(" ");
        str = sb.toString();
        String[] arr = str.split("");

        int count = 1;
        String answer = "";
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i].equals(arr[i+1])) count++;
            else {
                answer += arr[i];
                if (count >=2) answer += count;

                count = 1;
            }
        }
        System.out.println(answer);
        return null;
    }
}//end class