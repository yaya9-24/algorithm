package chap06;
import java.util.Arrays;
// 힙 정렬O(N*logN)-병합정렬과 퀵정렬만큼 빠른 정렬
// 힙 트리 구조를 이용한 알고리즘(이진트리:모든 노드의 자식노드가 2개, 루트-최상단,리프-최하단노드)
// 힙 정렬은  선택  정렬을  응용한  알고리즘으로  힙의  특성을  이용하여  정렬한다.
// 힙은 최솟값이나 최댓값을 빠르게 찾아내기 위해 완전 이진 트리를 기반으로하는 트리.
// 최대값은 부모가 되는 구조
// 자식노드가 부모노드보가 값이 클때는 힙이붕괴되었다고 하며 Heapify알고리즘으로 부모와 자식위치를 변경해주면 된다.
// ***힙구조가 완성이되었다면 가장큰값을 맨뒤로 보내고 힙구조수행(Heapify)하고,가장큰값뒤로보내고 Heapify,,,,
// Heapify알고리즘의 복잡도는 전체원소(N)*트리구조의 높이(logN)만큼
import java.util.Scanner;

class C07_HeapSort {
    //--- 배열 요소 a[idx1]와 a[idx2]의 값을 교환 ---//
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];  
        a[idx1] = a[idx2];  
        a[idx2] = t;
    }

    //--- a[left]～a[right]를 힙으로 만들기 ---//
    static void downHeap(int[] a, int left, int right) {
        int temp = a[left];        // 뿌리
        int child;                 // 큰 쪽의 자식
        int parent;                // 부모

        for (parent = left; parent < (right + 1) / 2; parent = child) {
            int cl = parent * 2 + 1;        // 왼쪽의 자식
            int cr = cl + 1;                // 오른쪽의 자식
            child = (cr <= right && a[cr] > a[cl]) ? cr : cl;    // 큰 쪽
            if (temp >= a[child])
                break;
            a[parent] = a[child];
        }
        a[parent] = temp;
    }

    //--- 힙 정렬 ---//
    static void heapSort(int[] a, int n) {
        for (int i = (n - 1) / 2; i >= 0; i--)    // a[i]~a[n-1]를 힙으로 만듦
            downHeap(a, i, n - 1);

        for (int i = n - 1; i > 0; i--) {
            swap(a, 0, i);                       // 가장 큰 요소와 아직 정렬되지 않은 부분의 마지막 요소를 교환
            downHeap(a, 0, i - 1);               // a[0] ~ a[i-1]을 힙으로 만듦
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("힙 정렬");
        System.out.println("요솟수: ");
//        int nx = stdIn.nextInt();
//        int[] x = new int[nx];
//
//        for (int i = 0; i < nx; i++) {
//            System.out.print("x[" + i + "]: ");
//            x[i] = stdIn.nextInt();
//        }
//
//        heapSort(x, nx);    // 배열 x를 힙정렬
//
//        System.out.println("오름차순으로 정렬했습니다.");
//        for (int i = 0; i < nx; i++)
//            System.out.println("x[" + i + "]=" + x[i]);
        
        int nx = 10;
        int[] x = new int[] {10,9,5,8,3,2,4,6,7,1};
        System.out.println(Arrays.toString(x));
        System.out.println("===========");
        heapSort(x, nx);    // 배열 x를 힙정렬
        System.out.println(Arrays.toString(x));
        
    }
}
