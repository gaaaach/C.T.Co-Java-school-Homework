package com.example.task1;

import java.util.Stack;

public class task3 {
    public static void main(String[] args) {


        boolean balanced = true;
        String braces = "[]}[]()()()()";
        System.out.println("Given braces to check: "+ braces);

        Stack<Character> stack = new Stack<>();

        for (int n = 0; n < braces.length(); n++) {

            char c = braces.charAt(n);

            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            }
            else {
                if (c == '}') {
                    c = '{';
                }
                else if (c == ')') {
                    c = '(';
                }
                else if (c == ']') {
                    c = '[';
                }

                if (stack.empty()) {
                    balanced = false;
                    break;
                }

                if (c == stack.peek()) {
                    stack.pop();
                }
                else {
                    balanced = false;
                    break;
                }
            }
        }
        if (balanced) {
            System.out.println("Given braces are BALANCED");
        }
        else{
            System.out.println("Given braces are NOT BALANCED");
        }
    }
}
