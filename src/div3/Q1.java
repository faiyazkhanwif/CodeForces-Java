/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package div3;

import java.util.Scanner;

/**
 *
 * @author faiya
 */
public class Q1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] marr = new int[n];
        for (int i = 0; i < n; i++) {
            marr[i] = in.nextInt();
        }

        int x = 1;
        int count = 0;
        //int[] res = new int[n];
        for (int p = 0; p < marr.length; p++) {
            int j = x;
            for (int i = 0; i <= 4; i++) {
                //System.out.println("Ami i==="+i);
                if (i == 0) {
                    //j += 1;
                    count++;
                    //System.out.println("j="+j);
                } else if (i == 1) {
                    j = j * 10 + j;
                    count+=2;
                    //System.out.println("j="+j);
                } else if (i == 2) {
                    j = j * 10 + x;
                    //System.out.println("j="+j);
                    count+=3;
                } else if (i == 3) {
                    j = x + 10 * j;
                    //System.out.println("j="+j);
                    count+=4;
                } else {
                    i = -1;
                    //System.out.println("shesh------");
                    x++;
                    j=x;
                    //System.out.println("new x="+x);
                    //System.out.println("new j="+j);
                }
                if (j == marr[p]) {
                    //res[p] = count;
                    //System.out.println("found============================");
                    System.out.println(count);
                    //System.out.println("-----------------------------------------");
                    break;
                }
            }
            x = 1;
            count=0;
            //j=0;
        }

    }
}
