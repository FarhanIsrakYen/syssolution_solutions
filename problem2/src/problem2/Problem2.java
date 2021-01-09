/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem2;

import java.util.Scanner;

/**
 *
 * @author Yen
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers?");
        int size = sc.nextInt();
        System.out.println("Insert the numbers");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        SingleNumber(arr);
    }
    
    public static void SingleNumber(int nums[]) {
        int res = 0;
        for (int i : nums) {
            res ^= i;
        }
        System.out.println(res);
    }
    
}
