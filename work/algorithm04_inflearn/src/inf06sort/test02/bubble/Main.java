package inf06sort.test02.bubble;

import java.util.Scanner;

public class Main {
    /*
     * 버블정렬 관련문제
     * 이웃한 요소들끼리 비교하면서 0번요소부터 큰것을 우측으로 보내거나
     * length-1인덱스부터 작은값을 왼쪽으로 밀고가는 정렬방식.
     * 교재 챕터6 참고
     *
     * 6 13 15 11 7 23 15
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
        // 버블정렬
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int idx1, int idx2) {
        int tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }
}