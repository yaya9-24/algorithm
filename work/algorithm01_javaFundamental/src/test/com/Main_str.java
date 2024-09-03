package test.com;

import java.util.Scanner;

public class Main_str {

    public static void main(String[] args) {
        //문제양식 1 : 문자열 관련 문제용

        Scanner s = new Scanner(System.in);
        //String str = s.next(); //한 단어씩 입력받음(띄어쓰기 기준)
        String str = s.nextLine();//한 문장씩 입력받음 aaa bbb ccc
        System.out.println(str);

        System.out.println(solution(str));
    }//end main

    private static String solution(String str){
        System.out.println(str);
        String answer = null;

        return answer;
    }
}//end class
