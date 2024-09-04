package test08_stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //String str = s.nextLine();
        String str = "hello java javascript";
        System.out.println(solution(str));
    }//end main

    private static String solution(String str){
        String answer = null;
        List<String> list = Arrays.asList(str.split(" "));
        //스트림 문자열 변환
        //answer = list.stream().collect(Collectors.joining());
        //answer = list.stream().reduce("",String::concat);
        answer = list.stream().collect(Collectors.joining());
        answer = list.stream().reduce("",String::concat);
        return answer;
    }
}//end class
