package com.dimas.modul1.tugas;
public class Tugas_Modul1 {
    public static void main(String[] args) {
        int a=1;
        for (int i=1; i<=4; i++){
            for (int j=1; j<=i; j++){
                if (a>9) a=0;  
                System.out.print(a+" ");
                a++;
            }
            System.out.println(" ");
        }
    }
}
