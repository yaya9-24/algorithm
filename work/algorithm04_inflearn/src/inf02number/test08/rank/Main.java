package inf02number.test08.rank;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//		int len = Integer.parseInt(s.nextLine());
        int len = 5;

//		String str = s.nextLine();
        String str = "87 89 92 100 76";
//		String str = "87 89 92 92 92";//공동점수 테스트

        System.out.println(solution(len, str));

    }// end main

    private static String solution(int len,String str) {
//        System.out.println(len);
//        System.out.println(str);
        String answer = "";

        //1.문자열 배열에 할당
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));

        //2.정수배열로 변환1.
//		int[] score = new int[len];
//		for (int i=0;i<len;i++) {
//			score[i] = Integer.parseInt(arr[i]);
//		}
//		System.out.println(score);
//		System.out.println(Arrays.toString(score));

        //2.정수배열로 변환1.
        int[] score = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.toString(score));

        //3.등수를 할당할 배열 생성(0등은 없고 1등으로 초기화)
        int[] rank = new int[len];//0,0,0,....
        Arrays.fill(rank, 1);//0등은 없고 1등으로 초기화
        System.out.println(Arrays.toString(rank));

        //4.반복문으로 순위결정(동점일때 동일등수 적용)
        for (int x = 0; x < rank.length; x++) {
            //rank[x] = 1;
            for (int i = 0; i < rank.length; i++) {
                //x점수와 i점수들을 비교
                if(score[x] < score[i]) {
                    rank[x]++;
                }
            }
        }
        System.out.println(Arrays.toString(rank));

//		//5.리턴처리 변수에 할당1 : 반복문
//		for (int i : rank) {
//			answer += i + " ";
//		}

        //5.리턴처리 변수에 할당2 : 스트림
        answer = String.join(" ",
                Arrays.stream(rank).mapToObj(String::valueOf)
                        .toArray(String[]::new));

        return answer;
    }
}// end class