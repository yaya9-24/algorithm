package test08_stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //String str = s.nextLine();
        String str = "hello java javascript";
        System.out.println(solution(str));
    }//end main

    private static String solution(String str){
        String answer = null;
        List<String> list = Arrays.asList(str.split(" "));
        //가장 긴 단어 찾기
        answer = list.stream().max(Comparator.comparing(String::length)).get();
        //가장 긴 단어의 길이를 알고 싶다면
        System.out.println(list.stream().map(String::length).max(Integer::compare).get());
        return answer;
    }
}//end class
