package inf01string.test03.findstring;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//		String str = s.nextLine();
        String str = "it is time to study";

        System.out.println(solution(str));


    }//end main

    private static String solution(String str) {
        System.out.printf("%s\n",str);
        String answer = "";

        //2.스트림으로 구현- 배열에서 가장 긴 문자열반환(첫번째 발생한)
        answer = Arrays.asList(str.split(" ")).stream()
                .max(Comparator.comparing(String::length)).get();

        //참고:가장긴 단어의 길이를 알고 싶다면
//		System.out.println(Arrays.asList(str.split(" ")).stream().map(String::length).max(Integer::compare).get());


        return answer;
    }

}//end class