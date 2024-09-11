package inf04hashmap.test02.anagram;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
// 		String str1 = s.nextLine();
//		String str2 = s.nextLine();

        // 테스트용
        String str1 = "AbaAeCe";
        String str2 = "baeeACA";
        System.out.println(solution(str1, str2));
    }

    private static String solution(String str1, String str2) {
        System.out.println(str1);
        System.out.println(str2);
        String answer = "YES";

        // 1.String의 char 한 글자을 key로 하고 중복갯수를 value로 맵핑할 객체생성
        HashMap<Character, Integer> map = new HashMap<>();
//		str1 = "AbaAeCeMMM";// map.getOrDefault(key,value)메소드 테스트용으로 MMM를늘렸습니다.
//		매개변수: 이 방법은 두 개의 매개변수를 허용합니다.
//		key: 값을 얻어야 하는 요소의 키 입니다 .
//		defaultValue: 지정된 키와 매핑된 값이 없는 경우 반환되어야 하는 기본값 입니다 .

        // 2.str1을 맵핑하는 반복문
        for (char x : str1.toCharArray()) {
            // char 한 글자을 key로 하고 중복갯수를 value로 맵핑
            System.out.println(x + ":" + (map.getOrDefault(x, 0) + 1));
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        System.out.println(map);

        // 3.str2를 맵핑하는 반복문
//		str2 = "baeeACAMMM";
        for (char x : str2.toCharArray()) {
            System.out.println(map.containsKey(x));// str2의 x와 같은 key가 map에 존재유무 확인
            System.out.println(x + ":" + (map.get(x)));// 해당키의 value확인

            // 없는key가 있거나 value가 0일때는 일치하지 않는 것이므로 "NO" 리턴
            if (!map.containsKey(x) || map.get(x) == 0) {
                return "NO";
            }
            // 앞서 2번에서 맵핑한 키와값을 대조하여 동일한key(x)에 대하여 1씩 감소시킴
            map.put(x, map.get(x) - 1);
        }
        System.out.println(map);

        return answer;
    }
}