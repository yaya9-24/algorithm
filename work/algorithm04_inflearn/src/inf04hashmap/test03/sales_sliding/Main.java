package inf04hashmap.test03.sales_sliding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
// 		int n = Integer.parseInt(s.nextLine());
// 		int k = Integer.parseInt(s.nextLine());
//		int[] arr = Arrays.stream(s.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        //20 12 20 10 23 17 10

        // 테스트용
        int n = 7;
        int k = 4;
        int[] arr = new int[] {20, 12, 20, 10, 23, 17, 10};

        //슬라이딩 윈도우
        System.out.println(solution(n,k,arr));
    }

    private static String solution(int n,int k,int[] arr) {
        String answer = "";

        //1.매출액 종류가 몇개인지를 할당할 배열
        ArrayList<String> list = new ArrayList<>();

        //2.매출액을 key로하고 같은 키일때 카운팅올리는 맵핑 설정
        HashMap<Integer, Integer> map = new HashMap<>();

        //3.우선 arr배열 앞에서 0부터~k-1만큼(3개)만 반복시켜 키맵핑
        for (int i = 0; i < k-1; i++) {
            System.out.println(arr[i]);
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        System.out.println(map);//0,1,2 요소로 맵핑결과 {20=2, 12=1}

        int left = 0;//왼쪽인덱스

        //앞에서 4칸씩 이동시에 오른쪽끝 인덱스를 의미한다.
        for (int right = k-1; right<n; right++) {
            System.out.print(right + " : ");//3,4,5,6

            //3,4,5,6 인덱스의 요소값으로 키값맵핑
            map.put(arr[right], map.getOrDefault(arr[right],0)+1);
            System.out.printf("size(%d)",map.size());
            System.out.println(map);

            //4.키의 갯수가 매출량 종류수와 같다.
            list.add(String.valueOf(map.size()));

            //5. 4개씩 슬라이딩되서 밀리면 왼쪽은 1씩감소시켜서 맵핑
            map.put(arr[left], map.get(arr[left])-1);

            //6. 4개씩 슬라이딩되서 밀면서 감소된 값이 0이면 해당키는 제거해줌.
            if(map.get(arr[left])==0) {
                map.remove(arr[left]);
            }
            System.out.println(map);
            left++;
        }
        System.out.println(list);
        answer = String.join(" ", list);
        return answer;
    }
}