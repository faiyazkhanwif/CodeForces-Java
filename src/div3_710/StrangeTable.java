/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package div3_710;

import java.util.Scanner;

/**
 *
 * @author faiya
 */
public class StrangeTable {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            long n = in.nextLong();
            long m = in.nextLong();
            long x = in.nextLong();
            x--;
                long row = x%n;
                long col = x/n;
                System.out.println(row*m+col+1);
            
        }
    }
}
