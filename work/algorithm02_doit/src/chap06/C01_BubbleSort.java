package chap06;
//단순 버블 정렬(버전 1)
//세 가지  단순  정렬(버블, 선택, 삽입)의 시간  복잡도는  모두  O(n2)이다. (효율이  좋지  않다)
import java.util.Arrays;
import java.util.Scanner;

class C01_BubbleSort {

	// --- 배열 요소 a[idx1]와 a[idx2]의 값을 교환 ---//
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// --- 버블 정렬 1 ---//
	// 오른쪽부터 왼쪽으로 비교하는 메소드
	static void bubbleSort(int[] a, int n) {
		int totalCount = 0;
		for (int i = 0; i < n - 1; i++) {
			System.out.printf("i:%d...",i);
			int exchg = 0; // 패스에서 교환하는 횟수
			//시작값이 n-1부터 i
			for (int j = n - 1; j > i; j--) {
				totalCount++;
				//j-1,j비교 후 좌측값이 작으면 스왑
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					exchg++;
				}
				System.out.print(exchg);
			}
			System.out.println("...exchg:"+exchg);
		}
		System.out.println("totalCount:"+totalCount);
	}

	// --- 버블 정렬 2 ---//
	// 왼쪽부터 오른쪽으로 비교하는 메소드
//	static void bubbleSortRight(int[] a, int n) {
//		for (int i = 0; i < n - 1; i++) {
////			시작값이 0부터~ n-1
//			for (int j = 0; j < n - 1; j++) {
////				j,j+1 비교  후 좌측값이 크면 스왑
//				if (a[j + 1] < a[j]){
//					//비교연산자를 반대(> 를 <로)로
//					swap(a, j + 1, j);
//				}
//			}
//		}
//	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("버블 정렬(버전 1)");
		System.out.println("요솟수: ");
//		int nx = stdIn.nextInt();
//		int[] x = new int[nx];
//
//		for (int i = 0; i < nx; i++) {
//			System.out.print("x[" + i + "]: ");
//			x[i] = stdIn.nextInt();
//		}

//		bubbleSort(x, nx); // 배열 x를 단순교환정렬
//		System.out.println("오름차순으로 정렬했습니다.");
//		for (int i = 0; i < nx; i++)
//			System.out.println("x[" + i + "]=" + x[i]);
		int nx = 7;
		int[] x = new int[] { 6, 4, 3, 7, 1, 9, 8 };
		bubbleSort(x, nx); // 배열 x를 우측끝에서부터 인접한 두자리씩 비교해서 좌측으로 정렬
//		bubbleSortRight(x, nx); // 배열 x를 좌측끝에서부터 ... 우측으로 정렬
		System.out.println(Arrays.toString(x));

	}
}
