package inf01string.test06.removestring;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //String str = s.nextLine();
		String str = "ksekkset";

        System.out.println(solution(str));
    }//end main

    private static String solution(String str){
        Queue<String> q = new LinkedList<>();
        String answer = "";
        char[] cs = str.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            if (!q.contains(String.valueOf(cs[i]))){
                q.offer(String.valueOf(cs[i]));
            }
        }
        //System.out.println(q);
        for (String x : q){
            answer += x;
        }
        return answer;
    }
}//end class