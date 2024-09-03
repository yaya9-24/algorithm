package test01string_length;

import java.util.Scanner;

public class Main {

    //abcdefg 문자열 입력받으면 문자열의 길이를 구해서
    //아래와 같이 출력되도록 작성하세요.
    //7

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine(); //abcdefg

        System.out.println(solution(str));
    }//end main

    private static int solution(String str){
        int answer = str.length();

        return answer;
    }
}//end class
