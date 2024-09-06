package chap02;

import java.util.Scanner;

// 배열의 모든 요소의 합을 구하여 출력(확장 for 문）
//1.0, 2.0, 3.0, 4.0, 5.0 를 입력받아서 합계처리
class C01_Array3DoubleSum {
    public static void main(String[] args) {
//        double[] a = { 1.0, 2.0, 3.0, 4.0, 5.0 };

    	Scanner s = new Scanner(System.in);
    	double[] a = new double[5];
    	for (int i = 0; i < a.length; i++) {
			a[i] = s.nextDouble();
		}
    	
        for (int i = 0; i < a.length; i++)
            System.out.println("a[" + i + "] = " + a[i]);

        double sum = 0;    // 합계
        for (double i : a)
            sum += i;

        System.out.println("모든 요소의 합은 " + sum + "입니다.");
    }
}