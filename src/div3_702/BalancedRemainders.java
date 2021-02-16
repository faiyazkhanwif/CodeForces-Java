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

//Did not pass
public class BalancedRemainders {
    static int balance(int[] arr){
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i]%3;
        }
        int max = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i]>max) {
                max = temp[i];
            }
        }
        int steps = 0;
        for (int i = 0; i < temp.length; i++) {
            while(temp[i]!=max){
                temp[i]+=1;
                steps++;
            }
        }
        return steps;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            int[] arr = new int[x];
            for (int j = 0; j < x; j++) {
                arr[i] = in.nextInt();
            }
            System.out.println(balance(arr));
        }
        
    }
}
