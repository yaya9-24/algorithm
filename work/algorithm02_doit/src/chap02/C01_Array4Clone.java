package chap02;
// 배열의 복제 배열을 만듭니다.

import java.util.Arrays;

class C01_Array4Clone {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = a.clone();    // b는 a를 복제한 새로운 배열을 참조
//        int[] b = a;    // b는 a주소를 그대로 참조
        System.out.println(a);
        System.out.println(b);
        
        b[3] = 0;   // 한 요소만 따로 변경

        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));
    }
}
