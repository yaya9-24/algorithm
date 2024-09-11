package inf05stack_queue.test01.brackets;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    /*
     * 스택
     * 올바른 괄호

     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//		String str = s.nextLine();

        // 테스트용
        String str = "(()(())(()";//NO
//		String str = "(())()";//YES

        //풀이 요령
        //스텍에 여는괄호부터 쌓기 시작하여 닿는 괄호가 올때마다
        //닿는 괄호는 스텍이 쌓지않고 여는괄호를 스텍에서 1:1로 제거해준다.
        //딱맞아떨어져서 더이상 지울께없을때는 ,YES
        //그이외에는 NO처리하면된다.

        System.out.println(solution(str));
    }

    private static String solution(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()){
            if (c=='('){
                stack.push(c);
            }else {
                if (stack.isEmpty()){
                    return "NO";
                }else stack.pop();
            }
        }
        if (!stack.isEmpty()) return "NO";
        return answer;
    }
}