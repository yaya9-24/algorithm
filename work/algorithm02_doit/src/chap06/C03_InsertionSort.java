package chap06;
// 단순 삽입 정렬

//두번째 요소부터 선택하여 진행하는 정렬
//두번째요소가 첫번째요소보다 작다면 교환(버블정렬 스왑은 인접교환이며
// 삽입정렬 교환은 멀리떨어져있는 곳이후 요소는 우측으로 이동시켜준후에
// 삽입(그래서 삽입정렬)하는 스왑을 사용한다)

//장점: 정렬이 되었거나 또는 그 상태에 가까우면 정렬 속도가 아주 빠르다 
//단점: 삽입할 곳이 멀리 떨어지면 이동(대입)하는 횟수가 많다
import java.util.Arrays;
import java.util.Scanner;

class C03_InsertionSort {
	// --- 단순 삽입 정렬 ---//
	static void insertionSort(int[] a, int n) {
		int totalCount = 0;
		for (int i = 1; i < n; i++) {
			int j;
			int tmp = a[i];
			for (j = i; j > 0 && a[j - 1] > tmp; j--) {
				totalCount++;
				a[j] = a[j - 1];
			}
			a[j] = tmp;
		}
		System.out.println("totalCount:" + totalCount);
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("단순 삽입 정렬");
		System.out.println("요솟수: ");
//        int nx = stdIn.nextInt();
//        int[] x = new int[nx];
//
//        for (int i = 0; i < nx; i++) {
//            System.out.print("x[" + i + "] : ");
//            x[i] = stdIn.nextInt();
//        }
//
//        insertionSort(x, nx);        // 배열 x를 단순삽입정렬
//
//        System.out.println("오름차순으로 정렬했습니다.");
//        for (int i = 0; i < nx; i++)
//            System.out.println("x[" + i + "]=" + x[i]);

		int nx = 7;

		// 테스트1.삽입정렬의 경우 오름차순 정렬이 조금이라도 섞인 경우 이동횟수가 줄어든다.
//		int[] x = new int[] { 6, 4, 1, 7, 3, 9, 8 };//totalCount:7

		// 테스트2.오름차순 정렬인경우 이동횟수가 0이 된다.
//		int[] x = new int[] { 1, 2, 3, 4, 5, 6, 7 };//totalCount:0
		
		// 테스트3.역으로 정렬되어진 경우 이동횟수가 많아지는것을 확인 할 수 있다
		int[] x = new int[] { 9, 8, 7, 6, 4, 3,1 };//totalCount:21
		

		// 배열 x에서 최소값 먼저 찾고 0번방 값과 교환 후,
		// 그다음 작은 최소값찾고 1번방 값과 교환,,,하면서 반복하는 정렬
		insertionSort(x, nx);
		System.out.println(Arrays.toString(x));
	}
}
