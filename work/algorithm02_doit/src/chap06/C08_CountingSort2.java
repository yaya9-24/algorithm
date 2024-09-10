package chap06;

import java.util.Arrays;
// 도수 정렬(계수 정렬,Counting sort)-범위 조건이 있을경우에 빠른 정렬을 할수있다.O(n) 
//도수  정렬은  요소의  대소  관계를  판단하지  않고  빠르게  정렬할  수 있는  알고리즘이다.
//도수 분포표: 각각의 값을 갖는 요소가 몇개인지 보여주는 표
// 지금까지의 정렬들은 위치를 바꾸면서(스왑) 정렬하는 알고리즘이었다면
// 카운팅정렬은 크기를 기준으로 갯수만 세어주면 되기때문에 위치를 바꿀필요가없고,모든 데이터에 한번씩만 접근(O(n))만하면된다.
import java.util.Scanner;

class C08_CountingSort2 {
	// --- 도수 정렬(배열 요소의 값은 0 이상 max 이하) ---//
	static void countingSort(int[] a, int n, int max) {
		//1.배열을 생성해서 0으로 초기화
		int[] f = new int[max + 1]; // 누적도수
		int[] b = new int[n]; // 작업용 목표 배열

		//누적되는 값만큼 f배열에 카운팅 증가시켜준다.
		//0,1,2,,,,9,10점에 대해서 각각의 카운트가 기록된다.
		for (int i = 0; i < n; i++)
			f[a[i]]++; // [Step 1]
		System.out.println("f:"+Arrays.toString(f));
		System.out.println("==[Step 1]완료=======");
		
		//누적도수분포표 생성:f[1]+=f[0],f[2]+=f[1],,,
		for (int i = 1; i <= max; i++)
			f[i] += f[i - 1]; // [Step 2]
		System.out.println("f:"+Arrays.toString(f));
		System.out.println("==[Step 2]완료=======");
		
		//각각의  점수를  받은  학생이  몇 번째에  위치
		//a :  { 5, 7, 0, 2, 4, 10, 3, 1, 3 }
		System.out.println("a:"+Arrays.toString(a));
		for (int i = n - 1; i >= 0; i--) {
			int b_idx = --f[a[i]];
			System.out.printf("a[i]:%d,--f[a[i]:%d]\n", a[i], b_idx);
			b[b_idx] = a[i]; // [Step 3]
			System.out.println("b:"+Arrays.toString(b));
			System.out.println("------------");
		}
		System.out.println(Arrays.toString(b));
		System.out.println("==[Step 3]완료=======");
		
		
		//정렬은 끝났으니 b배열값들을 a로 이동
		System.out.println("배열을 복사합니다.");
		//이방법은 데이터만 바뀌는 것이아니고 b배열의 주소를 복제하는 것임
//		a = b.clone();
//		System.out.println(Arrays.toString(a));
		
		//a배열주소와 메인함수의 x배열 주소가 같으므로 메인에서도 같이적용됨.
		for (int i = 0; i < n; i++)
			a[i] = b[i]; // [Step 4]
		System.out.println("==[Step 4]완료=======");
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("도수 정렬");
		System.out.println("요솟수: ");
//        int nx = stdIn.nextInt();
//        int[] x = new int[nx];
//
//        for (int i = 0; i < nx; i++) {
//            do {
//                System.out.print("x[" + i + "]: ");
//                x[i] = stdIn.nextInt();
//            } while (x[i] < 0);
//        }
//
//        int max = x[0];
//        for (int i = 1; i < nx; i++)
//            if (x[i] > max) max = x[i];
//
//        countingSort(x, nx, max);        // 배열 x를 도수정렬
//
//        System.out.println("오름차순으로 정렬했습니다.");
//        for (int i = 0; i < nx; i++)
//            System.out.println("x[" + i + "]=" + x[i]);

		int nx = 9;//9명학생
		int max = 10;//0점~10점 만점(범위확정)
		int[] x = new int[] { 5, 7, 0, 2, 4, 10, 3, 1, 3 };
		System.out.println(Arrays.toString(x));
		System.out.println("===========");
		countingSort(x, nx,max); // 배열 x를 힙정렬
		System.out.println(Arrays.toString(x));

	}
}
