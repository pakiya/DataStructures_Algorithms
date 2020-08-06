package com.data_structures_algorithms.recursion;

public class Recursion {

    public void printNumberOdN(int n) {
        if (n < 1) {
            System.out.println("Task finished!");
        } else {
            printNumberOdN(n - 1);
            System.out.println("Hello Number : " + n);
        }
    }

    public int printFactorialNumber(int number) {
        if (number == 0) {
            return 1;
        } else {
            printFactorialNumber(number - 1);
            return number * printFactorialNumber(number - 1);
        }
    }

    public int printFibonacciSeries(int number) {
        if (number < 1) {
            return -1;
        } else if (number == 1 || number == 2) {
            return number - 1;
        } else {
            return printFibonacciSeries(number - 2) + printFibonacciSeries(number - 1);
        }
    }

    public void main() {
        bar();
        System.out.println("I am main!");
    }

    public void bar() {
        doWork();
        System.out.println("I am Bar!");
    }

    public void doWork() {
        doMore();
        System.out.println("I am Do Work!");
    }

    public void doMore() {
        System.out.println("I am Do more!");
    }


}


