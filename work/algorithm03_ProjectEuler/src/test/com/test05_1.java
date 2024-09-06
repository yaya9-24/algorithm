package test.com;

public class test05_1 {

    /*  1 ~ 10 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 2520입니다.

        그러면 1 ~ 20 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 얼마입니까? */
    public static void main(String[] args) {

        long maxSu = 1; //1*2*3*4*,,,20 : 약240경
        int maxIndex = 20;
        for (long x = 1; x <= maxIndex; x++) {
//			System.out.println(x);
            maxSu *= x;
        }
        System.out.println("maxSu:"+maxSu);
        System.out.println("maxSu:"+maxSu/2);//연산속도를 위해 반절 제외

        //out: 은 라벨이다.
        out:for (long x = 1; x <= maxSu/2; x++) {
            long count = 0;
            for (long i = 1; i <= maxIndex; i++) {
                if(x%i==0){
                    count++;
                }
//				System.out.println("계산중....");
                if(count==maxIndex) {
                    System.out.println("min:"+x);
                    break out;
                }
            }
        }
        System.out.println("계산 종료....");


    }// end main
}// end class
