package test20241119;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
* 문제 풀이의 순서
* 1) 문제를 먼저 읽어라.
* 2) 문제를 먼저 풀어라.
* 3) 문제를 푼 순서를 주석으로 (한글 코딩으로) 코드에 작성해라
* 4) 주석 순서대로 코드 작성하기
*       온라인 >> 주석제거
*       오프라인 >> 주석 포함 !! **
*
*   api
*   application programming interface
*   코드 빌려쓰기?!
*
* */

public class test01 {
    public static void main(String[] args) {

        // 배열이 주어졌을 때
        // 가장 큰 점수를 찾고,
        // 가장 작은 점수를 찾는다.
        // 큰 수 -  작은 점수 = 정답

        Scanner sc = new Scanner(System.in);

        List<Integer> score = new ArrayList<>();

        int n = sc.nextInt();
        //int []  datas = new int[N];
        /*
        * for(int i = 0; i < datas.length; i++){
        *   datas[i] = sc.nextInt();
        * }
        *
        *  int max = Arrays.stream(datas).max().getAsInt();
        *  int min = Arrays.stream(datas).min().getAsInt();
        *
        *   int res= max - min;
        *   System.out.println(res);
        * */


        for (int i = 0; i <n; i++){
            score.add(sc.nextInt());
        }
        int max = score.get(0);

        for (int i = 0; i <n; i++){
            if(max < score.get(i)){
                max = score.get(i);
            }
        }


        int min = score.get(0);
        for (int i = 0; i <n; i++){
            if(min > score.get(i)){
                min = score.get(i);
            }
        }


        System.out.println(max - min);

    }
}
