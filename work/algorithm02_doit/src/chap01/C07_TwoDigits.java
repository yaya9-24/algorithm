package chap01;
// 2자리의 양수(10 ~ 99)를 입력
import java.util.Scanner;

class C07_TwoDigits {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int no;

        System.out.println("2자리의 양수를 입력하세요.");

        do {
            System.out.print("no값: ");
            no = stdIn.nextInt();
//        } while (no < 10 || no > 99);//2자리의 양수:10보다작거나 99보다 클때는 다시입력
         } while (!(no >= 10 && no < 100));//2자리의 양수:10보다작거나 99보다 클때는 다시입력

        System.out.println("변수 no값은" + no + "이(가) 되었습니다.");
    }
}