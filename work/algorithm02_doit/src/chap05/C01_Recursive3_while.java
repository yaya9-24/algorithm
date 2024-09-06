package chap05;
// 재귀에 대한 이해를 돕는 순수 재귀 메서드(꼬리 재귀를 제거)

import java.util.Scanner;

class C01_Recursive3_while {
    //--- 꼬리 재귀를 제거한 recur ---//
    static void recur(int n) {
//		System.out.println("a:" + n);// 4,3,2,1,0

        while (n > 0) {
            recur(n - 1);
//			System.out.println("b:" + n);// 1,2,3,4
			System.out.println(n);// 

            n = n - 2;//이부분이 없으면 무한루프(재귀함수의 무한반복 회피장치)
//            System.out.println("n:"+n);
            //함수콜(4),a:4찍고,while참,
            //	함수콜(4-1),a:3찍고,while참,
            //		함수콜(3-1),a:2찍고,while참,
            //			함수콜(2-1),a:1찍고,while참,
            //				함수콜(1-1),a:0찍고,while거짓,리턴
            //					b:1 찍고, n=-1, while 거짓, 리턴
            //				b:2 찍고, n=0,  while 거짓, 리턴
            //			b:3 찍고, n=1,  while 참 
            //				함수콜(1-1),a:0찍고,while 거짓,리턴,
            //					b:1 찍고 n=-1, while 거짓,리턴
            //		b:4 찍고 n=2  while 참,
            //			함수콜(2-1),a:1찍고,while 참,
            //				함수콜(1-1),a:0찍고,while 거짓,리턴
            //					b:1 찍고,n=-1,while거짓,리턴
            //				b:2찍고,n=0,while거짓,리턴 
            //end main..
        }
//		System.out.println("........return....");

    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수를 입력하세요 : ");
//        int x = stdIn.nextInt();
        int x = 4;

        recur(x);
        System.out.println("end main...");
    }
}
