/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package div2_704;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author faiya
 */
public class ThreeSwimmers {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int [] arr = new int[4];
            int p = in.nextInt();
            for (int j = 0; j < 3; j++) {
                arr[j] = in.nextInt();
            }
            Arrays.sort(arr);
            int ans = -1;
            for (int j = 0; j < 3; j++) {
                if (arr[j]>=p) {
                    ans = (arr[j]-p);
                    break;
                }
            }
            if (ans!=-1) {
                System.out.println(ans);
            }else{
                int temp = -1;
                int j = 0;
                while(temp < p) {
                    temp = arr[j]*2;
                    //System.out.println(temp);
                    if (temp>=p) {
                        System.out.println(temp-p);
                        break;
                    }
                    arr[j]=temp;
                    j++;
                    if (j>2) {
                        j = 0;
                    }
                }
            }
        }
    }
}
