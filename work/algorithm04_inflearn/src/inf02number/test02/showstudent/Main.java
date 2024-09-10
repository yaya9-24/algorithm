package inf02number.test02.showstudent;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int len = s.nextInt();
//      테스트용 130 135 148 140 145 150 150 153
//		int[] nums = new int[] { 130, 135, 148, 140, 145, 150, 150, 153 };
        int[] nums = new int[len];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = s.nextInt();
        }
        System.out.println(solution(nums));
    }//end main

    private static String solution(int[] nums){
        Stack<Integer> stack = new Stack<>();
        String answer = "";
        stack.push(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (stack.peek()<nums[i]){
                stack.push(nums[i]);
            }
        }
        //System.out.println(stack);
        return answer+stack.size();
    }
}//end class