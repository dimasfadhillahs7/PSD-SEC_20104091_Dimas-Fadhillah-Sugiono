package com.dimas.modul2.tugas;
import java.util.Random;
public class Tugas4 {
    public static int maxSubSum4(int [ ] a){
        int maxSum = 0, thisSum = 0;
        for(int j = 0; j < a.length; j++) {
            thisSum += a[j];
            if(thisSum > maxSum)
            maxSum = thisSum;
            else if(thisSum < 0)
            thisSum = 0;
        }
        return maxSum;
    }
    
    public static void main(String [ ] args) {
        long buildTime = System.currentTimeMillis();
        Random random = new Random();
        int a[] = new int[1000];
        
        for (int i=0; i<1000; i++){
            a[i]= random.nextInt(1000);
        }
        int maxSum;
        maxSum = maxSubSum4(a);
        System.out.println("Max sum is " + maxSum);
        
        System.out.println("\nBuild Time : "+(System.currentTimeMillis()- buildTime)+" millisecond(s).");
    }
}
