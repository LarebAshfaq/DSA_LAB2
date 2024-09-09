/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsa_lab2;

import java.util.ArrayList;
import java.util.List;

public class Task_2 {

    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(String.valueOf(x))) {
                result.add(i); // Add index to result list
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] words = {"apple", "banana", "cherry", "date"};
        char x = 'a';

        Task_2 solution = new Task_2(); // Use Task_2 class name
        List<Integer> ret = solution.findWordsContaining(words, x);
        System.out.println(ret); // Output: [0, 1, 3]
    }
}
