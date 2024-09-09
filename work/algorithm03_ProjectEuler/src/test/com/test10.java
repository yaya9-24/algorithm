package test.com;

public class test10 {

    /* 10 이하의 소수를 모두 더하면 2 + 3 + 5 + 7 = 17 이 됩니다.

        이백만(2,000,000) 이하 소수의 합은 얼마입니까? */
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        long sum = 0L;
        for (int i = 2; i <= 2000000; i++) {
            if (isPrime(i)){
                sum +=i;
            }
        }
        System.out.println(sum);
        System.out.println("처리시간(ms):"+ (System.currentTimeMillis()-startTime));
    }//end main

    private static boolean isPrime(int i) {
        if (i==2) return true;

        if (i%2==0) return false;
        for (int j = 3; j <= Math.sqrt(i); j+=2) {
            if (i%j==0) return false;
        }
        return true;
    }
}//end class
