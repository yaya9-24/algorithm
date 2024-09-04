package test05_math;

import java.util.Scanner;

public class Main3 {

    /* 입력받은(주어진) 정수의 15제곱을 한 후 결과를 각각의 수의 합을 계산해서
    출력하는 프로그램을 작성하세요
    2**15=32768 : 3+2+7+6+8 = 26
    입력 예시: 2
             15
    출력 예시: 26 */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //int su1 = s.nextInt();
        //int su2 = s.nextInt();
        int su1 = 2;
        int su2 = 15;
        System.out.println(solution(su1,su2));
    }//end main

    private static int solution(int su1,int su2){
        int answer = (int)Math.pow(su1,su2);
        char[] cs = String.valueOf(answer).toCharArray();

        int sum = 0;
//        for (int i = 0; i < cs.length; i++) {
//            sum += Integer.parseInt(String.valueOf(cs[i]));
//        }

        for (int i = 0; i < cs.length; i++) {
            //char 0 ==int 48
            sum += cs[i] - 48;
        }
        return sum;
    }
}//end class
