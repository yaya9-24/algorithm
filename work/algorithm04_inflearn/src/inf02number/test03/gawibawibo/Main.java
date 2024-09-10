package inf02number.test03.gawibawibo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int len = Integer.parseInt(s.nextLine());
//		int len = 5;

        String strA = s.nextLine();
//		String strA = "2 3 3 1 3";

        String strB = s.nextLine();
//		String strB = "1 1 2 2 3";

        System.out.println(solution(len,strA,strB));
    }//end main

    private static String solution(int len,String strA,String strB){
        int[] arrA = Arrays.stream(strA.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arrB = Arrays.stream(strB.split(" ")).mapToInt(Integer::parseInt).toArray();
        String answer = "";
        for (int i = 0; i < len; i++) {
            if (arrA[i]>arrB[i]){
                answer += "A"+"\n";
            } else if (arrA[i]<arrB[i]){
                answer += "B"+"\n";
            } else answer += "D"+"\n";
        }
        answer =answer.strip();
        return answer;
    }
}//end class