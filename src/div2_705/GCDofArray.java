/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package div2_705;

import java.util.Scanner;

/**
 *
 * @author faiya
 */
public class GCDofArray {

    static int gcd(int a, int b) {
        int res = 0;
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
            res = a;
        }
        return res;
    }

    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        int[] myArray = new int[n];
        for (int p = 0; p < n; p++) {
            myArray[p] = in.nextInt();
        }
        for (int i = 0; i < q; i++) {
            int ith = in.nextInt();
            int x = in.nextInt();
            myArray[ith - 1] = myArray[ith - 1] * x;
            int result = gcd(myArray[0], myArray[1]);
            for (int j = 2; j < myArray.length; j++) {
                result = gcd(result, myArray[j]);
            }
            System.out.println(result%1000000007);
        }

    }
}
