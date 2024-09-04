package test05_math;

import java.util.Scanner;

public class Main4 {

    /* 입력받은(주어진) 정수의 15제곱을 한 후 결과를 각각의 수의 합을 계산해서
    출력하는 프로그램을 작성하세요
    2**15=32768 : 3+2+7+6+8 = 26
    입력 예시: 2
             15
    출력 예시: binaryText로 출력
             11010 */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int su1 = s.nextInt();
        int su2 = s.nextInt();
        //int su1 = 2;
        //int su2 = 15;
        System.out.println(solution(su1,su2));
    }//end main

    private static String solution(int su1,int su2){
        int result = (int)Math.pow(su1,su2);
        char[] cs = String.valueOf(result).toCharArray();

        int sum = 0;
        for (int i = 0; i < cs.length; i++) {
            //char 0 ==int 48
            sum += cs[i] - 48;
        }
        String answer = Integer.toString(sum,2); //11010

        return answer;
    }
}//end class
