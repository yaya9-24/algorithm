package chap03;

import java.util.Arrays;
// 이진 검색
//이진 검색(binary search)은 요소가 오름차순 또는 내림차순으로 정렬된 배열에서 검색하는 알고리즘이다.
import java.util.Scanner;

class C02_BinarySearch1 {
	// --- 요솟수가 n개인 배열 a에서 key와 같은 요소를 이진 검색 ---//
	static int binSearch(int[] a, int n, int key) {
		int pl = 0; // 검색 범위의 첫 인덱스
		int pr = n - 1; // 검색 범위의 끝 인덱스

		do {
			int pc = (pl + pr) / 2; // 중앙 요소 인덱스
			if (a[pc] == key)
				return pc; // 검색 성공!
			else if (a[pc] < key)
				pl = pc + 1; // 검색 범위를 뒤쪽 절반으로 좁힘
			else
				pr = pc - 1; // 검색 범위를 앞쪽 절반으로 좁힘
		} while (pl <= pr);

		return -1; // 검색 실패
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

//		System.out.print("요솟수: ");
//		int num = stdIn.nextInt();
//		int[] x = new int[num]; // 요솟수가 num인 배열
//
//		System.out.println("오름차순으로 입력하세요.");
//
//		System.out.print("x[0]: "); // 첫 요소 입력받음
//		x[0] = stdIn.nextInt();
//
//		for (int i = 1; i < num; i++) {
//			do {
//				System.out.print("x[" + i + "]: ");
//				x[i] = stdIn.nextInt();
//			} while (x[i] < x[i - 1]); // 바로 앞의 요소보다 작으면 다시 입력받음
//		}
//
//		System.out.print("검색할 값: "); // 킷값을 읽어 들임
//		int ky = stdIn.nextInt();

		// 테스트용 : 5 7 15 28 29 31 39 58 68 70 95
		int num = 11;
		int[] x = new int[] {5,7,15,28,29,31,39,58,68,70,95};
		int ky = 39;
		

		// 방법1. 직접구현 - 원리 파악 및 구동의 이해
		int idx = binSearch(x, num, ky);    // 배열 x에서 값이 ky인 요소를 검색

		if (idx == -1)
			System.out.println("검색 값의 요소가 없습니다.");
		else
			System.out.println("검색 값은 x[" + idx + "]에 있습니다.");
	}
}