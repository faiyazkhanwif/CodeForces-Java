/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package global13;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author faiya
 */
public class KthLargestValue {

    static int kthval(Integer[] arr, int n) {
        //System.out.println("start----------");
        //System.out.println("ekhane n-1: "+ (n-1));
        Integer[] temp = arr.clone();

        Arrays.sort(temp,Collections.reverseOrder());
        //int[] ans = new int[temp.length];
        //int j = 0;
        //for (int i = ans.length - 1; i >= 0; i--) {
        //    ans[i] = temp[j];
        //    j++;
        //}
        //System.out.println("Array------------");
        //for (int i = 0; i < ans.length; i++) {
        //    System.out.print(ans[i]+" ");
        //}
        //System.out.println("");
        return temp[n - 1];
    }

    static void assign(Integer[] arr, int n) {
        arr[n - 1] = 1 - arr[n - 1];
        //for (int i = 0; i < arr.length; i++) {
        //    System.out.print(arr[i]+" ");
        //}
        //System.out.println("");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int q = in.nextInt();
        Integer arr[] = new Integer[l];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        //System.out.println("Q: "+q);
        for (int i = 0; i < q; i++) {
            int type = in.nextInt();
            int n = in.nextInt();
            //System.out.print("type: "+type);
            //System.out.println("  n: "+n);
            if (type == 1) {
                assign(arr, n);
            } else {
                System.out.println(kthval(arr, n));
            }
        }
    }
}
