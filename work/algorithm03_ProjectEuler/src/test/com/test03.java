package test.com;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class test03 {

    /*  어떤 수를 소수의 곱으로만 나타내는 것을 소인수분해라 하고, 이 소수들을 그 수의 소인수라고 합니다.
        예를 들면 13195의 소인수는 5, 7, 13, 29 입니다.

        600851475143의 소인수 중에서 가장 큰 수를 구하세요. */
    public static void main(String[] args) {

//        //내가 쓴 코드
//        long num = 600851475143L;
//        List<Long> list = new ArrayList<>();
//        for (long i = 2; i < Math.sqrt(num); i++) {
//            if (num%i==0){
//                list.add(i);
//            }
//            for (int j = 2; j <= list.size(); j++) {
//                if (list.get(list.size()-1) % list.get(list.size()-j) ==0){
//                    list.remove(list.size()-1);
//                }
//            }
//        }
//        System.out.println(list);

        System.out.println("=============================");

        //long su = 10L;
//		long su = 13195L;
		long su = 600851475143L;

        //제곱근을 사용할때 작은수일경우 소인수가 다표기되지 않을수 있으므로 조건연산처리
        long bigSu = su>100?(long)Math.sqrt(su):su;

        ArrayList<Long> list = new ArrayList<Long>();

        //1.주어진 수에서 반복복문으로 나누어떨어지는 것들만 선별
        for (long i = 2L; i < bigSu; i++) {
            if(su%i==0) {
                list.add(i);
            }
        }

        System.out.println(list);

        //2.소수만 걸러내기
        Set<Long> primeNumbers = new HashSet<Long>();
        for (int x = 0; x < list.size(); x++) {
            primeNumbers.add(list.get(x));
            for (int i = 0; i < list.size(); i++) {
                //주어진 요소들로 나누어떨어지는지 검증
//				System.out.println(list.get(x)%list.get(i)==0);
                if(list.get(x)%list.get(i)==0) {
                    //스스로 나누는 요소를 제외하고 나누어 떨어지는것들만 제거
                    if(list.get(x)!=list.get(i)) {
                        primeNumbers.remove(list.get(x));
                    }
                }
            }
//			System.out.println("===");
        }

        System.out.println(primeNumbers);
        System.out.println(primeNumbers.stream()
                .mapToLong(i->i).max().getAsLong());

    }//end main
}//end class
