/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu_105_div2;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author faiya
 */
public class ABCstring {

    static boolean matchingPeer(char open, char close) {
        if (open == '(' && close == ')') {
            return true;
        } else if (open == '[' && close == ']') {
            return true;
        } else if (open == '{' && close == '}') {
            return true;
        }
        return false;

    }

    static boolean checkParenthesis(String str) {
        char[] c = str.toCharArray();
        Stack<Character> myStack = new Stack<Character>();

        for (int i = 0; i < c.length; i++) {
            if (c[i] == '(' || c[i] == '[' || c[i] == '{') {
                myStack.push(c[i]);
            } else if (c[i] == ')' || c[i] == ']' || c[i] == '}') {
                if (myStack.peek()==null) {
                    return false;
                }
                if (matchingPeer(myStack.peek(), c[i]) == true) {
                    myStack.pop();
                } else {
                    return false;
                }
            }
        }
        if (myStack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String x = in.next();
            //System.out.println(x+"-------------------");
            if (x.charAt(0) == x.charAt(x.length() - 1)) {
                System.out.println("NO");
            } else {
                String temp1 = "";
                String temp2 = "";
                for (int j = 0; j < x.length(); j++) {
                    if (x.charAt(j) == x.charAt(0)) {
                        temp1 += "(";
                    } else if (x.charAt(j) == x.charAt(x.length() - 1)) {
                        temp1 += ")";
                    } else {
                        temp1 += "(";
                    }
                }
                for (int j = 0; j < x.length(); j++) {
                    if (x.charAt(j) == x.charAt(0)) {
                        temp2 += "(";
                    } else if (x.charAt(j) == x.charAt(x.length() - 1)) {
                        temp2 += ")";
                    } else {
                        temp2 += ")";
                    }
                }
                //System.out.println(temp1);
                //System.out.println(temp2);
                if (checkParenthesis(temp1) || checkParenthesis(temp2)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
                //System.out.println("");
            }
        }
    }
}
