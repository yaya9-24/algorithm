package inf01string.test03.findstring;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        String str = s.nextLine();
        String str = "it is time to study";

        System.out.println(solution(str));
    }//end main

    private static String solution(String str){
        String[] arr = str.split(" ");
        String maxWord = "";
        //System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > maxWord.length()){
                maxWord = arr[i];
            }
        }
        //System.out.println(maxWord);
        return maxWord;
    }
}//end class