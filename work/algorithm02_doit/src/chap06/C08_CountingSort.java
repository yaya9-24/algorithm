package chap06;

import java.util.Arrays;
// 도수 정렬(계수 정렬,Counting sort)-범위 조건이 있을경우에 빠른 정렬을 할수있다.O(n) 
//도수  정렬은  요소의  대소  관계를  판단하지  않고  빠르게  정렬할  수 있는  알고리즘이다.
//도수 분포표: 각각의 값을 갖는 요소가 몇개인지 보여주는 표
// 지금까지의 정렬들은 위치를 바꾸면서(스왑) 정렬하는 알고리즘이었다면
// 카운팅정렬은 크기를 기준으로 갯수만 세어주면 되기때문에 위치를 바꿀필요가없고,모든 데이터에 한번씩만 접근(O(n))만하면된다.
import java.util.Scanner;

class C08_CountingSort {
	// --- 도수 정렬(배열 요소의 값은 0 이상 max 이하) ---//
	static void countingSort(int[] a, int n, int max) {
		int[] f = new int[max + 1]; // 누적도수
		int[] b = new int[n]; // 작업용 목표 배열

		//누적되는 값만큼 f배열에 카운팅 증가시켜준다.
		for (int i = 0; i < n; i++)
			f[a[i]]++; // [Step 1]
		for (int i = 1; i <= max; i++)
			f[i] += f[i - 1]; // [Step 2]
		for (int i = n - 1; i >= 0; i--)
			b[--f[a[i]]] = a[i]; // [Step 3]
		for (int i = 0; i < n; i++)
			a[i] = b[i]; // [Step 4]
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("도수 정렬");
		System.out.println("요솟수: ");
//        int nx = stdIn.nextInt();
//        int[] x = new int[nx];
//
//        for (int i = 0; i < nx; i++) {
//            do {
//                System.out.print("x[" + i + "]: ");
//                x[i] = stdIn.nextInt();
//            } while (x[i] < 0);
//        }
//
//        int max = x[0];
//        for (int i = 1; i < nx; i++)
//            if (x[i] > max) max = x[i];
//
//        countingSort(x, nx, max);        // 배열 x를 도수정렬
//
//        System.out.println("오름차순으로 정렬했습니다.");
//        for (int i = 0; i < nx; i++)
//            System.out.println("x[" + i + "]=" + x[i]);

		int nx = 9;//9명학생
		int max = 10;//0점~10점 만점(범위확정)
		int[] x = new int[] { 5, 7, 0, 2, 4, 10, 3, 1, 3 };
		System.out.println(Arrays.toString(x));
		System.out.println("===========");
		countingSort(x, nx,max); // 도수정렬
		System.out.println(Arrays.toString(x));

	}
}
