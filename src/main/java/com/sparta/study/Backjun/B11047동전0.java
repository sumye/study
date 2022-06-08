package com.sparta.study.Backjun;

import java.util.Scanner;

public class B11047동전0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt(), K = sc.nextInt();

        int[]coin = new int[N];

        int count = 0;

        for (int i = 0; i < N; i++) {
            coin[i] = sc.nextInt();
        }

        // 최소한의 동전 개수를 찾아야 하므로 동전가치가 가장 큰 N-1번방부터 coin[i]를 찾는다.
        for (int i = N-1; i >= 0; i--) {
            if(K >= coin[i]) {// K보다 작거나 같으면 가장 가치가 큰 coin[i]를 찾는다.
                // K / coin[i]를 통해 coin[i]가 몇번 쓰였는지 개수를 센다.
                count += (K / coin[i]);
                // coin[i]*몫한 나머지 값. 즉, K % coin[i]한 값을 변수 K에 다시 넣어준다.
                K = (K % coin[i]);
            }
        }
        System.out.println(count);
    }
}
