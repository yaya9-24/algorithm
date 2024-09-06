package chap05;
// 각 열에 1개의 퀸을 배치하는 조합을 재귀적으로 나열
//퀸을 배치하는 조합의 수는 16,777,216가지로 많이 줄어들지만 여전히 그 수는 지나치게 많다.
//실행하면 시간이 몇분 걸릴 것이다.
class C07_Queen1 {
    static int[] pos = new int[8];    // 각 열의 퀸의 위치
    static int count=0;
    //--- 각 열의 퀸의 위치를 출력 ---//
    static void print() {
        for (int i = 0; i < 8; i++)
            System.out.printf("%2d", pos[i]);
        System.out.println("========"+ ++count);
    }

    //--- i열에 퀸을 배치 ---//
    static void set(int i) {
        for (int j = 0; j < 8; j++) {
            pos[i] = j;            // 퀸을 j행에 배치함
            if (i == 7)            // 모든 열에 배치함
                print();
            else
                set(i + 1);        // 다음 열에 퀸을 배치
        }
    }

    public static void main(String[] args) {
        set(0);                   // 0 열에 퀸을 배치
    }
}
