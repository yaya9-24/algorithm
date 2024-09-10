package inf01string.test02.changeupperlower;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //String str = s.nextLine();
        String str = "StuDY";

        System.out.println(solution(str));
    }//end main

    private static String solution(String str){
        String[] arr = str.split("");
        //System.out.println(Arrays.toString(arr));
        String answer ="";
        for (int i = 0; i < arr.length; i++) {
            if (Character.isUpperCase(arr[i].charAt(0))){
                arr[i] = arr[i].toLowerCase();
            }else {
                arr[i] = arr[i].toUpperCase();
            }
        }
        //System.out.println(Arrays.toString(arr));
        answer = String.join("",arr);
        return answer;
    }
}//end class