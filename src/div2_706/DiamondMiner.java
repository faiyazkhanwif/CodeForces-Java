/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package div2_706;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author faiya
 */
public class DiamondMiner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            double[] arrM = new double[x];
            int mc = 0;
            double[] arrD = new double[x];
            int dc = 0;
            for (int j = 0; j < 2 * x; j++) {
                double a = in.nextInt();
                double b = in.nextInt();
                if (a == 0) {
                    arrM[mc] = b;
                    mc++;
                } else if (b == 0) {
                    arrD[dc] = a;
                    dc++;
                }
            }
            //for (int j = 0; j < x; j++) {
            //    System.out.print(arrM[j]+" ");
            //}
            //System.out.println("");
            //for (int j = 0; j < x; j++) {
            //    System.out.print(arrD[j]+" ");
            //}
            
            //System.out.println("");
            
            Arrays.sort(arrM);
            Arrays.sort(arrD);
            double ans=0;
            for (int j = 0; j < x; j++) {
                System.out.println(Math.sqrt((arrM[j]*arrM[j])+(arrD[j]*arrD[j])));
                ans+=Math.sqrt((arrM[j]*arrM[j])+(arrD[j]*arrD[j]));
            }
            System.out.println("ans :"+ans);
        }
    }

}
