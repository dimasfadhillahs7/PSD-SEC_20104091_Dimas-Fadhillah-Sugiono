package com.dimas.modul3.tugas;
public class Tugas2 {
        public static long fib2(int n){
        if (n<=1) return n;
        else return fib2(n-1) + fib2(n-2);
    }
    
    public static void main(String[] args) {
        long buildTime = System.currentTimeMillis();
        System.out.println(fib2(50));
        System.out.println("\nBuild Time : "+(System.currentTimeMillis()- buildTime)+" millisecond(s).");
    }
}
