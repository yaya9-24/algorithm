package test.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class test02 {

    /* 피보나치(Fibonacci) 수열의 각 항은 바로 앞의 항 두 개를 더한 것입니다. 1과 2로 시작하는 경우 이 수열은 아래와 같습니다.

        1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
        4백만 이하의 짝수 값을 갖는 모든 피보나치 항을 더하면 얼마가 됩니까? */
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);
        while (true){

            int nextInt = list.get(list.size()-2)+list.get(list.size()-1);

            if (nextInt<=4000000){
                list.add(nextInt);
            }else break;
        }
        System.out.println(list);

        int sum = list.stream().filter(x->x%2==0).mapToInt(Integer::intValue).sum();
        System.out.println(sum);



    }//end main
}//end class
