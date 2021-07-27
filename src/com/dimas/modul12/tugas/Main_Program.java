package com.dimas.modul12.tugas;

import com.dimas.modul12.praktikum.searching;
import java.util.Random;
import java.util.Scanner;

public class Main_Program {
        public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int pilih, cari, hasil;
        int [] array = new int[10];
        Random angka = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = angka.nextInt(10);
            System.out.print(array[i] + ",");
        }
        
        System.out.println("\n<====MENU====>"
                +"\n1. Sequential Search"
                +"\n2. Binary Search"
                +"\n3. Interpolation Search");
        System.out.print("Pilihan : ");
        pilih = scan.nextInt();
        System.out.println();

        switch (pilih){
            case 1 :
                System.out.println("<== Sequential Search ==>");
                System.out.print("Masukkan data yang dicari: ");
                cari = scan.nextInt();
                hasil = searching.sequential(array, cari);   
                if ( hasil== -1){
                System.out.println("Data Tidak Ditemukan");
                }else {
                System.out.println("Data Ditemukan");
                }
                break;
            case 2 :
                System.out.println("<== Binary Search ==>");
                System.out.print("Masukkan data yang dicari: ");
                cari = scan.nextInt();
                hasil = searching.binarySearch(array, cari);
                if ( hasil== -1){
                System.out.println("Data Tidak Ditemukan");
                }else {
                System.out.println("Data Ditemukan");
                }
                break;
            case 3 :
                System.out.println("<== Interpolation Search ==>");
                System.out.print("Masukkan data yang dicari: ");
                cari = scan.nextInt();
                hasil = searching.interpolationSearch(array, cari);   
                if ( hasil== -1){
                System.out.println("Data Tidak Ditemukan");
                }else {
                System.out.println("Data Ditemukan");
                }
                break;
            default :
                System.out.println("Tidak Ada Pilihan");
        }
            
    }
}
