package inf01string.test04.reversestring;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String len = s.nextLine();

        String[] arr = new String[Integer.parseInt(len)];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextLine();
        }

       // System.out.println(Arrays.toString(arr));
        System.out.println(solution(arr));
    }//end main

    private static String solution(String[] arr){
        String answer = "";
        for (String x : arr){
            StringBuffer sb = new StringBuffer(x).reverse();
            answer += sb.toString()+"\n";
        }

        return answer;
    }
}//end class