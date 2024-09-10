package chap06;
//단순 버블 정렬(버전 3: 교환 횟수에 따른 멈춤)
//버전 2와 버전3은 교환횟수가 같다...교안 오타인듯.
import java.util.Arrays;
import java.util.Scanner;

class C01_BubbleSort3 {
	// --- 배열 요소 a[idx1]와 a[idx2]의 값을 교환 ---//
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// --- 버블 정렬(버전 3: 스캔 범위를 한정)---//
	// 교안 비교횟수 12회 오타 >> 18회
	static void bubbleSort(int[] a, int n) {
		int k = 0; // a[k]보다 앞쪽은 정렬을 마침
		int totalCount = 0;
		while (k < n - 1) {
			System.out.printf("k:%d...",k);
			int exchg = 0; // 패스에서 교환하는 횟수
			int last = n - 1; // 마지막으로 교환한 위치
			for (int j = n - 1; j > k; j--) {
				totalCount++;
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					last = j;
					exchg++;
				}
				System.out.print(exchg);
			}
			k = last;
			System.out.println("...exchg:"+exchg);
		}
		System.out.println("totalCount:"+totalCount);
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("단순교환정렬(버블정렬)");
		System.out.println("요솟수 : ");
//		int nx = stdIn.nextInt();
//		int[] x = new int[nx];
//
//		for (int i = 0; i < nx; i++) {
//			System.out.print("x[" + i + "] : ");
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
