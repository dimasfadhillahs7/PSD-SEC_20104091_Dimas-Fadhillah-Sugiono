package com.dimas.modul3.praktikum;
public class percobaan4 {
    public static long fib4(int n) {
        return fiboHelp(0,1,n);
    }
    
    public static long fiboHelp (long x, long y, int n) {
        if (n == 0) return x;
        else if (n == 1) return y;
        else return fiboHelp(y, x+y, n-1);
    }
    
    public static int rekursif(int pangkat, int bilangan){
        if(pangkat == 0) return 1;
        else return bilangan*rekursif(pangkat-1, bilangan);
    }
    
    public static void main(String[] args) {
        long buildTime = System.currentTimeMillis();
        System.out.println(fib4(10));
        System.out.println("\nBuild Time : "+(System.currentTimeMillis()- buildTime)+" millisecond(s).");
    }
}
