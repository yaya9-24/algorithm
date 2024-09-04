package chap01;
import java.util.Arrays;
import java.util.Scanner;
//Arrays.sort() 정렬
class C06_Median2 {
	static int med3(int... sus) {
		
		Arrays.sort(sus);
		int median = sus[sus.length/2];
		
		return median;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("세 정수의 중앙값을 구합니다.");
		System.out.print("a 값 : ");
		int a = stdIn.nextInt();
		
		System.out.print("b 값 : ");
		int b = stdIn.nextInt();
		
		System.out.print("c 값 : ");
		int c = stdIn.nextInt();

		System.out.println("중앙값은 " + med3(a,b,c) + "입니다.");
	}
}