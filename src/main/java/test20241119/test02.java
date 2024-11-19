package test20241119;

import java.util.Scanner;
import java.util.Stack;

public class test02 {
    /*
     * "스택" 문제
     * '직전의 숫자는 무시한다' - 실행 취소,  뒤로가기, Ctrl+z
     *  = 선입 후출, FILO <<==
     *
     * */

    public static void main(String[] args) {

        // N 크기 만큼의 스택 공간 형성
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Stack<Integer> stack = new Stack<Integer>();

        // ** ctrl c,v ==> 반복문
        // ** While VS for
        for(int i = 0; i < N; i++){
            int data = sc.nextInt();
            if(data != 0){
                stack.push(data);
            }else{
                stack.pop();
            }
        }
        // N 개의 데이터를 입력받을 것임
        //      0이 아니면 그냥 스택에 저장저장
        //      0이면 데이터 제거

        // 마지막에 스택에 남아있는 모든 데이터 총합
        int total = 0;
        for(int v:stack){
            total += v;
        }
        System.out.println(total);
    }
}
