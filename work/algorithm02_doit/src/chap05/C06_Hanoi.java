package chap05;
// 하노이의 탑

import java.util.Scanner;

class C06_Hanoi {
    //--- no개의 원반을 x번 기둥에서 y번 기둥으로 옮김 ---//
    static void move(int no, int x, int y,String m) {
    	System.out.printf("move(%d,%d,%d)%s\n",no,x,y,m);
        if (no > 1)
            move(no - 1, x, 6 - x - y," << up");

        System.out.printf("원반[%d]를 %d번 기둥에서 %d번 기둥으로 옮김\n", no, x, y);

        if (no > 1)
            move(no - 1, 6 - x - y, y," << down");
        
        System.out.println("=====return==="+m+"\n");
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("하노이의 탑");
        System.out.println("원반의 개수 : ");
//        int n = stdIn.nextInt();
        int n = 3;

        move(n, 1, 3,"first");    // 제 1 기둥에 쌓인 n개를 제 3 기둥으로 옮김
    }
}