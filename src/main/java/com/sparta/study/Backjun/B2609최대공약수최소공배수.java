package com.sparta.study.Backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2609최대공약수최소공배수 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        System.out.println(gcd(A, B));
        System.out.println(lcm(A, B));
    }
    //최대공약수 구하기
    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b; //500 % 300 200
            a = b;         //300 % 200 100
            b = r;         //200 % 100 0
                           //100 % 0  0
        }
        return a;
    }
    //최소공배수 구하기
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);    //500 * 300 / 100 = 1500
    }
}
