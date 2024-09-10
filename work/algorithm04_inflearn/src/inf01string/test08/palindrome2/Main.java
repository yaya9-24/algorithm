package inf01string.test08.palindrome2;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        String str = s.nextLine();
        String str = "found7, time: study; Yduts; emit, 7Dnuof";

        System.out.println(solution(str));
    }//end main

    private static String solution(String str){

        //1.알파벳 검증
//		System.out.println(String.valueOf(str.charAt(0)).matches("[a-zA-Z]"));
//		System.out.println(str.replaceAll("[a-zA-Z]", "A"));
//		System.out.println(str.replaceAll("[^a-zA-Z]", "A"));
//		System.out.println(str.replaceAll("[^a-zA-Z]", ""));

        //알파벳이 아닌 모든 문자를 빈문자로 변경해서 재할당
        str = str.replaceAll("[^a-zA-Z]",""); //foundtimestudyYdutsemitDnuof
//        System.out.println(str);

        StringBuffer sb = new StringBuffer(str).reverse();
        String str2 = String.valueOf(sb);

        if (str2.equalsIgnoreCase(str)) return "YES";
        else return "NO";
    }
}//end class