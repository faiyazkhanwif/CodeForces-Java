/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu_105_div2;

import java.util.Scanner;

/**
 *
 * @author faiya
 */
public class BerlandCrossword {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int u = in.nextInt();
            int r = in.nextInt();
            int d = in.nextInt();
            int l = in.nextInt();
            int u1 = u;
            int r1 = r;
            int l1 = l;
            int d1 = d;
            if (u == n) {
                l1--;
                r1--;
            }
            if (d == n) {
                l1--;
                r1--;
            }
            if (l == n) {
                d1--;
                u1--;
            }
            if (r == n) {
                d1--;
                u1--;
            }
            if (u == n - 1) {
                if (l1 > r1) {
                    l1--;
                } else {
                    r1--;
                }
            }
            if (d == n - 1) {
                if (l1 > r1) {
                    l1--;
                } else {
                    r1--;
                }
            }
            if (l == n - 1) {
                if (u1 > d1) {
                    u1--;
                } else {
                    d1--;
                }
            }
            if (r == n - 1) {
                if (u1 > d1) {
                    u1--;
                } else {
                    d1--;
                }
            }

            if (l1 < 0 || u1 < 0 || d1 < 0 || r1 < 0) {
                System.out.println("NO");;
            } else {
                System.out.println("YES");
            }
        }
    }
}
