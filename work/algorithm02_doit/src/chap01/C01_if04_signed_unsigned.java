package chap01;
// 입력한 정숫값의 부호(양수/음수/0)를 판단

import java.util.Scanner;

class C01_if04_signed_unsigned {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        System.out.print("정수를 입력하세요.: ");
//        int n = stdIn.nextInt();
        long n = stdIn.nextLong();//정수가 큰때~long

        if (n > 0)
            System.out.println("이 수는 양수입니다.");
        else if (n < 0)
            System.out.println("이 수는 음수입니다.");
        else
            System.out.println("이 수는 0입니다.");
    }
}