package test01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> score = new ArrayList<>();

        int n = sc.nextInt();

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
