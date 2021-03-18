/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu_106_div2;

import java.util.Scanner;

/**
 *
 * @author faiya
 */
public class BinaryRemovals {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        for (int k = 0; k < n; k++) {
            String s = scan.nextLine();
            int i = s.indexOf("11");
            int j = s.lastIndexOf("00");
            if (j < i || j == -1 || i == -1) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        }
    }
}
