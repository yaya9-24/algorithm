package inf03array.test01.arraymerge;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = 3;
        int[] a = { 1,3,5 };

        int m = 5;
        int[] b = { 2,3,6,7,9 };

        //과제소스 챕터6-병합정렬 참고할것

        System.out.println(solution(n,a,m,b));

    }// end main

    private static String solution(int n,int[] a,int m,int[] b) {
        String answer = "";

        Integer[] a2 = Arrays.stream(a).boxed().toArray(Integer[]::new);
        Integer[] b2 = Arrays.stream(b).boxed().toArray(Integer[]::new);
        Integer[] f = Stream.of(a2,b2).flatMap(Stream::of).toArray(Integer[]::new);
        Arrays.sort(f);

        for (Integer x : f){
            answer += x + " ";
        }
        return answer;
    }
}// end class