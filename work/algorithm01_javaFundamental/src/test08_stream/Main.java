package test08_stream;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //String str = s.nextLine();
        String str = "11 22 33 44";
        System.out.println(solution(str));
    }//end main

    private static String solution(String str){
        String answer = null;
        String[] arr = str.split(" ");
        //스트림을 사용하여 정수배열에 변환하기.
        int[] sus = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.toString(sus));

        //그리고나서 다시 스트림을 사용하여 문자열배열로 변환하기
        arr = Arrays.stream(sus).mapToObj(String::valueOf).toArray(String[]::new);
        System.out.println(String.join("-",arr));
        return answer;
    }
}//end class
