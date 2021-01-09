/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem1_1;

import java.util.Scanner;

/**
 *
 * @author Yen
 */
public class Problem1_1 {

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
        SubArr(arr);
    }

    public static void SubArr(int nums[]) {
        int res = nums[0]; 
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            res = Math.max(res, sum); 
            sum = Math.max(nums[i], sum + nums[i]);
        }
        System.out.println(res);
    }
    
}
