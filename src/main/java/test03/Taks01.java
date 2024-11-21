package test03;

import java.util.Scanner;

public class Taks01 {
    public static void main(String[] args, String num_str) {
        int answer = 0;

        for(int i = 0; i < num_str.length(); i++){
            String a = num_str.substring(i,i+1);
            int b = Integer.parseInt(a);
            answer =+ b;
        }

    }
}
