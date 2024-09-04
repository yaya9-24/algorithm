package chap01;
// +와 -를 번갈아 출력(2)

import java.util.Scanner;

class C03_plus_minus2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;

		System.out.println("+와 -를 번갈아 n개 출력합니다.");

		do {
			System.out.print("n값: ");
//            n = stdIn.nextInt();
			n = 5;
		} while (n <= 0);

		// n값을 반으로 줄여서 반복문처리, 초기값0 부터시작
//        for (int i = 0; i < n / 2; i++)
//            System.out.print("+-");

		// n값을 반으로 줄여서 반복문처리, 초기값1 부터시작
		for (int i = 1; i <= n / 2; i++)
			System.out.print("+-");

		// n이 홀수일때는 끝에 + 찍어주야함.
		if (n % 2 != 0)
			System.out.print("+");
	}
}
