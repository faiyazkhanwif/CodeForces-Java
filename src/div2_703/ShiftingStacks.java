/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package div2_703;

import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author faiya
 */
// n stacks ase
// ekta stack(i) e h blocks ase
public class ShiftingStacks {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int nums = in.nextInt();
            long[] arr = new long[nums];
            for (int j = 0; j < nums; j++) {
                arr[j] = in.nextLong();
            }
            int sorted = 1;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {

                } else {
                    sorted = 0;
                }
            }
            if (sorted == 1) {
                System.out.println("YES");
            } else {
                int zerochk = 0;
                while (zerochk == 0) {
                    for (int j = 0; j < arr.length - 1; j++) {
                        if (arr[j] >= arr[j + 1] && arr[j] != 0) {
                            arr[j]--;
                            arr[j + 1]++;
                        }
                    }
                    int sorted2 = 1;
                    for (int j = 0; j < arr.length - 1; j++) {
                        if (arr[j] < arr[j + 1]) {

                        } else {
                            sorted2 = 0;
                        }
                    }
                    if (sorted2 == 1) {
                        System.out.println("YES");
                        break;
                    } else {
                        if (arr[0] == 0) {
                            zerochk = 1;
                            System.out.println("NO");
                            break;
                        } else {
                            continue;
                        }
                    }
                }

            }
        }

    }
}
