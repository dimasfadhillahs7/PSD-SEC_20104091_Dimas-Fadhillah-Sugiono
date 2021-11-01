package com.dimas.modul3.tugas;
public class Tugas1 {
        public static long fib1(long Num){
        if (Num==0) return 0;
        else if (Num == 1) return 1;
        else{
            long x = 0;
            long y = 1;
            for(long k =2; k<=Num; k++){
                y = x + y;
                x = y - x;
            }
        return y;
        }

    }
    
    public static void main(String[] args) {
        long buildTime = System.currentTimeMillis();
        System.out.println(fib1(50));
        System.out.println("\nBuild Time : "+(System.currentTimeMillis()- buildTime)+" millisecond(s).");
    }
}
