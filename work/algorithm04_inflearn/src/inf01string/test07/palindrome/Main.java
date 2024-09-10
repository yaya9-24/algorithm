package inf01string.test07.palindrome;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        String str = s.nextLine();
        String str = "gooG";

        System.out.println(solution(str));
    }//end main

    private static String solution(String str){
        String[] arr = str.split("");
        StringBuffer sb = new StringBuffer(str).reverse();
        String str2 = String.valueOf(sb);
        if (str.equalsIgnoreCase(str2)){
            return "YES";
        } else return "NO";
    }
}//end class