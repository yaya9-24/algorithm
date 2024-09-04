package test05_math;

import java.util.Scanner;

public class Main2 {

    /* 입력받은(주어진) 정수의 15제곱을 출력하는 프로그램을 작성하세요
    입력 예시: 2
             15
    출력 예시: 32768 */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int su1 = s.nextInt();
        int su2 = s.nextInt();
        //int su1 = 4;
        //int su2 = 3;
        System.out.println(solution(su1,su2));
    }//end main

    private static int solution(int su1,int su2){
        int answer = (int)Math.pow(su1,su2);

        return answer;
    }
}//end class
