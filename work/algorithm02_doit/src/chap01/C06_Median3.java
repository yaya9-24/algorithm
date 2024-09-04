package chap01;
// 3개의 정숫값을 입력하고 중앙값을 구하여 출력

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
//Collections.sort(list) 를 이용
class C06_Median3 {
	static int med3(List<Integer> list) {
		
		Collections.sort(list);
		int median = list.get(list.size()/2);
		
		return median;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		System.out.println("세 정수의 중앙값을 구합니다.");
		System.out.print("a 값 : ");
		int a = stdIn.nextInt();
		list.add(a);
		System.out.print("b 값 : ");
		int b = stdIn.nextInt();
		System.out.print("c 값 : ");
		list.add(b);
		int c = stdIn.nextInt();
		list.add(c);

		System.out.println("중앙값은 " + med3(list) + "입니다.");
	}
}