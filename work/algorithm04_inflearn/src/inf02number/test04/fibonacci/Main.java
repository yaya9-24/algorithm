package inf02number.test04.fibonacci;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        System.out.println(solution(num));
    }//end main

    private static String solution(int num){
        List<Integer> list = new ArrayList<>();
        String answer = "";
        for (int i = 0; i < num; i++) {
            if (i==0 || i==1) list.add(1);
            if (i>=2) list.add(list.get(i-1)+list.get(i-2));


        }
//        System.out.println(list);
        for (Integer x : list){
            answer += x+ " ";
        }




        return answer;
    }
}//end class