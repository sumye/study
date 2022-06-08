package com.sparta.study.Backjun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//베르트랑 공준
public class B4948베르트랑공준 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            int n = Integer.parseInt(br.readLine());
            if(n==0) {
                break;
            }

            boolean[] prime = new boolean[2*n+1];
            prime[0] = true;
            prime[1] = true;
            int count = 0;

            for(int i=2; i*i<=(2*n+1); i++) {
                for(int j=i*i; j<2*n+1; j+=i) {
                    prime[j] = true;
                }
            }
            for(int i=n+1; i<(2*n+1); i++) {
                if(prime[i] == false) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}