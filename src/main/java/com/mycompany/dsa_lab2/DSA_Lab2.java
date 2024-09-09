/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dsa_lab2;

/**
 *
 * @author N TECH
 */
public class DSA_Lab2 {
    // TASK 1
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
                for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i]; 
        }
        return ans;
    }
    public static void main(String[] args) {
        DSA_Lab2 solution = new DSA_Lab2();

        int[] nums = {1, 2, 3};
        int[] result = solution.getConcatenation(nums);
                for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

