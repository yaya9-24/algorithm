package inf02number.test01.bignumber;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        String str1 = s.nextLine();
//        String str2 = s.nextLine();
        int str1 = 6;
        String str2 = "7 3 9 5 6 12";

        System.out.println(solution(str1,str2));
    }//end main

    private static String solution(int str1,String str2){
        String[] arr = str2.split(" ");
        List<Integer> list = Arrays.stream(arr).map(Integer::parseInt).toList();
        String answer = String.valueOf(list.get(0));
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i+1)>list.get(i)){
                answer += " "+ list.get(i + 1);
            }
        }

        return answer;
    }
}//end class