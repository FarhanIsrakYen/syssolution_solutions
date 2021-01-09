/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Yen
 */
public class Problem3 {

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
        System.out.println(Arrays.toString(DigitIncreament(arr)));
    }

    public static int[] DigitIncreament(int digits[]) {
         for(int i = digits.length-1; i >= 0; i--){
             if (digits[i] < 9) {
                 digits[i]++; 
                 return digits;
             }
             digits[i] = 0;
         }
         int res[] = new int[digits.length + 1]; 
         res[0] = 1;
         return res;
         
    }
    
}
