/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package div3_702;

import java.util.Scanner;

/**
 *
 * @author faiya
 */
//Passes all except last one as not efficient enough
public class SumOfCubes {

    static boolean isCubeSum(long n) {
        //System.out.println("Number:" + n);
        for (int i = 1; i * i * i <= n; i++) {
            int x = (i * i * i) + (i * i * i);
            if (i * i * i + (i + 1)
                    * (i + 1) * (i + 1) == n || x==n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        for (int i = 0; i < x; i++) {
            long n = in.nextLong();
            if (isCubeSum(n)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }
}
