package test07_collection;

import java.util.*;

public class Main2 {

    /* 입력받은(주어진) 문자열에서 중복된 문자열 배제하여 출력하는 프로그램을 작성하세요.
    입력 예시: Hello java java html java

    출력 예시 : 출력순서는 상관없음.
               Hello html java */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //String str = s.nextLine();
        String str = "Hello java java html java";

        System.out.println(solution(str));
    }//end main

    private static String solution(String str){
        String[] arr = str.split(" ");

        String answer = "";
        Set<String> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        answer = String.join(" ",set);
        String[] temp = answer.split(" ");
        //문자열 순정렬을 추가하고자 한다.
        Arrays.sort(temp);
        answer = String.join(" ",temp);
        return answer;
    }
}//end class
