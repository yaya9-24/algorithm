package chap01;
// 이중 루프로 구구단 곱셈표를 출력

public class C05_MultiFor1_99Table {
    public static void main(String[] args) {
        System.out.println("----- 구구단 곱셈표 -----");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++)
                System.out.printf("%3d", i * j);
            System.out.println();
        }
        
        System.out.println("----- 구구단 곱셈 식 -----");
        System.out.println();
        for (int i = 2; i <= 9; i++) {
        	for (int j = 1; j <= 9; j++)
        		System.out.printf("%d*%d=%2d, ",i,j, i * j);
        	System.out.println();
        }
    }
}