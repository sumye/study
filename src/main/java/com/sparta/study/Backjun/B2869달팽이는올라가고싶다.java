package com.sparta.study.Backjun;

import java.io.*;
import java.util.StringTokenizer;


//달팽이는 올라가고 싶다
public class B2869달팽이는올라가고싶다 {

    public  static  void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int high = (V - B) / (A - B);
        if((V - B) % (A - B) != 0) high++;
        System.out.println(high);


    }
}
