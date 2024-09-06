package test.com;

public class test04_1 {

    /*  앞에서부터 읽을 때나 뒤에서부터 읽을 때나 모양이 같은 수를 대칭수(palindrome)라고 부릅니다.

        두 자리 수를 곱해 만들 수 있는 대칭수 중 가장 큰 수는 9009 (= 91 × 99) 입니다.

        세 자리 수를 곱해 만들 수 있는 가장 큰 대칭수는 얼마입니까? */
    public static void main(String[] args) {
        //내가 쓴 코드
        int result = 0;
        int maxPalindrome = 0;
        for (int i = 999; i > 100; i--) {
            for (int j = 100; j < 1000; j++) {
                result = i*j;
                if (isPalind(result)==1 && result > maxPalindrome){
                    maxPalindrome = result;
                }
            }
        }
        System.out.println("가장 큰 대칭수:"+ maxPalindrome);
    }//end main

    private static int isPalind(int palindrome) {
        String origin = String.valueOf(palindrome);
        String reverse_origin = new StringBuffer(origin).reverse().toString();
        if (origin.equals(reverse_origin)) return 1;

        return 0;

    }
}//end class
