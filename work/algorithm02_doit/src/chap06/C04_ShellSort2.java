package chap06;
// 셸정렬(버전 2 : h = …, 40, 13, 4, 1)

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class C04_ShellSort2 {
    //--- 셸 정렬 ---//
    static void shellSort(int[] a, int n) {
        int h;
        for (h = 1; h < n; h = h * 3 + 1) {
        	System.out.println("h:"+h);
        }

        for ( ; h > 0; h /= 3)
            for (int i = h; i < n; i++) {
                int j;
                int tmp = a[i];
                for (j = i - h; j >= 0 && a[j] > tmp; j -= h)
                    a[j + h] = a[j];
                a[j + h] = tmp;
            }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("셸 정렬(버전 2)");
        System.out.println("요솟수: ");
//        int nx = stdIn.nextInt();
//        int[] x = new int[nx];
//
//        for (int i = 0; i < nx; i++) {
//            System.out.print("x[" + i + "]: ");
//            x[i] = stdIn.nextInt();
//        }
//
//        shellSort(x, nx);            // 배열 x를 셸정렬
//
//        System.out.println("오름차순으로 정렬했습니다.");
//        for (int i = 0; i < nx; i++)
//            System.out.println("x[" + i + "]=" + x[i]);
        
        int nx = 400;
		// 삽입정렬의 장단점을 보완했다는 것은 바꿔말하면 장점은 살려서 정렬에 가까울수록 빨라지고
		// 역정렬이 되어 있더라도 카운트를 삽입정렬보다 줄여준다.
		// 즉, 평균적이다
		int[] x = new int[nx];
		Random r = new Random(1);
		for (int i = 0; i < x.length; i++) {
			x[i] = r.nextInt(nx);
		}
		shellSort(x, nx);
		System.out.println(Arrays.toString(x));
        
    }
}
