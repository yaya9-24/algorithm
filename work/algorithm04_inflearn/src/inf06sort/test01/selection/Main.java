package inf06sort.test01.selection;

import java.util.Scanner;

public class Main {
    /*선택정렬 문제
     * 제일작은 수의 인덱스의 값을 찾아서  i번인덱스의 값으로 스왑하면서 정렬하는 방식
     * 교재 챕터6 참고
6
13 15 11 7 23 15
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
        // 선택정렬
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            swap(arr, i, minIdx);
//			int tmp = arr[i];
//			arr[i] = arr[minIdx];
//			arr[minIdx] = tmp;
        }
        return arr;
    }

    public static void swap(int[] arr, int idx1, int idx2) {
        int tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }

}