package com.dimas.modul3.tugas;
public class Tugas3 {
        public static long fib3(int n) {
        if(n<=1) return n;
        long fib1 = 0;
        long fib2 = 1;
        long result = 0;
        for(int ii = 2; ii<=n; ii++) {
            result = fib2 + fib1;
            fib1 = fib2;
            fib2 = result;
        }
        return result;
    }
    
    public static void main(String[] args) {
        long buildTime = System.currentTimeMillis();
        System.out.println(fib3(50));
        System.out.println("\nBuild Time : "+(System.currentTimeMillis()- buildTime)+" millisecond(s).");
    }
}
