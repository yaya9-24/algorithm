package chap06;

import java.util.Arrays;
// 병합 정렬(‘존 폰 노이만(John von Neumann)’이라는 사람이 제안한 방법(O(N*logN))
//병합 정렬은 배열을 앞부분과 뒷부분 둘로 나누어 각각 정렬한 다음 병합하는 작업을 반복하여 정렬하는 알고리즘이다.
//***과정 설명
//리스트의 길이가 0 또는 1이면 이미 정렬된 것으로 본다. 그렇지 않은 경우에는
//1.분할-정렬되지 않은 리스트를 절반으로 잘라 비슷한 크기의 두 부분 리스트로 나눈다.
//2.정복-각 부분 리스트를 재귀적으로 합병 정렬을 이용해 정렬한다.
//3.결합-두 부분 리스트를 다시 하나의 정렬된 리스트로 합병한다.
import java.util.Scanner;

class C06_MergeSort {
	static int[] buff; // 작업용 배열

	// --- a[left] ~ a[right]를 재귀적으로 병합정렬 ---//
	static void __mergeSort(int[] a, int left, int right,String name) {
		System.out.printf("left:%d,right:%d...%s\n",left,right,name);
		if (left < right) {
			int i;//for,while동시에 사용하기위해 따로 선언
			int center = (left + right) / 2; //1.분할
			System.out.println("center:"+center);
			int p = 0;
			int j = 0;
			int k = left;

			//2.정복-[그림6-30]
			__mergeSort(a, left, center,"...left sort"); // 전반부를 병합정렬
			__mergeSort(a, center + 1, right,"...right sort"); // 후반부를 병합정렬
			System.out.println(Arrays.toString(a));
			System.out.println("==============");
			
			//3.결합-[그림6-31]
			for (i = left; i <= center; i++)
				buff[p++] = a[i];//반반정렬된배열중 왼쪽반을 버프배열에 저장.
			
			//a배열뒷부분과 buff배열을 a에 병합
			while (i <= right && j < p)
				a[k++] = (buff[j] <= a[i]) ? buff[j++] : a[i++];

			//buff배열에 남아있는 요소를 a배열에 할당.
			while (j < p)
				a[k++] = buff[j++];
		}
		System.out.println("return..."+name);
	}

	// --- 병합 정렬 ---//
	static void mergeSort(int[] a, int n) {
		buff = new int[n]; // 작업용 배열을 생성

		__mergeSort(a, 0, n - 1,"...main sort"); // 배열 전체를 병합 정렬

		buff = null; // 작업용 배열을 해제
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("병합 정렬");
		System.out.println("요솟수: ");
//        int nx = stdIn.nextInt();
//        int[] x = new int[nx];
//
//        for (int i = 0; i < nx; i++) {
//            System.out.print("x[" + i + "]: ");
//            x[i] = stdIn.nextInt();
//        }
//
//        mergeSort(x, nx);        // 배열 x를 병합정렬
//
//        System.out.println("오름차순으로 정렬했습니다.");
//        for (int i = 0; i < nx; i++)
//            System.out.println("x[" + i + "]=" + x[i]);

		int nx = 12;
		int[] x = new int[] { 1, 3, 12, 6, 4, 11, 8, 7, 3, 2, 6, 5 };
		System.out.println(Arrays.toString(x));
		System.out.println("==============");
		mergeSort(x, nx);
		System.out.println(Arrays.toString(x));

	}
}