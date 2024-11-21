package test20241119;

import java.util.Scanner;
import java.util.Stack;

public class test04 {

    public static int[] test(int N, int[] tower){
        int[] result = new int[N];
        Stack<int[]> stack = new Stack<int[]>();
        //{탑의 높이, 탑의 위치}를  저장 == int[] 제네릭으로 설정
        for(int i=0; i<N; i++){ //== 반복문을 반드시 1개는 사용해야함
            //1)현재 비교대상이 되는 탑보다 높은 탑이 스택에 있나?

            //2) result로 0 저장
        }
        return result;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        // N개의 높이가 다른 탑
        // N개의 탑
        for(int i=0; i<N; i++) {
            int data = sc.nextInt();
            if(data != 0 ){
                stack.push(data);
            }else{
                stack.pop();
            }
        }

        // datas[N] -> 자기자신 보다 크며 제외한 나머지 탑 중에 가장 높은 탑이 수신
        //           -> 높은 탑이 몇번째 위치? - search()
        //
        int pivot = stack.peek();
        for(int i=0; i < N ; i++) {
            if(stack.get(N-1) > pivot){
                stack.search(stack.peek());
            }

        }
    }
}
