package chap05;
// 유클리드 호제법으로 최대공약수를 구함
//최대공약수(Greatest Common Divisor)
import java.util.Scanner;

class C03_EuclidGCD {
    //--- 정수 x, y의 최대공약수를 구하여 반환 ---//
	//매개변수(작은수,큰수를 작은수로 나눈 나머지)
    static int gcd(int x, int y) {
    	System.out.printf("%d,%d\n",x,y);
        if (y == 0)
            return x;
        else
            return gcd(y, x % y);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("두 정수의 최대공약수를 구합니다.");

//        System.out.print("정수를 입력하세요 : ");  int x = stdIn.nextInt();
//        System.out.print("정수를 입력하세요 : ");  int y = stdIn.nextInt();
//
//        System.out.println("최대공약수는 " + gcd(x, y) + "입니다.");
        System.out.println("최대공약수는 " + gcd(8, 22) + "입니다.");
    }
}
