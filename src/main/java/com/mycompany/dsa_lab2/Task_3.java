/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsa_lab2;

/**
 *
 * @author N TECH
 */
public class Task_3 {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        
        for (String sentence : sentences) {
            String[] words = sentence.split(" ");
            int wordCount = words.length;
            maxWords = Math.max(maxWords, wordCount);
        }
        return maxWords;
    }

    public static void main(String[] args) {
        String[] sentences = {
            "I love cats",
            "Java is good",
            "Coding is fun sometimes"
        };
        
        Task_3 solution = new Task_3(); 
        int result = solution.mostWordsFound(sentences);
        System.out.println(result); 
    }
}

