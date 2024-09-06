package chap05;

// 참고 : 약수 구하기
// 약수 : 0을 제외하고, n보다 작거나 같은 값 중 나눌때 나머지가 0인 값이다.
import java.util.Scanner;

class C03_EuclidGCD3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("약수를 구합니다.");

		System.out.print("정수를 입력하세요 : ");
		int x = stdIn.nextInt();

		for (int i = 1; i <= x; i++) {
			if (x % i == 0)
				System.out.println(i + " ");
		}

		System.out.println("약수는 " + x + "입니다.");
	}
}
