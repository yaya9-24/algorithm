package inf02number.test10.maxmountain;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//		int len = Integer.parseInt(s.nextLine());
        int len = 5;

        String[] strs = new String[len];
//		for (int i = 0; i < len; i++) {
//			strs[i] = s.nextLine();
//		}
        strs[0] = "5 3 7 2 3";
        strs[1] = "3 7 1 6 1";
        strs[2] = "7 2 5 3 4";
        strs[3] = "4 3 6 4 1";
        strs[4] = "8 7 3 5 2";

        System.out.println(solution(strs));

    }// end main

    private static String solution(String[] strs) {
        System.out.println(Arrays.toString(strs));
        int len = strs.length;
        int[][] grid = new int[len+2][len+2];
        for (int i = 1; i <= len; i++) {
            for (int j = 1; j <= len; j++) {
                grid[i][j] = Integer.parseInt(strs[i-1].split(" ")[j-1]);
            }
        }
        for (int[] is : grid){
            System.out.println(Arrays.toString(is));
        }

        int count = 0;
        for (int i = 1; i <=len ; i++) {
            for (int j = 1; j <=len ; j++) {
                if (grid[i][j] > (grid[i-1][j])
                        && grid[i][j] > (grid[i+1][j])
                        && grid[i][j] > (grid[i][j+1])
                        && grid[i][j] > (grid[i][j-1])){
                    System.out.println(grid[i][j]);
                    count++;
                }
            }
        }

        return String.valueOf(count);
    }
}// end class