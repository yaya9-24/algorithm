package chap01;
//오른쪽 아래가 직각인 이등변삼각형을 출력

import java.util.Scanner;

public class C05_MultiFor2_Triangle2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("오른쪽 아래가 직각인 이등변삼각형을 출력니다.");

        do {
            System.out.print("몇 단 삼각형입니까?: ");
            n = stdIn.nextInt();
        } while (n <= 0);

        for (int i = 1; i <= n; i++) {
        	if((n-i)!=0)System.out.printf("%"+(n-i)+"s"," ");
            for (int j = 1; j <= i; j++)
                System.out.print('*');
            System.out.println();
        }
    }//end main..
}