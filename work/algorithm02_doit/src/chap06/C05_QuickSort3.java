package chap06;
// 퀵 정렬(개선한 버전)

import java.util.Scanner;

class C05_QuickSort3 {
	
    //--- 배열 요소 a[idx1]와 a[idx2]의 값을 교환 ---//
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];  a[idx1] = a[idx2];  a[idx2] = t;
    }

    //--- x[a], x[b], x[c]을 정렬(중앙값의 인덱스를 반환)---//
    static int sort3elem(int[] x, int a, int b, int c) {
        if (x[b] < x[a]) swap(x, b, a);
        if (x[c] < x[b]) swap(x, c, b);
        if (x[b] < x[a]) swap(x, b, a);
        return b;
    }

    //--- 퀵 정렬 ---//
    static void quickSort(int[] a, int left, int right) {
        int pl = left;                                  // 왼쪽 커서
        int pr = right;                                 // 오른쪽 커서
        int m = sort3elem(a, pl, (pl + pr) / 2, pr);    // 맨 앞・맨 끝・가운데를 정렬
        int x = a[m];                                   // 피벗

        swap(a, m, right - 1);            // 가운데 요소와 맨 끝에서 2번째 요소를 교환 
        pl++;                             // 왼쪽 커서를 1 오른쪽으로
        pr -= 2;                          // 오른쪽 커서를 2 왼쪽으로

        do {
            while (a[pl] < x) pl++;
            while (a[pr] > x) pr--;
            if (pl <= pr)
                swap(a, pl++, pr--);
        } while (pl <= pr);

        if (left < pr)  quickSort(a, left, pr);
        if (pl < right) quickSort(a, pl, right);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("퀵 정렬");
        System.out.print("요솟수: ");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = stdIn.nextInt();
        }

        quickSort(x, 0, nx - 1);            // 배열 x를 퀵정렬

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++)
            System.out.println("x[" + i + "]=" + x[i]);
    }
}
