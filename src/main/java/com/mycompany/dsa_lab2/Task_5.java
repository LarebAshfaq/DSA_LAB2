/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsa_lab2;

/**
 *
 * @author N TECH
 */
public class Task_5 {

    public int countPrimes(int n) {
        if (n <= 2) {
            return 0; // There are no prime numbers less than 2
        }

        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true; // Initially assume all numbers >= 2 are prime
        }

        // Implement the Sieve of Eratosthenes
        for (int p = 2; p * p < n; p++) {
            if (isPrime[p]) {
                // Mark multiples of p as non-prime
                for (int multiple = p * p; multiple < n; multiple += p) {
                    isPrime[multiple] = false;
                }
            }
        }

        int primeCount = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                primeCount++;
            }
        }
        return primeCount;
    }

    public static void main(String[] args) {
        Task_5 solution = new Task_5(); // Correct instantiation of Task_5 class
        int n = 10;

        int result = solution.countPrimes(n);
        System.out.println("Number of primes less than " + n + ": " + result); // Output: 4
    }
}

