package test2_operator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main3 {

    //문자열("11:22:33")을 한 번에 입력받아서 (예:11+22+33=66)
    //아래와 같이 출력되도록 작성하세요.
    //66

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] arr = s.nextLine().split(":");
        System.out.println(solution(arr));
    }//end main

    private static int solution(String[] arr){

        int answer = 0;

        for (String x:arr) answer += Integer.parseInt(x);


        return answer;
    }
}//end class
