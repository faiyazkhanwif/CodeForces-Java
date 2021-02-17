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
public class AWayToLongWords {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            String str = in.next();
            int ln = str.length();
            if (ln > 10) {
                char start = str.charAt(0);
                char end = str.charAt(ln-1);
                String res = String.valueOf(start + String.valueOf(ln - 2))
                        + String.valueOf(end);
                System.out.println(res);
            } else {
                System.out.println(str);
            }
        }
    }
}
