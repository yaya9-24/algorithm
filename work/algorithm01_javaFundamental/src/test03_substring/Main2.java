package test03_substring;

import java.util.Scanner;

public class Main2 {
    /* 입력받은(주어진) 문자열의 3번째부터 5번째까지 뽑아서
    출력하는 프로그램을 작성하세요
    abcdefg 인경우 def 가 출력됨
    문자열은 0번째부터 시작됨.
    입력 예시 : abcdefg
    출력 예시 : def */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        //String str = "abcdefg";

        System.out.println(solution(str));
    }//end main

    private static String solution(String str){
        String answer = str.substring(3,6);

        return answer;
    }
}//end class
