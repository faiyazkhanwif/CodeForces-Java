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
public class DominoOnWindowsill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int k1 = in.nextInt();
            int k2 = in.nextInt();
            int w = in.nextInt();
            int b = in.nextInt();
            
            int wcg = w*2;
            int bcg = b*2;
            
            int cells = 2*n;
            //System.out.println("CELL ase: "+cells);
            //System.out.println("white tile ase: "+wcg);
            //System.out.println("black tile ase: "+bcg);
            
            //System.out.println("bhorte hobe");
            
            if (wcg<=k1+k2 && bcg<=cells-(k1+k2)) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
