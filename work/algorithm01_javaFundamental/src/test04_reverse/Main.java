package test04_reverse;

import java.util.Scanner;

public class Main {
    /* 입력받은(주어진) 문자열을 뒤집어서
      출력하는 프로그램을 작성하세요
      abcdefg 인경우 gfedcba 가 출력됨
      입력 예시: abcdefg
      출력 예시 : gfedcba */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        //String str = "abcdefg";

        System.out.println(solution(str));
    }//end main

    private static String solution(String str){

        String answer = "";

        //1.charAt() : String
        //System.out.println(str.charAt(str.length()-1));
        //System.out.println(str.charAt(str.length()-2));
//        for (int i = str.length()-1; i >=0 ; i--) {
//            answer += str.charAt(i);
//        }

        //2.toCharArray() : String
//        char[] cs = str.toCharArray(); //['a','b','c','d',,,,]
//        for (int i = cs.length-1; i >=0 ; i--) {
//            answer += cs[i];
//        }

        //3. reverse() : StringBuffer or StringBuilder
        answer = new StringBuffer(str).reverse().toString();

        return answer;
    }
}//end class
