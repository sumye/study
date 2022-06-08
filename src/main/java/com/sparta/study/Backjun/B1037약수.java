package com.sparta.study.Backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B1037약수 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] num = new int[N];

        for(int i=0 ; i<N; i++) {
            num[i] = sc.nextInt();
        }

        Arrays.sort(num);

        int max = num[N-1];
        int min = num[0];

        System.out.println(max*min);

    }

}
