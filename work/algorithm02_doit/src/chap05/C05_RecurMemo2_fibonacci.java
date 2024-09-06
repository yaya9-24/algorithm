package chap05;

// 피보나치수열
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144...
//자, 여기서 아무 숫자나 하나 골라보자. 그 숫자는 직전 두 숫자의 합이다.
//즉, F(n) = F(n-2) + F(n-1) 과 같은 패턴을 가진다.
import java.util.Scanner;

class iC05_RecurMemo2_fibonacci {

	//1.반복문으로 피보나치 수열 풀기 - 코딩은 복잡해 보이지만 시간복잡도는 O(n) 낮다.
	static long fibonacci(long n) {
		if (n <= 1)
			return n;

		long cur = 1, sum = 0, temp;

		while (n > 1) {
			temp = cur;
			cur = cur + sum;
			sum = temp;
			System.out.print(sum+" ");
			n--;
		}
		System.out.println();

		return sum;

	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("정수를 입력하세요 : ");
//		int x = stdIn.nextInt();
		int x = 10+1;//while돌릴때는 1을 더해줘야 10까지 계산해준다.
//		int x = 50+1;////시간복잡도테스트 :   O(n)이므로 빠르다 , 12586269025

		System.out.println(fibonacci(x));
	}
}
