package com.dimas.modul2.tugas;
import java.util.Random;
public class Tugas2 {
    public static int maxSubSum2(int [ ] a){
        int maxSum = 0;
        for(int i = 0; i < a.length; i++ ) {
            int thisSum = 0;
            for(int j = i; j < a.length; j++ ) {
                thisSum += a[j];
                if( thisSum > maxSum) maxSum = thisSum;
            }
        }
        return maxSum;
        }
    
    public static void main(String [ ] args ){
        long buildTime = System.currentTimeMillis();
        Random random = new Random();
        int a[] = new int[1000];
        
        for (int i=0; i<1000; i++){
            a[i]= random.nextInt(1000);
        }
        int maxSum;
        maxSum = maxSubSum2( a );
        System.out.println( "Max sum is " + maxSum );
        
        System.out.println("\nBuild Time : "+(System.currentTimeMillis()- buildTime)+" millisecond(s).");
    }
}
