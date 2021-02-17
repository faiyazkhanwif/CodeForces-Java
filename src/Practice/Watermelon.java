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
public class Watermelon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n%2!=0 || n==2) {
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
 
}
