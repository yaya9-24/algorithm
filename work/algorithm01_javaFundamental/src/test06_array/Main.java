package test06_array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    /* 입력받은(주어진) 문자열을 순정렬해서 출력하는 프로그램을 작성하세요.
    입력 예시 : 33 22 44 11 111
    출력 예시 : 11 22 33 44 111 */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        //String str = "33 22 44 11";

        System.out.println(solution(str));
    }//end main

    private static String solution(String str){
        String[] arr = str.split(" ");
        //System.out.println(Arrays.toString(arr));
        String answer = null;
        //문자열에 대한 정렬인 경우 간단하다.
        //Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));

        //요소타입은 문자열이지만 정수정렬의 결과를 얻고자 한다면 아래와 같이...
        Integer[] sus = new Integer[arr.length];
        for (int i = 0; i < sus.length; i++) {
            sus[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(sus);
       // System.out.println(Arrays.toString(sus));

        //문자열 배열에 재할당
        for (int i = 0; i < sus.length; i++) {
            arr[i] = String.valueOf(sus[i]);
        }

        //출력용 조인
        answer = String.join(" ",arr);
        return answer;
    }
}//end class
