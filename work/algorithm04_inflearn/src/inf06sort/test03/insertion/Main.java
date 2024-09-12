package inf06sort.test03.insertion;

import java.util.Scanner;

public class Main {
    /*
     * 두번째 요소부터 선택하여 진행하는 정렬
//두번째요소가 첫번째요소보다 작다면 교환(버블정렬 스왑은 인접교환이며
// 삽입정렬 교환은 멀리떨어져있는 곳이후 요소는 우측으로 이동시켜준후에
// 삽입(그래서 삽입정렬)하는 스왑을 사용한다)
 * 교재 챕터6 참고
6
11 7 5 6 10 9
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        for (int x : solution(n, arr)) {
            System.out.print(x + " ");
        }
    }

    private static int[] solution(int n, int[] arr) {
        // 삽입정렬-두번째 요소부터 선택
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int j = i - 1;
            while (j >= 0 && tmp < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = tmp;
        }

//		for (int i = 1; i < arr.length; i++) {
//			int j;
//			int tmp = arr[i];
//			for (j = i; j > 0 && arr[j - 1] > tmp; j--) {
//				arr[j] = arr[j - 1];
//			}
//			arr[j] = tmp;
//		}
        return arr;
    }
}