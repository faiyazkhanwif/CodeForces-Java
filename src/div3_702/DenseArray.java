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

//Passed
public class DenseArray {

    static int minum(int[] arr) {
        int needednum = 0;
        for (int i = 1; i < arr.length; i++) {
            double max = Math.max(arr[i], arr[i - 1]);
            double min = Math.min(arr[i], arr[i - 1]);
            while (max > 2*min) {
                min = min * 2;
                needednum++;
            }
        }
        return needednum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        for (int i = 0; i < x; i++) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = in.nextInt();
            }
            System.out.println(minum(a));
        }
    }
}
