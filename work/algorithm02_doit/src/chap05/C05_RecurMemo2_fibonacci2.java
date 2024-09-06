package chap05;

// 피보나치수열
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144...
//자, 여기서 아무 숫자나 하나 골라보자. 그 숫자는 직전 두 숫자의 합이다.
//즉, F(n) = F(n-2) + F(n-1) 과 같은 패턴을 가진다.
import java.util.Scanner;

class C05_RecurMemo2_fibonacci2 {

	//2.재귀함수로 피보나치 수열 풀기 - 코딩은 간단하지만 시간복잡도는 O(2^n) 높다.
	static long fibonacci(long n) {
		if (n <= 1)
			return n;
		return fibonacci(n - 2) + fibonacci(n - 1);

	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("정수를 입력하세요 : ");
//		int x = stdIn.nextInt();
		int x = 10;
//		int x = 50;//시간복잡도는 O(2^n)이므로 30초정도로 느려짐을 알수있다.,12586269025
//		System.out.println(Math.pow(2, 50));//O(2^n)
		System.out.println(fibonacci(x));
	}
}
