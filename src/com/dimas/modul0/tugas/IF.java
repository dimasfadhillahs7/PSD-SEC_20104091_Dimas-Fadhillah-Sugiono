package com.dimas.modul0.tugas;
import java.util.Scanner;
public class IF {
    public static void main(String[] args) {
        Scanner n = new Scanner (System.in);
        
        System.out.print("Masukkan bilangan : ");
        int a = n.nextInt();
        
        if (a%2==0){
            System.out.println(a+" adalah bilangan genap");
        }
        else {
            System.out.println(a+" adalah bilangan ganjil");
        }
    }
}