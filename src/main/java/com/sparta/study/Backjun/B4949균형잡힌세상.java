package com.sparta.study.Backjun;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class B4949균형잡힌세상 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        while (!S.equals(".")) {
            Stack<Character> stack = new Stack<>();

                for (int j = 0; j < S.length(); j++) {

                    if (S.charAt(j) == '(' || S.charAt(j) == '[') {
                        stack.push(S.charAt(j));
                    } else if (S.charAt(j) == ')') {
                        //비어있는지를 먼저 본다.
                        if (stack.empty() || stack.peek() != '(') {
                            stack.push(S.charAt(j));
                        } else {
                            stack.pop();
                        }
                    } else if (S.charAt(j) == ']') {
                        if (stack.empty() || stack.peek() != '[') {
                            stack.push(S.charAt(j));
                        } else {
                            stack.pop();
                        }
                    }
                }
                if (stack.empty()) System.out.println("yes");
                else System.out.println("no");
                S = br.readLine();
        }
    }
}
