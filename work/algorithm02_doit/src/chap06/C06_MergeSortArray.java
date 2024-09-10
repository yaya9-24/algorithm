package chap06;
// 정렬을 완료한 배열의 병합

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

class C06_MergeSortArray {
	// --- 정렬을 마친 배열 a, b를 병합하여 배열 c에 저장 ---//
	static void merge(int[] a, int na, int[] b, int nb, int[] c) {
		int pa = 0;
		int pb = 0;
		int pc = 0;

		while (pa < na && pb < nb) // 작은 쪽을 c에 넣어 둠
			c[pc++] = (a[pa] <= b[pb]) ? a[pa++] : b[pb++];

		while (pa < na) // a에 남아있는 요소를 복사
			c[pc++] = a[pa++];

		while (pb < nb) // b에 남아있는 요소를 복사
			c[pc++] = b[pb++];
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] a = { 2, 4, 6, 8, 11, 13 };
		int[] b = { 1, 2, 3, 4, 9, 16, 21 };
		int[] c = new int[a.length+b.length];// 6+7

		System.out.println("두 개의 배열을 병합");

		// 1.System.arraycopy():int[] 또는 Integer[] 모두 병합 후 정렬
//        System.arraycopy(a, 0, c, 0, a.length);//첫배열먼저 할당
//        System.out.println(Arrays.toString(c));
//        System.arraycopy(b, 0, c, a.length, b.length);//첫배열 끝에 이어서 두번째배열할당
//        System.out.println(Arrays.toString(c));
//        Arrays.sort(c);
//        System.out.println(Arrays.toString(c));

		// 2. 병합 + 정렬
//		merge(a, a.length, b, b.length, c); // 배열 a와 b를 병합하여 c에 넣어 둠
//		System.out.println(Arrays.toString(c));
		
		
		// 3. List에 저장(int[]는 안됨)후 addAll()로 병합하고 정렬후 Integer[]로 변환
//		Integer[] d = { 2, 4, 6, 8, 11, 13 };
//		Integer[] e = { 1, 2, 3, 4, 9, 16, 21 };
//		Integer[] f = new Integer[d.length+e.length];
//		List<Integer> list = new ArrayList<Integer>(Arrays.asList(d));
//		list.addAll(new ArrayList<Integer>(Arrays.asList(e)));
//		System.out.println(list);
//		list.sort((o1,o2)->o1-o2);
//		System.out.println(list);
//		f = list.toArray(f);
//		System.out.println(Arrays.toString(f));
		
		// 4.스트림으로 병합(int[]는 안됨>>Integer[]변환 후 가능) 후 정렬
		int[] d = { 2, 4, 6, 8, 11, 13 };
		int[] e = { 1, 2, 3, 4, 9, 16, 21 };
		Integer[] d2 = Arrays.stream(d).boxed().toArray(Integer[]::new);
		Integer[] e2 = Arrays.stream(e).boxed().toArray(Integer[]::new);
		Integer[] f = Stream.of(d2, e2).flatMap(Stream::of).toArray(Integer[]::new);
		System.out.println(Arrays.toString(f));
		Arrays.sort(f);
		System.out.println(Arrays.toString(f));

	}
}
