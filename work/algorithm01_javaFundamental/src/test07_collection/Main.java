package test07_collection;

import java.util.*;

public class Main {

    /* 입력받은(주어진) 문자열에서 끝에서 3단어를 제거하여 출력하는 프로그램을 작성하세요.
    입력 예시: Hello world java html css
              aa bb cc dd ee ff
    출력 예시 : Hello world
               aa bb cc */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //String str = s.nextLine();//한 문장씩 입력받음 aaa bbb ccc
        String str = "aa bb cc dd ee ff";

        System.out.println(solution(str));
    }//end main

    private static String solution(String str){
        String answer = "";

        String[] arr = str.split(" ");
        //System.out.println(Arrays.toString(arr));

//        //1.컬렉션을 사용하지 않고 구현
//        for (int i = 0; i < arr.length-3; i++) {
//            answer += arr[i]+" ";
//        }
//        answer =  answer.strip(); //뒤에 있던 공백을 없애준다.!!! or trim() 사용

//        //2. 컬렉션 사용1
//        List<String> list = Arrays.asList(arr);
//        for (int i = 0; i < arr.length-3; i++) {
//            answer += list.get(i)+ " ";
//        }
//        answer = answer.strip();

//        //3. 컬렉션 사용2
//        ArrayList<String> list = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            list.add(arr[i]);
//        }
//        for (int i = arr.length-1; i >=arr.length-3 ; i--) {
//            list.remove(i);
//        }
//        answer = String.join(" ",list);

        //4.스텍(Stack)을 사용하는 방식
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < arr.length-3; i++) {
            stack.push(arr[i]);
        }
        //System.out.println(stack);
        answer = String.join(" ",stack); //배열의 []와 ,를 없애는 방법 !!!
        return answer;
    }
}//end class
