package inf05stack_queue.test03.kakao;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    /*
     * 크레인 인형뽑기 : 2019년 카카오 개발자 인턴십 출제문제
     * 프로그래머스에서도 동일한 문제풀기가 제공된다.
     * 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/64061
     *
     * 프로그래머스 코딩역량인증시험은 SW 전공자와 비전공자 모두의 코딩역량인증을 위해 2종류의 인증시험을 운영합니다.
        PCCP (프로그래머스 코딩전문역량인증시험)
        권장대상 : SW 전공자 및 중/상급 학습자
        응시과목 : Python, Java, JavaScript, C++ 중 1개 언어 선택하여 평가
        문항수 : 4문항
        시험시간 : 120분
        시험구성 : 코드 작성
        자격증 유효기간 : (응시일 기준으로 ) 2년

        PCCE (프로그래머스 코딩필수역량인증시험)
        권장대상 : 비전공자, 초/중급 학습자
        응시과목 : Python, Java, C++ 중 1개 언어 선택하여 평가
        문항수 : 10문항
        시험시간 : 50분
        시험구성 : 빈칸채우기, 디버깅, 코드 작성
        자격증 유효기간 : (응시일 기준으로) 7년
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//		int len = s.nextInt();//행,열 수
//		int[][] board = new int[len][len];
//		for (int x = 0; x < board.length; x++) {
//			for (int i = 0; i < board[x].length; i++) {
//				board[x][i] = s.nextInt();
//			}
//		}
        int[][] board = {
                {0,0,0,0,0},
                {0,0,1,0,3},
                {0,2,5,0,1},
                {4,2,4,4,2},
                {3,5,1,3,1}
        };
//		int len2 = s.nextInt();
//		int[] moves = new int[len2];
//		for (int i = 0; i < moves.length; i++) {
//			moves[i] = s.nextInt()
//		}
        int[] moves = {1,5,3,5,1,2,1,4};
        System.out.println(solution(board,moves));
    }

    private static int solution(int[][] board,int[] moves) {
        int answer = 0;

        //크레인으로 들어올린 인형을 쌓아놓을 스텍을 생성한다.
        //참고 : 만약 프로그래머스에서 문제풀이를 스택을 사용할때는 패키지경로를 다 적어줘야한다.
        //이유 : 솔루션 함수의 내부 로직만 변경하기때문에 import를 구현할 수없다.
        java.util.Stack<Integer> st = new java.util.Stack<>();

        for (int target : moves) {//크레인 8번 이동할 반복문
            System.out.println("target:"+target);
            for (int i = 0; i < board.length; i++) {
                System.out.printf("%d,%d,%d,%d,%d\n",
                        board[i][0],
                        board[i][1],
                        board[i][2],
                        board[i][3],
                        board[i][4]
                );
                //board의 각요소별 인덱스는 0부터이고
                //moves의 각요소의 값은 칸번호를 의미하므로 target-1을 해준다.
                //각 타겟을 찾아서 크레인이 내려오는 경로를 출력해본다.
                int path = board[i][target-1];
                System.out.println(path);

                //크레인의 목적1 : 인형이 없는 공간(0)은 지나가야한다
                if(path != 0) {
                    System.out.println("path:"+path);

                    //크레인의 목적2 : 경로상의 첫번째 인형을 집게로 들어올려한다.
                    int temp = path;//집게변수temp에 path 저장

                    //집어 올렸으니 경로에는 인형이 없으니 0으로 초기화
                    board[i][target-1] = 0;

                    //스텍이 비어있지않은 상태에서 동시에
                    //집게로 집은 인형과 스텍의 peek이 같다면 뿅~하고 두개가 사라져야 하기에
                    //스텍에는 쌓지않고 마지막 스텍대상 제거 및 카운트를 2개 올려준다.
                    if(!st.isEmpty() && temp == st.peek()) {
                        System.out.printf("temp:%d, st.peek():%d\n",temp, st.peek());
                        st.pop();
                        answer += 2;
                    }else { //동일 인형이 아닌경우는 스텍에 쌓아준다
                        st.push(temp);
                    }
                    break;//크레인 한번의 움직임에 한번만 수행하면되니 board탈출 후 다음moves반복
                }
            }//end board for
            System.out.println("--------------------");
        }//end movie for

        return answer;
    }
}