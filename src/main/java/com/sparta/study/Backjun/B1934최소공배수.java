package com.sparta.study.Backjun;

import java.util.*;
public class B1934최소공배수 {

    // 최대공약수 구하기
    public static int GCD(int a, int b)
    {
        if (b == 0) {
            return a;
        }
        else {
            return GCD(b, a % b);
        }
    }

    // 최소공배수 구하기
    public static int LCM(int a, int b)
    {
        return a * b / GCD(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(LCM(A,B));
        }

    }
}