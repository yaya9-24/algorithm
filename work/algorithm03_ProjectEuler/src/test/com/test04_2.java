package test.com;

import java.util.ArrayList;
import java.util.Collections;

public class test04_2 {

    /*  앞에서부터 읽을 때나 뒤에서부터 읽을 때나 모양이 같은 수를 대칭수(palindrome)라고 부릅니다.

        두 자리 수를 곱해 만들 수 있는 대칭수 중 가장 큰 수는 9009 (= 91 × 99) 입니다.

        세 자리 수를 곱해 만들 수 있는 가장 큰 대칭수는 얼마입니까? */
    public static void main(String[] args) {
        //경과시간 체크를 위해 시작시간을 변수에 할당.
        long startTime = System.currentTimeMillis();
//		int x = 91;
//		int i = 99;

//		int positionCount = 10;//두자릿수
		int positionCount = 100;//세자릿수
        //int positionCount = 1000;//네자릿수

        ArrayList<Integer> list = new ArrayList<>();

        for (int x = positionCount; x < positionCount*10; x++) {
            for (int i = positionCount; i < positionCount*10; i++) {
                boolean bool = isSymmetry(x*i);
//				System.out.println(bool);
                if(bool) {
                    System.out.printf("%dx%d=%d\n",x,i,x*i);
                    list.add(x*i);
                }
            }
        }
        System.out.println(Collections.max(list));

        System.out.println("경과시간:"+(System.currentTimeMillis()-startTime));
    }// end main

    private static boolean isSymmetry(int su) {
        // 대칭수인지 확인
        int tempSu = su;//9009
        int result = 0;

        while (tempSu != 0) {
            result *= 10; // 0
            result += tempSu % 10; // 9009%10 나머지 9
            tempSu /= 10; // 몫
//			System.out.println(result);
        }
//		System.out.println(result==su);
        return result==su;
    }

}// end class
