package inf01string.test01.findchar;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        String str2 = s.nextLine();
//		String str1 = "Computercooler";
//		String str2 = "c";

        System.out.println(solution(str1,str2));


    }//end main

    private static String solution(String str1,String str2) {
//		System.out.printf("%s\n%s\n",str1,str2);
        String answer = "";
        int count = 0;

        String[] arr = str1.split("");

//		System.out.println(Arrays.toString(arr));
        //1.반복문
//		for (int i = 0; i < arr.length; i++) {
////			System.out.println(arr[i].equalsIgnoreCase(str2));
//			if(arr[i].equalsIgnoreCase(str2)) {
//				count++;
//			}
//		}

        //2.스트림
        answer += Arrays.asList(arr).stream()
                .filter(i->i.equalsIgnoreCase(str2)).count();

        return answer;
    }

}//end class