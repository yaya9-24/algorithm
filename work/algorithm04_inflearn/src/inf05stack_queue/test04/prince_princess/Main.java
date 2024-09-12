package inf05stack_queue.test04.prince_princess;

import java.util.Scanner;


public class Main {
    /*
     * 큐로 푸는 공주 구하기
     * 큐에 왕자번호를 넣는다
     * k=3일때 친사람이(3번째 사람) 빠져야한다
     * 큐를 두개 뒤로보내고 3번째는 poll하고
     * 다시 두개 뒤로보내고 3번재는 poll하고
     * 1사람 남을때까지~
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = 8;//왕자8명, 1~8번
        int k = 3;

        System.out.println(solution(n,k));
    }

    private static int solution(int n,int k) {
        int answer = 0;

        java.util.Queue<Integer> q = new java.util.LinkedList<>();

        //왕자님들 큐에 할당
        for (int i = 1; i <= n; i++) {
            q.offer(i);
        }
        System.out.println(q);
        System.out.println("====================");
        while(!q.isEmpty()) {
            for (int i = 1; i < k; i++) {
                q.offer(q.poll());//k앞쪽 왕자들은 뽑아서 뒤로 이동
            }
            System.out.println(q);
            q.poll();//k번째 제거
            if(q.size()==1) {//큐사이즈가 1이되면
                answer = q.poll();//구출한 왕자님의 번호가된다.
            }
        }

        return answer;
    }
}