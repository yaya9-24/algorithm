package test.com;

public class test09 {

    /* 세 자연수 a, b, c 가 피타고라스 정리 a2 + b2 = c2 를 만족하면 피타고라스 수라고 부릅니다 (여기서 a < b < c ).
    예를 들면 32 + 42 = 9 + 16 = 25 = 52이므로 3, 4, 5는 피타고라스 수입니다.

    a + b + c = 1000 인 피타고라스 수 a, b, c는 한 가지 뿐입니다. 이 때, a × b × c 는 얼마입니까? */
    public static void main(String[] args) {

        int a,b,c;
        int result = 0;
        out:for (a = 3; a < 1000; a++) {
            for (b = 3; b < 1000; b++) {
                for (c = 3; c < 1000; c++) {
                    if ((a*a+b*b==c*c)&& (a<b) && (b<c) && (a+b+c==1000)){
                        System.out.println("a:"+a);
                        System.out.println("b:"+b);
                        System.out.println("c:"+c);
                        result = a*b*c;
                        break out;
                    }
                }
            }
        }
        System.out.println(result);
    }//end main
}//end class
