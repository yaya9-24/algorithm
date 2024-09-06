package test.com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class test01 {

    /* 10보다 작은 자연수 중에서 3 또는 5의 배수는 3, 5, 6, 9 이고, 이것을 모두 더하면 23입니다.

    1000보다 작은 자연수 중에서 3 또는 5의 배수를 모두 더하면 얼마일까요? */
    public static void main(String[] args) {

        //1.방법 : 반복문이용 - 자연수(1~n까지 1씩증가)
        int answer = 0;
        for (int i = 0; i < 1000; i++) {
            if (i%3==0||i%5==0){
                answer += i;
            }
        }
        System.out.println(answer);



        //2.방법 : stream 사용
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 1000; i++) {
            if (i%3==0||i%5==0){
                list.add(i);
            }
        }
        System.out.println(list.stream().mapToInt(x->x).sum());

        int sum = IntStream.range(1,1000).filter(i->i % 3 == 0 || i % 5 == 0).sum();
        System.out.println(sum);


    }//end main
}//end class
