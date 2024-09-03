package test.com;

import java.util.Scanner;

public class Main_su {

    public static void main(String[] args) {
        //문제양식 1 : 문자열 관련 문제용

        Scanner s = new Scanner(System.in);

        int su = s.nextInt();//12345 67890 띄어쓰기 구분됨.
        System.out.println(su);
        //int su2 = s.nextInt();
        //System.out.println(su2);

        System.out.println(solution(su));
    }//end main

    private static int solution(int su){
        System.out.println(su);
        int answer = 0;

        return answer;
    }
}//end class
