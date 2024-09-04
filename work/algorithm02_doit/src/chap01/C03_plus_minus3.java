package chap01;
// +와 -를 번갈아 출력(2)(개선)

import java.util.Scanner;

class C03_plus_minus3 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;

		System.out.println("+와 -를 번갈아 n개 출력합니다.");

		do {
			System.out.print("n값: ");
			n = stdIn.nextInt();
		} while (n <= 0);

		// 증가값을 2로 해서 반복문처리 , 초기값1 부터 시작
		for (int i = 1; i < n; i += 2)
			System.out.print("+-");

		if (n % 2 != 0)
			System.out.print("+");
	}
}