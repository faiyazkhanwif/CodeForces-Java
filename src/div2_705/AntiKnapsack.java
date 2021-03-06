/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package div2_705;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author faiya
 */
public class AntiKnapsack {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int k = in.nextInt();
            ArrayList<Integer> al = new ArrayList<>();
            for (int j = 1; j <= n; j++) {
                if (j==k) {
                    continue;
                }
                int chck=0;
                for (int l = j+1; l < n; l++) {
                    if (j+l!=k) {
                        continue;
                    }else{
                        chck=1;
                    }
                }
                if (chck!=1) {
                    al.add(j);
                }
            }
            System.out.println(al.size());
            //System.out.println("hi");
            for (int j = 0; j < al.size(); j++) {
                System.out.print(al.get(j)+" ");
            }
            System.out.println("");
        }
    }
}
