package test20241119;

import java.util.Scanner;

public class test03 {
    /*
    * 포함, 미포함 => 중요
    *
    * 바라보는 것, 신호받기,... = > 포함관계를 확인하기
    * "경계값 검사"
    *
    * 3 0 1 0 1 0 = 5
    *
    * */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] datas =new int[N];
        for(int i = 0; i < datas.length; i++){
            datas[i] = sc.nextInt();
        }
        // N마리의 소
        // N개의 배열
        // 배열에 소들의 키를 저장

        /* 왜 for 인지 왜 while 인지 이유를 정확히 아는것이 중요
        *   N부터 0까지의 정확한 조건이 주어져 있고
        *   여러번 반복 하기 때문에  -> for
        */
        int count = 0;
        // index 0 -->> N 헤어를 확인
        for(int i = 0; i<N ; i++){
            //datas[0]이랑 datas[1]랑 비교하고,,,
            //datas[0]이랑 datas[2]랑 비교하고,,,
            for(int j=i+1; j<N; j++){ // 1)최대값이 정해져 있기 때문에
                    // 나의 다음 부터 계산 더하기 때문에 i+1

                if(datas[i] <= datas[j]){
                   break;
                }
                count++;
            }

            /*
            * 2) 정확한 반복횟수를 모른다.
            * while(datas[0]이 키가 비교대상보다 더 크다면){
            * }
            * 늬앙스 차이
            * */
            int j = i+1;
            while(datas[i]>datas[j] && j<N){ // 현재와 비교 대상
                count++;
                j++;
            }
        }
        // datas[0] > datas[1] 헤어 확인가능
        //  계속 확인 가능
        // datas[0] <= datas[1] 헤어 확인 불가능
        //  더이상 확인 할 수 없음

        // 확인 횟수를 출력
        System.out.println(count);
    }
}
