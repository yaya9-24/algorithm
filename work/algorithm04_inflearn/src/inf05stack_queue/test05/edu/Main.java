package inf05stack_queue.test05.edu;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    /*
     * 큐로 푸는 교육과정 설계
     *
     * 필수과목의 순서에 맞게 교육과정 신청을 했는지 큐를 사용해서 검증하는 문제
     *
     * 신청과목을 한자한자 잘라서 신청과목의 첫과목이 필수과목에 존재하는지 확인하고 있으면 필수과목 큐의 peek과 같으면 poll해서서
     * 제거한다(만약 같지않다면 잘못설계 NO리턴) 다시반복,,하다가 큐의 사이즈가 0이되면 설계완벽 YES 만약,신청과목 검증이 끝났는데
     * 필수과목 큐에 남은게 있다면 잘못설계한것이니 NO 리턴
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String need = "CAB";// 필수과목 큐에 넣을 내용
        String myPlan = "CBDAGE";// 신청과목 큐에 넣을 필요없다.

        System.out.println(solution(need, myPlan));
    }

    private static String solution(String need, String myPlan) {
        String answer = "YES";

        Queue<Character> queue = new LinkedList<>();
        for (char c : need.toCharArray()){
            queue.offer(c);
        }
        System.out.println(queue);

        for (char x : myPlan.toCharArray()){
            if (queue.contains(x) && queue.peek() == x){
                queue.poll();
            }

            if (queue.isEmpty()){
                return answer;
            }
        }
        if (!queue.isEmpty()) return "NO";

        return answer;
    }
}