package chap06;
// 단순 선택 정렬
//작은 최소값찾고 i번방 값부터 차근차근 교환,,,하면서 반복하는 정렬

//참고: 선택 정렬은 서로 떨어져 있는 요소를 교환하므로 안정적이지 않다.
//예를들면,중복된 값이 두개 있을때 두요소의 순서가 뒤바뀌게 되는 것이다.
import java.util.Arrays;
import java.util.Scanner;

class C02_SelectionSort {
	// --- 배열 요소 a[idx1]와 a[idx2]의 값을 교환 ---//
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// --- 단순 선택 정렬 ---//
	static void selectionSort(int[] a, int n) {
		int totalCount = 0;
		//1.0~n-2 까지 돌리는 루프(이유:내부포문인 i+1해야해서 끝까지 돌리면안된다)
		for (int i = 0; i < n - 1; i++) {
			//2.루프돌때마다 0번방을 최소값인덱스로 지정
			int min = i; 
			for (int j = i + 1; j < n; j++) {
				totalCount++;
				//3.i+1요소부터 증가시키면서 최소인덱스로 지정된 값과 비교  
				if (a[j] < a[min]) {
					//4.작은값일때 해당j인덱스를 최소값인덱스로 재할당.
					min = j;
				}
			}
			//5.최소값의 인덱스를 찾았다면 스왑
			swap(a, i, min); // 아직 정렬되지 않은 부분의 첫 요소와 가장 작은 요소를 교환
		}
		System.out.println("totalCount:"+totalCount);
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("단순 선택 정렬");
		System.out.println("요솟수: ");
//        int nx = stdIn.nextInt();
//        int[] x = new int[nx];
//
//        for (int i = 0; i < nx; i++) {
//            System.out.print("x[" + i + "] : ");
//            x[i] = stdIn.nextInt();
//        }
//
//        selectionSort(x, nx);            // 배열 x를 단순선택정렬
//
//        System.out.println("오름차순으로 정렬했습니다.");
//        for (int i = 0; i < nx; i++)
//            System.out.println("x[" + i + "]=" + x[i]);

		int nx = 7;
		int[] x = new int[] { 6, 4, 8, 3, 1, 9, 7 };
		// 배열 x에서 최소값 먼저 찾고 0번방 값과 교환 후,
		// 그다음 작은 최소값찾고 1번방 값과 교환,,,하면서 반복하는 정렬
		System.out.println(Arrays.toString(x));
		System.out.println("===================");
		selectionSort(x, nx);
		System.out.println(Arrays.toString(x));

	}
}
