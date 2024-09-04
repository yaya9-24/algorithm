package test05_math;

import java.util.Scanner;

public class Main {

    /* 입력받은(주어진) 정수의 제곱을 출력하는 프로그램을 작성하세요
    입력 예시: 10
    출력 예시: 100 */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int su = s.nextInt();
        //int su = 10;
        System.out.println(solution(su));
    }//end main

    private static int solution(int su){
        int answer = (int)Math.pow(su,2);

        return answer;
    }
}//end class
