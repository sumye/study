package com.sparta.study.Backjun;

import java.util.Scanner;

public class B1436영화감득숌 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int num=0; // 증가 숫자
        while(n!=0) { // n이 0이 될 때 까지
            num++;
            if(String.valueOf(num).contains("666")) { // 문자열로 변환해 666이 포함되는지 여부 확인
                n--; // 포함되면 갯수를 하나 줄인다.
            }
        }
        System.out.println(num); // 결국 n이0이 됬을 때가 n번째 숫자인 것이다.
    }
}
