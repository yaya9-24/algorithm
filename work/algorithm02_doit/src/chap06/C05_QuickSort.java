package chap06;
//
// 퀵 정렬(O(N*logN)) - 재귀함수 + 피벗(보통 한가운데 요소를 지정한다) +pl+pr +swap
//이 알고리즘으로  학생  수가  8명인  그룹을  키 순서대로  정렬하는  모습을  나타낸  것이다. 
//먼저  어느  한 사람의  키를  선택한다.
//키가  168cm인  학생  A를 선택하여  그 학생을  기준으로  학생  A의 키보다  작은  사람의  그룹과  큰 사람의  그룹으로  나눈다. 
//이때  학생  A(그룹을  나누는  기준)를 피벗이라고  한다.
//퀵 정렬은  각 그룹에  대해  피벗  설정과  그룹나눔을  반복하여  모든  그룹이  1명이  되면  정렬을  마친다.
import java.util.Arrays;
import java.util.Scanner;

class C05_QuickSort {
	
	static int no = 0;
	
	// --- 배열 요소 a[idx1]와 a[idx2]의 값을 교환 ---//
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// --- 퀵 정렬 ---//
	static void quickSort(int[] a, int left, int right,String name) {
		System.out.printf("-------------no:%d ,%s\n", no++, name);
		int pl = left; // 왼쪽 커서 0++
		int pr = right; // 오른쪽 커서 7--
		int x = a[(pl + pr) / 2]; //168 피벗(가운데 요소)

		System.out.printf("do~while >>left(%d),right(%d),pl(%d),pr(%d),x(%d)\n",left,right,pl,pr,x);
		do {
			System.out.printf("while111(%b) >> a[%d](%d) < %d\n",a[pl] < x,pl,a[pl],x);
			while (a[pl] < x) {
				pl++;
				System.out.printf("while111 pl++ : [%d]\n",pl);
				
			}
			
			System.out.printf("while222(%b) >> a[%d](%d) > %d\n",a[pr] > x,pr,a[pr],x);
			while (a[pr] > x) {
				pr--;
				System.out.printf("while222 pr-- : [%d]\n",pr);
				
			}
			if (pl <= pr) {
				System.out.printf("if swap %d <--> %d\n",a[pl],a[pr]);
				swap(a, pl++, pr--);//pl,pr은 스왑후 증가
				System.out.println(Arrays.toString(a));
				System.out.printf("if swap 후 pl++ : [%d], pr-- : [%d]\n",pl,pr);

			}
		} while (pl <= pr);//pl증갓수가 pr감솟수보다 커지면 dowhile종료  

		System.out.println(Arrays.toString(a));
		System.out.println("end do~while..........");
		
		//반드시,재귀순회하면서 마무리해줘야한다.
		if (left < pr)
			quickSort(a, left, pr,"재귀1 : left < pr");
		if (pl < right)
			quickSort(a, pl, right,"재귀2 : pr < right");
		
		System.out.println("*******return "+name);
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

//		int[] x = new int[] { 175, 170, 160, 168, 165, 170, 155, 150 };
		int[] x = new int[] { 6, 4, 1, 7, 3, 9, 8,0 };

		System.out.println("=======정렬전=====");
		System.out.println(Arrays.toString(x));
		System.out.println("================");
		quickSort(x, 0, nx - 1,"main");
		System.out.println("=======정렬후=====");
		System.out.println(Arrays.toString(x));

	}
}
