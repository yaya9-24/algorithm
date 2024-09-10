package inf01string.test05.reversestring2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
//		String str = "a#b!GE*T@S";

        System.out.println(solution(str));


    }//end main

    private static String solution(String str) {
//		System.out.println(str);
        String answer = "";

        //good 스왑
        char[] cs = str.toCharArray();
        int left = 0;
        int right = str.length()-1;

        while(left<right) {
//			System.out.println(Character.isAlphabetic(cs[left]));
//			System.out.println(Character.isAlphabetic(cs[right]));

            if(!Character.isAlphabetic(cs[left])) {
                left++;
            }else if(!Character.isAlphabetic(cs[right])) {
                right--;
            }else {
                char temp = cs[left];
                cs[left] = cs[right];
                cs[right] = temp;
                left++;
                right--;
            }
        }
//		System.out.println(String.valueOf(cs));
        answer = String.valueOf(cs);
        return answer;
    }

}//end class