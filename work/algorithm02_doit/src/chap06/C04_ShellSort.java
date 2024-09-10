package chap06;

import java.util.Arrays;

// 셸 정렬(버전 1)

//셸 정렬은  단순  삽입  정렬의  장점을  살리고  
//단점을  보완하여  좀 더 빠르게  정렬하는  알고리즘이다.

//일정한 간격으로 서로 떨어져 있는 두 요소를 그룹으로 묶어 대략 정렬을 수행하고,
//간격을 좁혀 그룹의 수를 줄이면서 정렬을 반복하여 요소의 이동 횟수를 줄이는 방법이다.

//정렬해야 하는 횟수는 늘지만 전체적으로 요소의 이동 횟수가 줄어 들어 효율적으로 정렬할 수 있다.
import java.util.Scanner;

class C04_ShellSort {
	// --- 셸 정렬 ---//
	static void shellSort(int[] a, int n) {
		int totalCount = 0;

		// 3중첩 for문을 사용한다.
		// 4정렬 : 4칸 떨어져 있는 요소를 모아 배열을 4개의 그룹({8, 7}, {1, 6}, {4, 3}, {2, 5})으로 나누고
		// 각 그룹별로 정렬하면 {7,1,3,2,8,6,4,5} 로 정렬에 가까워짐
		// 2정렬 : 두칸씩 떨어진 요소들로 두그룹 {7,3,8,4},{1,2,6,5}
		// 교안참조 : {7,3,8,4}삽입정렬>>{3,4,7,8}, {1,2,6,5}>>{1,2,5,6} 합치면 [3, 1, 4, 2, 7, 5,
		// 8, 6]
		// 1정렬 : [3, 1, 4, 2, 7, 5, 8, 6]를 다시 삽입정렬 하면 끝

		for (int h = n / 2; h > 0; h /= 2) {
			System.out.println("h:" + h + "정렬 시작..");
			for (int i = h; i < n; i++) {
				System.out.println("  i:" + i + " ");

				int j;
				int tmp = a[i];

				if(h==4)System.out.printf("    {%d,%d}\n", a[i - h], tmp);

				for (j = i - h; j >= 0 && a[j] > tmp; j -= h) {
					System.out.print("    j:" + j + " ");
					totalCount++;
					a[j + h] = a[j];
				}
				a[j + h] = tmp;
				System.out.println();
				System.out.println("     a[" + j + " + " + h + "]:" + a[j + h]);
				System.out.println("===================");
			}
			System.out.println(h + "정렬완료 : " + Arrays.toString(a));
			System.out.println("**************************");
		}
		System.out.println("totalCount:" + totalCount);
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("셸 정렬(버전 1)");
		System.out.println("요솟수: ");
//		int nx = stdIn.nextInt();
//		int[] x = new int[nx];
//
//		for (int i = 0; i < nx; i++) {
//			System.out.print("x[" + i + "]: ");
//			x[i] = stdIn.nextInt();
//		}
//
//		shellSort(x, nx); // 배열 x를 셸정렬
//
//		System.out.println("오름차순으로 정렬했습니다.");
//		for (int i = 0; i < nx; i++)
//			System.out.println("x[" + i + "]=" + x[i]);

		int nx = 8;
		// 삽입정렬의 장단점을 보완했다는 것은 바꿔말하면 장점은 살려서 정렬에 가까울수록 빨라지고
		// 역정렬이 되어 있더라도 카운트를 삽입정렬보다 줄여준다.
		// 즉, 평균적이다
		int[] x = new int[] { 8, 1, 4, 2, 7, 6, 3, 5 };// totalCount:12
//		int[] x = new int[] { 9, 8, 7, 6, 5, 4, 3, 2 };//totalCount:12
//		int[] x = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };//totalCount:0
		shellSort(x, nx);
		System.out.println(Arrays.toString(x));

	}
}
