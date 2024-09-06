package chap05;

// 피보나치수열
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144...
//자, 여기서 아무 숫자나 하나 골라보자. 그 숫자는 직전 두 숫자의 합이다.
//즉, F(n) = F(n-2) + F(n-1) 과 같은 패턴을 가진다.
import java.util.Scanner;

class C05_RecurMemo2_fibonacci3 {

	//3.재귀함수 + 메모이제이션으로 피보나치 수열 풀기 - 
	//이미 계산한 값은 또 재귀로 계산할 필요가 없으므로
	//코딩은 간단하면서 시간복잡도는 O(n) 굳~.
	static long fibonacci(int n,long[] memo) {
		if(memo[n]!=0) return memo[n];
		if (n <= 1)
			return n;
		
		memo[n] = fibonacci(n - 1,memo) + fibonacci(n - 2,memo);
		System.out.print(memo[n]+" ");
		return memo[n];

	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("정수를 입력하세요 : ");
//		int x = stdIn.nextInt();
		int x = 10;//55
//		int x = 50;////시간복잡도테스트 :  O(n)이므로 빠르다 , 12586269025
		long[] memo = new long[x+2];//[0],[1]비워놓기 +2
		System.out.println(fibonacci(x,memo));
	}
}
