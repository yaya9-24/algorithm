package inf01string.test12.binary;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//		String str = s.nextLine();
        String len = "4";
//		String str = s.nextLine();
        String str = "#****###**#####**#####**##**";

        System.out.println(solution(str,len));


    }//end main

    private static String solution(String str,String len) {
        System.out.println(str);
        System.out.println(str.length());
        String answer = "";

        //넘어온 길이값(4)을 기준으로 문자열을 잘라서 검증해도 되지만
        //아래처럼 처리가능하다.
        //1.반복문- 7씩 증가시키면서 처리
        String temp = "";
        for (int i = 0; i < str.length(); i+=7) {
//			System.out.println(i);

            //일곱자리씩 획득
            temp = str.substring(i,i+7);
//			System.out.println(temp);

            //암호를 변경 : #=1,*=0
            temp = temp.replace("#", "1").replace("*", "0");
            System.out.println(temp);

            //2진수 문자열을 정수로 변환
            int su = Integer.parseInt(temp, 2);
            System.out.println(su +":"+ (char)su);

            answer += (char)su;
        }

        return answer;
    }
}//end class