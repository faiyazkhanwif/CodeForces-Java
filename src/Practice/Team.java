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
public class Team {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int solve = 0;
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int ppnts = 0;
            for (int j = 0; j < 3; j++) {
                if (in.nextInt()==1) {
                    ppnts++;
                }
            }
            if (ppnts>=2) {
                solve++;
            }
        }
        System.out.println(solve);
    }
}
