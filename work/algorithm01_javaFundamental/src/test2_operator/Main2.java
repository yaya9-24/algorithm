package test2_operator;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

    //3 : 입력개수
    //11 22 33을 각각 입력받아서 (예:11+22+33=66)
    //아래와 같이 출력되도록 작성하세요.
    //66
    //4 : 입력개수
    //11 22 33 44을 각각 입력받아서 (예:11+22+33+44=110)
    //아래와 같이 출력되도록 작성하세요
    //110

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = s.nextInt();
        }
        System.out.println(solution(numbers));
    }//end main

    private static int solution(int...sus){
        int answer = 0;
        for (int i = 0; i < sus.length; i++) {
            answer += sus[i];
        }


        return answer;
    }
}//end class
