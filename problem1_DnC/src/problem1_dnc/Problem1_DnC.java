/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem1_dnc;

import java.util.Scanner;

/**
 *
 * @author Yen
 */
public class Problem1_DnC {

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
        System.out.println(SubArr(arr, 0 , arr.length-1));
    }
    
    public static int SubArr(int nums[], int left, int right) {
        if (left == right) {
            return nums[left];
        }
        int mid = (left + right) / 2;
        return Math.max(Math.max(SubArr(nums, mid+1, right), SubArr(nums, left, mid)), Merge(nums, left, mid, right));
    }
    
    public static int Merge(int nums[], int left, int mid, int right) {
        int leftNode = Integer.MIN_VALUE;
        int rightNode = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = mid; i >= left; i--) {
            sum += nums[i];
            if (sum > leftNode) {
                leftNode = sum;
            }
        }
        sum = 0;        
        for (int i = mid+1; i <= right; i++) {
            sum += nums[i];
            if (sum > rightNode) {
                rightNode = sum;
            }
        }
        return (leftNode + rightNode);
    }
}
