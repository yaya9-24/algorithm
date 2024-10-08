package chap06;
// 퀵 정렬(비재귀 버전)

import java.util.Arrays;
import java.util.Scanner;

class C05_QuickSort2 {
    //--- 배열 요소 a[idx1]와 a[idx2]의 값을 교환 ---//
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];  a[idx1] = a[idx2];  a[idx2] = t;
    }

    //--- 퀵 정렬(비재귀 버전)---//
    static void quickSort(int[] a, int left, int right) {
        C05_QuickSort2IntStack lstack = new C05_QuickSort2IntStack(right - left + 1);
        C05_QuickSort2IntStack rstack = new C05_QuickSort2IntStack(right - left + 1);

        lstack.push(left);
        rstack.push(right);

        while (lstack.isEmpty() != true) {
            int pl = left  = lstack.pop();        // 왼쪽 커서
            int pr = right = rstack.pop();        // 오른쪽 커서
            int x = a[(left + right) / 2];        // 피벗은 가운데 요소

            do {
                while (a[pl] < x) pl++;
                while (a[pr] > x) pr--;
                if (pl <= pr)
                    swap(a, pl++, pr--);
            } while (pl <= pr);

            if (left < pr) {
                lstack.push(left);           // 왼쪽 그룹 범위의
                rstack.push(pr);             // 인덱스를 푸시
            }
            if (pl < right) {
                lstack.push(pl);             // 오른쪽 그룹 범위의
                rstack.push(right);          // 인덱스를 푸시
            }
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("퀵 정렬");
        System.out.println("요솟수: ");
//        int nx = stdIn.nextInt();
//        int[] x = new int[nx];
//
//        for (int i = 0; i < nx; i++) {
//            System.out.print("x[" + i + "]: ");
//            x[i] = stdIn.nextInt();
//        }
//
//        quickSort(x, 0, nx - 1);            // 배열 x를 퀵정렬
//
//        System.out.println("오름차순으로 정렬했습니다.");
//        for (int i = 0; i < nx; i++)
//            System.out.println("x[" + i + "]=" + x[i]);
        
		int nx = 8;

		int[] x = new int[] { 175, 170, 160, 168, 165, 170, 155, 150 };
//		int[] x = new int[] { 6, 4, 1, 7, 3, 9, 8,0 };

		System.out.println("=======정렬전=====");
		System.out.println(Arrays.toString(x));
		System.out.println("================");
		quickSort(x, 0, nx - 1);
		System.out.println("=======정렬후=====");
		System.out.println(Arrays.toString(x));
    }
}
