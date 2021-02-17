/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author faiya
 */
public class RegistrationSystem {

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        HashMap<String, Integer> hm = new HashMap();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String st = in.next();
            if (!hm.containsKey(st)) {
                arr.add(st);
                hm.put(st, 0);
                System.out.println("OK");
            } else {
                int temp = hm.get(st);
                arr.add(st + String.valueOf(temp + 1));
                hm.replace(st, temp + 1);
                System.out.println(st + String.valueOf(temp + 1));
            }
        }
    }
}
