package inf01string.test06.removestring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//		String str = s.nextLine();
        String str = "ksekkset";

        System.out.println(solution(str));


    }//end main

    private static String solution(String str) {
        System.out.println(str);
        String answer = "";

        //2.스트림으로 처리
        List<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        System.out.println(list);

        //중복배제 함수 distinct()사용 후 문자열로 변환
        answer = list.stream().distinct().reduce("",String::concat);
        return answer;
    }

}//end class