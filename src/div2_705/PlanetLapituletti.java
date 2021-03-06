/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package div2_705;

import java.util.Scanner;

/**
 *
 * @author faiya
 */
public class PlanetLapituletti {

    static int reverse(int a) {
        if (a == 1) {
            return 1;
        }
        if (a == 2) {
            return 5;
        }
        if (a == 5) {
            return 2;
        }
        if (a == 8) {
            return 8;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int hh = in.nextInt();
            int mm = in.nextInt();
            //System.out.println("hh: " + hh + " mm: " + mm);
            String tt = in.next();
            //System.out.println(tt);
            String revt = "";
            for (int j = tt.length() - 1; j >= 0; j--) {
                if (tt.charAt(j) == '1' || tt.charAt(j) == '2' || tt.charAt(j) == '5' || tt.charAt(j) == '8' || tt.charAt(j) == ':' || tt.charAt(j)=='0') {
                    if (tt.charAt(j) == ':') {
                        int temp = Integer.valueOf(revt);
                        if (temp >= hh) {
                            revt = "00:00";
                            break;
                        }
                    }
                    if (revt == "00:00") {
                        break;
                    }
                    if (tt.charAt(j) == ':') {
                        revt += ":";
                    } else {
                        int reversed = reverse(Integer.valueOf(String.valueOf(tt.charAt(j))));
                        revt += String.valueOf(reversed);
                    }

                } else {
                    //System.out.println(tt.charAt(j));
                    //System.out.println("barbar");
                    revt = "00:00";
                    break;
                }
            }
            //System.out.println(revt);
            if (revt != "00:00") {
                String temp = "";
                temp += String.valueOf(revt.charAt(3));
                temp += String.valueOf(revt.charAt(4));
                if (Integer.valueOf(temp) >= mm) {
                    System.out.println("00:00");
                } else {
                    System.out.println(revt);
                }
            } else {
                //System.out.println("hello");
                System.out.println(revt);
            }

        }
    }
}
