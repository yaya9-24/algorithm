package test03_substring;

import java.util.Scanner;

public class Main3 {
    /* 입력받은(주어진) 문자열의 입력받은 알파벳 한개(처음발생하는c)부터 끝까지 뽑아서
    출력하는 프로그램을 작성하세요
    abcdefg 인경우 cdefg 가 출력됨
    첫줄의 문자는 1개의 알파벳, 2번째줄에는 여러 문자열을 입력받는다.
    입력 예시 : c
              abc def gccc ddd
    출력 예시 : c def gccc ddd */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String start = s.nextLine();
        String str = s.nextLine();
        //String start = "c";
        //String str = "abc def gccc ddd";

        System.out.println(solution(start,str));
    }//end main

    private static String solution(String start,String str){
        String answer = str.substring(str.indexOf(start));

        return answer;
    }
}//end class
