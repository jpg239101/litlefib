package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(fib(46));
    }
    public static int fib(int n){
        int num = 0;
        if (n <= 1) {
            return n;
        }
            return fib(n-1) + fib(n-2);
    }
    public static void FibTest(int c){
        int [] contents =  new int[41];

        for(int i = 0; i < 42; i++){
            contents[i] = fib(i);
        }
        for(int i = 0; i < 42; i++){
            if (contents[i] == fib(i)){
                break;
            }
            else if 
        }





    }

    }
