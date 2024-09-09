package inf01string.test01.findchar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        //String str = s.nextLine();
        //String input = s.nextLine();
        String str = "Computercoolerccc";
        String input = "c";
        String answer = solution(str,input);
        System.out.println(answer);
    }//end main

    private static String solution(String str,String input){
        String answer ="";
        int count = 0;
        String[] arr = str.split("");

        for (int i = 0; i < arr.length; i++) {
            //System.out.println(arr[i].equalsIgnoreCase(input));
            if (arr[i].equalsIgnoreCase(input)){
                count++;
            }
        }
        return answer+count;
    }
}//end class