package com.dimas.modul0.tugas;
import java.util.Scanner;
public class WHILE {
    public static void main(String[] args) {
        Scanner n = new Scanner (System.in);
        System.out.print("Masukkan bilangan : ");
        int a = n.nextInt();
        
        while (a>=0){
            System.out.println(a);
            a--;
        }
    }
}