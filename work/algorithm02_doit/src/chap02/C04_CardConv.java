package chap02;
// 입력받은 10진수를 2진수 ~ 36진수로 기수 변환하여 출력
//2진수 8진수 16진수 32진수 36진수
//base 32(32진법): 숫자 0~9, 알파벳 일부를 사용하는 진법으로 5비트를 한 자리로 표기하기 위한 기법이다. 프로그래밍 언어에 따라 많이 다르다.
//base 36(36진법): 숫자 0~9, 알파벳 A~Z를 모두 사용하는 진법
/*
 * base 58(58진법): 숫자 0~9, 알파벳 대문자 A~Z, 소문자 a~z의 대부분을 사용한다. 
 * 					이때 혼동을 일으킬 수 있는 숫자 0과 대문자 O, 대문자 I와 소문자 l은 
 * 					사용하지 않는다. 비트코인 주소 표기에 사용한다.
BASE64(64진법): 숫자 0~9, 알파벳 대문자 A~Z, 소문자 a~z까지 사용한 뒤, 나머지 2자리에 
			특수문자 +, /를 집어넣어 6비트를 한 자리로 표기하는 기법이다. 
			가장 널리 쓰이는 기법으로, 이메일 인코딩에 많이 사용된다. 
			이메일 원본 헤더를 열어보면 알 수 없는 숫자와 알파벳, 특수문자가 마구 섞인 부분을 볼 수 있는데 이것이 Base64로 표기된 것이다.
Ascii85(85진법[8]): 숫자 0~9, 알파벳 대문자 A~Z, 소문자 a~z[9]를 모두 사용하다 못해 
			특수문자도 대거 사용한다. 즉, 32비트를 5자리의 문자로 나타낼 수 있는 가장 작은 진법이다.
발췌:https://namu.wiki/w/진법		
 * */
import java.util.Scanner;

class C04_CardConv {
    //--- 정숫값 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어 두고 자릿수를 반환 ---//
    static int cardConv(int x, int r, char[] d) {
        int digits = 0;                        // 변환 뒤 자릿수
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits++] = dchar.charAt(x % r);    // r로 나눈 나머지를 저장
            x /= r;
        } while (x != 0);

        for (int i = 0; i < digits / 2; i++) {    // 배열 d의 숫자 문자열을 역순 정렬
            char t = d[i];
            d[i] = d[digits - i - 1];
            d[digits - i - 1] = t;
        }

        return digits;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int no;                       // 변환할 정수
        int cd;                       // 기수
        int dno;                      // 변환 뒤 자릿수
        int retry;                    // 다시 한 번?
        char[] cno = new char[32];    // 변환 후 각 자리의 숫자를 넣어 두는 문자 배열

        System.out.println("10진수를 기수 변환합니다.");
        do {
            do {
                System.out.print("변환하는 음이 아닌 정수: ");
                no = stdIn.nextInt();
            } while (no < 0);

            do {
                System.out.print("어떤 진수로 변환할까요?(2-36): ");
                cd = stdIn.nextInt();
            } while (cd < 2 || cd > 36);

            dno = cardConv(no, cd, cno);            // no를 cd 진수로 변환

            System.out.print(cd + "진수로 ");
            for (int i = 0; i < dno; i++)            // 순서대로 표시
                System.out.print(cno[i]);
            System.out.println("입니다.");

            System.out.print("다시 한 번 할까요? (1…예/0…아니오): ");
            retry = stdIn.nextInt();
        } while (retry == 1);
    }
}