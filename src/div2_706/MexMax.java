/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package div2_706;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author faiya
 */
public class MexMax {

    static int mex(ArrayList<Integer> A) {
        Collections.sort(A);
        int min = 0;
        int cap = A.size(); //for efficiency — no need to calculate or access the array object’s length property per iteration 

        for (int i = 0; i < cap; i++) {
            if (A.get(i) == min) {
                min++;
            }//can add else if A[i] > min, break; as suggested by punit
        }
        //min = ( min <= 0 ) ? 1:min; //this means: if (min <= 0 ){min =1}else{min = min} you can also do: if min <1 for better efficiency/less jumps
        return min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int k = in.nextInt();
            ArrayList<Integer> arr = new ArrayList();
            Set<Integer> set = new HashSet<>();
            for (int j = 0; j < n; j++) {
                int x = in.nextInt();
                arr.add(x);
                set.add(x);
            }
            ////System.out.println(arr);
            //System.out.println("---------------------------------");
            for (int j = 0; j < k; j++) {
                double a = mex(arr);
                //System.out.println("mex: "+a);
                double  b = Collections.max(arr);
                //System.out.println("max: "+b);
                double an = (a + b) / 2;
                int ans = (int)Math.ceil(an);
                //System.out.println("ans to be added: "+ ans);
                //System.out.println(ans);
                arr.add(ans);
                set.add(ans);
                //System.out.println(set);
            }
            System.out.println(set.size());
        }

    }
}
