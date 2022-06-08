package com.sparta.study.Backjun;
import java.util.Scanner;


//acm호텔
public class B10250acm호텔 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        for(int i = 0; i < T; i++) {

            int H = in.nextInt();
            int W = in.nextInt();
            int N = in.nextInt();
            int X = 0;
            int Y = 0;
            if(N % H == 0) {
                Y = H *100 ;
                X = N / H ;
                System.out.println((H * 100) + (N / H));

            } else {
                Y = (N & H) * 100;
                X = (N / H) +1;
                System.out.println(((N % H) * 100) + ((N / H) + 1));
            }
        }
    }
}