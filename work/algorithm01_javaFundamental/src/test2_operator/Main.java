package test2_operator;

import java.util.Scanner;

public class Main {

    //11 22 33을 각각 입력받아서 (예:11+22+33=66)
    //아래와 같이 출력되도록 작성하세요.
    //66

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int su1 = s.nextInt(); //abcdefg
        int su2 = s.nextInt();
        int su3 = s.nextInt();
        System.out.println(solution(su1,su2,su3));
    }//end main

    private static int solution(int...sus){
        int answer = sus[0]+sus[1]+sus[2];

        return answer;
    }
}//end class
