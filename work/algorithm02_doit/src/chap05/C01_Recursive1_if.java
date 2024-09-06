package chap05;
// 재귀에 대한 이해를 돕는 순수 재귀 메서드

import java.util.Scanner;

class C01_Recursive1_if {
	// --- 순수 재귀 메서드 ---//
	
	static void recur(int n) {
		System.out.println("a:" + n);// 5,4,3,2,1,0
		if (n > 0) {
			recur(n - 1);// 9라인 재귀호출

			// a를 찍으면서 재귀호출되던 가장 마지막함수부터 sysout 찍으며 리턴된다.
			//즉,a:0찍는 재귀함수가 가장마지막 함수로서 분기문 안들어가니까 리턴
			//그다음 a:1 찍었던함수 sysout b:1 리턴
			//그다음 a:2 찍었던함수 sysout b:2 리턴
			//그다음 a:3 찍었던함수 sysout b:3 리턴
			//그다음 a:4 찍었던함수 sysout b:4 리턴
			//그다음 a:5 찍었던함수 sysout b:5 리턴
			System.out.println("b:" + n);// 1,2,3,4,5
//			System.out.println(n); 
			
		}
		System.out.println("........return....");
		// 더이상 남은 재귀함수 없으면 최초호출한 곳으로 ~~~~
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("정수를 입력하세요 : ");
//        int x = stdIn.nextInt();
		int x = 5;

		recur(x);
		System.out.println("end main....");
	}
}
