package inf04hashmap.test01.captain;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    /*
     * 학급회장(해쉬)
     * 기호 A,B,C,D,E후보
     *
     * n=학생수
     *
     * 실행예시 :
     * 15
     * BACBACCACCBDEDE
     *
     * 출력예시 :
     * C

     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
//		String str = s.next();

        // 테스트용
        int n = 15;
        String str = "BACBACCACCBDEDE";
        System.out.println(solution(n, str));
    }

    private static char solution(int n, String str) {
        char answer = 'A';
        HashMap<Character, Integer> map = new HashMap<>();
        //1.foreach
//		for (char key : str.toCharArray()) {
//			//존재하지않는 key일때는 디폴트값을 0으로 지정해서 해당키값을 가져온 후 1증가시켜준다.
//			map.put(key, map.getOrDefault(key, 0)+1);
////			System.out.println(map);
//		}

        //2.for
        for (int i = 0; i < n; i++) {
            char key = str.charAt(i);
            //존재하지않는 키일때는 디폴트값을 0으로 지정해서 해당키값을 가져온 후 1증가시켜준다.
            map.put(key, map.getOrDefault(key, 0)+1);
        }
        System.out.println(map);

        //최댓값이 들어있는 value 가져오기.방법1-반복문 분기
        int max = 0;
        for (char key : map.keySet()) {
            if(max<map.get(key)) {
                max = map.get(key);
                answer = key;
            }
        }

        //최댓값이 들어있는 value 가져오기.방법2 - 컬렉션스.맥스
//		파라미터로 Map의 key와value를 모아놓은 entrySet객체를 전달하였습니다.
//		Collections.max()는 전달받은 Set에서 가장 큰 값을 찾아서 리턴합니다.
//		 Map.Entry<Character,Integer> me =
//				 Collections.max(
//						 map.entrySet(),
//						 (c1,c2)->c1.getValue().compareTo(c2.getValue())
//						 );
//		 System.out.println(me.getKey());
//		 answer = me.getKey();
        return answer;
    }
}