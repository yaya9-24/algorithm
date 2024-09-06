package chap02;

import java.util.ArrayList;
import java.util.List;

// 1,000 이하의 소수를 나열(버전 1）

class C05_PrimeNumber1 {
    public static void main(String[] args) {
        int counter = 0;        // 나눗셈 횟수
        List<Integer> list = new ArrayList<>();
        for (int n = 2; n <= 1000; n++) {
            int i;
            for (i = 2; i < n; i++) {
                counter++;
                if (n % i == 0)    // 나누어떨어지면 소수가 아님
                    break;         // 반복은 더 이상 불필요
            }
            if (n == i) {
            	// 마지막까지 나누어떨어지지 않음<<소수
            	System.out.println(n);
            	list.add(n);
            }
        }
        System.out.println("list.size():"+list.size());//소수갯수
        System.out.println(list.stream().mapToInt(x->x).sum());//소수의합
        
        System.out.println("나눗셈을 수행한 횟수 : " + counter);
    }
}