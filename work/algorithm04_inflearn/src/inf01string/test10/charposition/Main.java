package inf01string.test10.charposition;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//		String str = s.nextLine();
        String str = "teachermode e";

        String[] strs = str.split(" ");
        System.out.println(solution(strs[0],strs[1].charAt(0)));


    }//end main

    private static String solution(String str,char c) {
        System.out.println(str);
        System.out.println(c);
        String answer = "";

        //[t, e, a, c, h, e, r, m, o, d, e]
        // 1  0  1  2  1  0  1  2  2  1  0

        //1.char배열
        char[] cs = str.toCharArray();

        ArrayList<String> arr = new ArrayList<>();

        //2.char배열을 좌에서 우로로 반복하면서 얼마나 떨어져있는지~
        int count = 0;
        for (int i = 0; i < cs.length; i++) {
//			System.out.println(cs[i]);
            if(cs[i]==c) {
                count = 0;
                arr.add(String.valueOf(count));
            }else {
                count++;
                arr.add(String.valueOf(count));
            }
        }
//		System.out.println(arr);

        //3.우에서 좌로 ~~~
        count = 0;
        for (int i = cs.length-1; i >= 0; i--) {
//			System.out.println(cs[i]);
            if(cs[i]==c) {
                count = 0;
                //같을때는 다시 추가필요없음.
            }else {
                count++;
                //좌측에서의 거리와 우측에서의 거리중 최소값으로 변경
//				arr.set(i,
//						String.valueOf(count));
                arr.set(i, String.valueOf(Math.min(Integer.parseInt(arr.get(i)), count)));
            }
        }
//		System.out.println(arr);
        answer = String.join(" ", arr);

        return answer;
    }
}//end class