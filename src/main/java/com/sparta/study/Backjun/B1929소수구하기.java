package com.sparta.study.Backjun;

import java.util.Scanner;

//소수구하기
public class B1929소수구하기 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        boolean check[] = new boolean[1000001];
        for (int i = 2; i <= 1000000; i++) {
            check[i] = true;
        }
        for (int i = 2; i <= Math.sqrt(1000000); i++) {
            for (int j = i+i; j <= 1000000; j += i) {
                check[j] = false;
            }
        }
        for (int i = M; i <= N; i++) {
            if(check[i]) {
                System.out.println(i);
            }
        }
    }
}
