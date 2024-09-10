package inf01string.test09.selectnumbers;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//		String str = s.nextLine();
        String str = "g0en2T0s8eSoft";

        System.out.println(solution(str));


    }//end main

    private static String solution(String str) {
        System.out.println(str);
        String answer = "";

        //영문 또는 아닌것을 제거
//		System.out.println(str.replaceAll("[^a-zA-Z]", ""));
//		System.out.println(str.replaceAll("[a-zA-Z]", ""));

        //숫자 또는 아닌것을 제거
//		System.out.println(str.replaceAll("[0-9]", ""));
//		System.out.println(str.replaceAll("[^0-9]", ""));

        str = str.replaceAll("[^0-9]", "");
        System.out.println(str);

        answer += Integer.parseInt(str);

        return answer;
    }

}//end class