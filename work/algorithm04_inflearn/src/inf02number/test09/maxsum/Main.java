package inf02number.test09.maxsum;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        int len = Integer.parseInt(s.nextLine());
        int len = 5;

        String[] strs = new String[len];
//		for (int i = 0; i < len; i++) {
//			strs[i] = s.nextLine();
//		}
        strs[0] = "10 13 10 12 15";
        strs[1] = "12 39 30 23 11";
        strs[2] = "11 25 50 53 15";
        strs[3] = "19 27 29 37 27";
        strs[4] = "19 13 30 13 19";

        System.out.println(solution(strs));
    }//end main

    private static String solution(String[] strs) {
        System.out.println(Arrays.toString(strs));
        int[][] grid = new int[strs.length][strs.length];
        for (int i = 0; i < strs.length ; i++) {
            for (int j = 0; j < strs.length; j++) {
                grid[i][j] = Integer.parseInt(strs[i].split(" ")[j]);
            }
        }
        int index = 0;
        int[] score = new int[strs.length*2+2];
        //각 행의 합 구하기
        int sum = 0;
        for (int i = 0; i < strs.length; i++) {
            sum = 0;
            for (int j = 0; j < strs.length; j++) {
                sum += grid[i][j];
            }
            score[index++] = sum;
        }

        //각 열의 합 구하기
        for (int j = 0; j < strs.length; j++) {
            sum = 0;
            for (int i = 0; i < strs.length; i++) {
                sum += grid[i][j];
            }
            score[index++] = sum;
        }

        sum = 0;
        //각 대각선 합 구하기
        for (int j = 0; j < strs.length; j++) {
            sum += grid[j][j];
        }
        score[index++] = sum;

        sum = 0;
        for (int j = 0; j < strs.length; j++) {
            sum += grid[j][4-j];
        }
        score[index] = sum;

        //System.out.println(Arrays.stream(score).max().getAsInt());
        return String.valueOf(Arrays.stream(score).max().getAsInt());
    }
}//end class