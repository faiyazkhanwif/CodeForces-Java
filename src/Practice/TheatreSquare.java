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
public class TheatreSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double n = in.nextDouble();
        double m = in.nextDouble();
        double a = in.nextDouble();
        int ans = (int)(Math.ceil(n/a)*Math.ceil(m/a));
        System.out.println(ans);
    }
}
