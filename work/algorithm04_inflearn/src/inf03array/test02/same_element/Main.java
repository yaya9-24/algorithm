package inf03array.test02.same_element;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 5;
        int[] a = {1,3,9,5,2};
        int m = 5;
        int[] b = {3,2,5,7,8};

        System.out.println(solution(n,a,m,b));
    }//end main

    private static String solution(int n,int[] a,int m,int[] b){
        String answer = "";
        // a와 b를 오름차순 정렬
        Arrays.sort(a);
        Arrays.sort(b);
        List<Integer> listA = Arrays.stream(a).boxed().toList();
        List<Integer> listB = Arrays.stream(b).boxed().toList();
        List<Integer> commonList = new ArrayList<>();
//        System.out.println(listA);
//        System.out.println(listB);

        for (int i = 0; i < listB.size(); i++) {
            if (listA.contains(listB.get(i))){
                commonList.add(listB.get(i));
            }
        }
//        System.out.println(commonList);

        for (Integer x : commonList){
            answer += x+ " ";
        }


        return answer;
    }
}//end class