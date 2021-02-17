/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import java.util.Scanner;

/**
 *
 * @author faiya
 */
public class NextRound {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int pcnt = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int scale = arr[k-1];
        for (int i = 0; i < n; i++) {
            if (scale<=arr[i] && arr[i]>0) {
                pcnt++;
            }
        }
        System.out.println(pcnt);
    }
}
