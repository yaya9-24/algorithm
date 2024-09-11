package inf03array.test03.max_sales;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
//		int[] sus1 = new int[n];
//		for (int i = 0; i < sus1.length; i++) {
//			sus1[i] = s.nextInt();
//		}
//		int k = s.nextInt();
        // 테스트용
        int n = 10;
        int k = 3;
        int[] sus1 = new int[] { 12 ,15 ,11 ,20 ,25 ,10, 20 ,19 ,13 ,15 };
//		int[] sus1 = new int[100000];
//		for (int i = 0; i < sus1.length; i++) {
//			sus1[i] = (int)new Random().nextInt(500);
//		}
        System.out.println(solution(n, k, sus1));
    }//end main

    private static String solution(int n,int k,int[] sus1){
        String answer = "";
        int sum = 0;
        int maxSum = 0;
        for (int i = 0; i <= n-k; i++) {
            sum = 0;
            for (int j = i; j < k+i; j++) {
                sum += sus1[j];
            }
            System.out.println(sum);
            if (sum>maxSum) maxSum = sum;
        }

        return maxSum+"";
    }
}//end class