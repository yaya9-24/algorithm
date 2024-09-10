package chap06;
//단순 버블 정렬(버전 2: 교환 횟수에 따른 멈춤)

import java.util.Arrays;
import java.util.Scanner;

class C01_BubbleSort2 {
	// --- 배열 요소 a[idx1]와 a[idx2]의 값을 교환 ---//
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// --- 단순교환정렬(버전 2 : 교환 횟수에 따른 멈춤)---//
	// 교안 비교횟수 20회 오타 >> 18회
	static void bubbleSort(int[] a, int n) {
		int totalCount = 0;
		for (int i = 0; i < n - 1; i++) {
			System.out.printf("i:%d...",i);
			int exchg = 0; // 패스에서 교환하는 횟수
			for (int j = n - 1; j > i; j--) {
				totalCount++;
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					exchg++;
				}
				System.out.print(exchg);
//				if (exchg == 0)
//					break; // 여기에서 멈추면 정렬이 안됩니다~
			}
			System.out.println("...exchg:"+exchg);
			if (exchg == 0)
				break; // 교환이 이루어지지 않으면 멈춤
		}
		System.out.println("totalCount:"+totalCount);
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("버블 정렬)");
		System.out.println("요솟수: ");
//		int nx = stdIn.nextInt();
//		int[] x = new int[nx];
//
//		for (int i = 0; i < nx; i++) {
//			System.out.print("x[" + i + "]: ");
//			x[i] = stdIn.nextInt();
//		}
//
//		bubbleSort(x, nx); // 배열 x를 단순교환정렬
//
//		System.out.println("오름차순으로 정렬했습니다.");
//		for (int i = 0; i < nx; i++)
//			System.out.println("x[" + i + "]=" + x[i]);

		int nx = 7;
		int[] x = new int[] { 6, 4, 3, 7, 1, 9, 8 };
		bubbleSort(x, nx); // 배열 x를 우측끝에서부터 인접한 두자리씩 비교해서 좌측으로 정렬
		System.out.println(Arrays.toString(x));

	}
}
