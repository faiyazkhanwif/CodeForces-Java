/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package div2_708;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author faiya
 */
public class Meximization {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
            }
            ArrayList<Integer> dub = new ArrayList<>();
            ArrayList<Integer> ans = new ArrayList<>();
            Arrays.sort(arr);
            for (int j = 0; j < n; j++) {
                if (ans.contains(arr[j])) {
                    dub.add(arr[j]);
                }else{
                    ans.add(arr[j]);
                }
            }
            for (int j = 0; j < dub.size(); j++) {
                ans.add(dub.get(j));
            }
            for (int j = 0; j < ans.size(); j++) {
                System.out.print(ans.get(j)+ " ");
            }
            System.out.println("");
        }
    }
}
