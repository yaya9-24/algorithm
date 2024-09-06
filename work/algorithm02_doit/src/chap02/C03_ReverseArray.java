package chap02;
// 배열 요소에 값을 읽어 들여 역순으로 정렬

import java.util.Arrays;
import java.util.Scanner;

class C03_ReverseArray {
	// --- 배열 요소 a[idx1]과 a[idx2]의 값을 바꿈 ---//
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// --- 배열 a의 요소를 역순으로 정렬 ---// 끝인덱스는 항상 length-1
	static void reverse(int[] a) {
		for (int i = 0; i < a.length / 2; i++)
			swap(a, i, (a.length- 1) - i );
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("요솟수: ");
		int num = stdIn.nextInt(); // 요솟수

		int[] x = new int[num]; // 요솟수가 num인 배열

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}

		reverse(x); // 배열 a의 요소를 역순으로 정렬

		System.out.println("요소를 역순으로 정렬했습니다.");
		System.out.println("x = " + Arrays.toString(x));
	}
}
