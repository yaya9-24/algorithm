package chap05;

// 재귀 함수를 메모화로 구현
//재귀함수의 문제점을 해결해주는 **메모화(memorization)
//컴퓨터 프로그램이 동일한 계산을 반복해야 할 때, 이전에 계산한 값을 메모리에 저장함으로써 
//동일한 계산의 반복 수행을 제거하여 프로그램 실행 속도를 빠르게 하는 기술이다.
import java.util.Scanner;

class C05_RecurMemo {
	static String[] memo;

	// --- 메모화를 도입한 메서드 recur ---//
	static void recur(int n) {
//		System.out.println("a:"+n);
		if (memo[n + 1] != null) {
			//출력문을 주석하면 속도가 향상됨. 이부문으로 인해 메모리 이해가 힘든 관계로
			//다음 클래스에 피보나치수열을 이용한 메모리처리 소스를 추가하였으니 그것으로 학습하겠습니다.
//			System.out.println("memo:"+memo[n + 1]); // 메모를 출력
		}
		else {
			if (n > 0) {
				recur(n - 1);
				System.out.println("b:"+n);
//				System.out.println(n);
				recur(n - 2);
				memo[n + 1] = memo[n] + n + "\n" + memo[n - 1]; // 메모화
			} else {
				memo[n + 1] = ""; // 메모화 : recur(0)과 recur(-1)은 빈 문자열
			}
		}
//		System.out.println("....return");
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("정수를 입력하세요 : ");
//		int x = stdIn.nextInt();
		int x = 10;
//		int x = 40;

		memo = new String[x + 2];//빈문자 두개 [0],[1]들어가야하므로 +2
		recur(x);
		System.out.println("end main....");
	}
}
