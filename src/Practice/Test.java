/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

/**
 *
 * @author faiya
 */
public class Test {
    static int countPositive(int[] x){
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i]%2!=0 || x[i]>0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int [] x = {-3, -2, 0, 1, 4};
        System.out.println(countPositive(x));
    }
}
