package chap03;
// 선형 검색(보초법) - // 반복문안에 분기문 1개
//컴퓨터 입장에서는 보초법을 이용한 검색에서는
//
//성공이나 실패 둘 다 요소를 찾는 경우 1가지로 귀결됩니다.
//
//(사람 입장에서) 검색 성공하는 경우에는 0 ~ (n-1) 번째 인덱스에서 데이터를 찾게 되는 것이고
//
//(사람 입장에서) 검색 실패하는 경우에는 n번째 인덱스에서 데이터를 찾게 되는 것입니다.
//
//이렇게 되면 if문의 사용을 줄일 수 있게 검사를 하는 연산 작업을 조금이나마 덜 할 수 있게 되는 것입니다.
import java.util.Scanner;

class C01_SeqSearchSen {
    //--- 요솟수가 n인 배열 a에서 key와 값이 같은 요소를 보초법으로 선형 검색 ---//
    static int seqSearchSen(int[] a, int n, int key) {
        int i = 0;

        a[n] = key;             // 보초를 추가

        while (true) {
            if (a[i] == key)    // 검색 성공
                break;
            i++;
        }
        return i == n ? -1 : i;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

//        System.out.print("요솟수 : ");
//        int num = stdIn.nextInt();
//        int[] x = new int[num + 1];   //*** 요솟수가 num + 1인 배열
//
//        for (int i = 0; i < num; i++) {
//            System.out.print("x[" + i + "] : ");
//            x[i] = stdIn.nextInt();
//        }
//
//        System.out.print("검색 값 : ");                    // 키값을 읽력받음
//        int ky = stdIn.nextInt();

        int num = 7;
		int[] x = new int[] {6,4,3,2,1,2,8,999};//999는 테스트용 임시값
		int ky = 2;
        
        int idx = seqSearchSen(x, num, ky);              // 배열 x에서 값이 ky인 요소를 검색

        if (idx == -1)
            System.out.println("검색 값의 요소가 없습니다.");
        else
            System.out.println("검색 값은 x[" + idx + "]에 있습니다.");
    }
}