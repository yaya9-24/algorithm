package inf05stack_queue.test02.alpabrackets;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    /*
     * 스택을 사용하여 소괄호 () 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하기
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//		String str = s.nextLine();

        // 테스트용
        String str = "(A(BC)D)EF(G(H)(IJ)K)LM(N)"; // 결과: EFLM

        System.out.println(solution(str));
    }

    private static String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()){
            if (c!=')'){
                stack.push(c);
            }else {
                while(stack.pop()!='('){

                }
            }
        }
        for (char c : stack){
            answer +=c;
        }
        return answer;
    }
}