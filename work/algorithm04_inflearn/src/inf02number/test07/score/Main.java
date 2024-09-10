package inf02number.test07.score;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        int len = Integer.parseInt(s.nextLine());
        int len = 10;

//		String str = s.nextLine();
        String str = "1 0 1 1 1 0 0 1 1 0";


        System.out.println(solution(len, str));
    }//end main

    private static String solution(int len,String str){
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        int count = 1;
        for (int i = 0; i < len; i++) {
            if (arr[i].equals("1")){
                sum += count;
                count++;
            }else count = 1;
        }
//        System.out.println(sum);






        return String.valueOf(sum);
    }
}//end class