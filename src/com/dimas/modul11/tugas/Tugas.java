package com.dimas.modul11.tugas;
import com.dimas.modul11.praktikum.sorting;
import java.util.Random;
public class Tugas {
   
    public static void main(String[] args) throws Exception{
        long start = System.currentTimeMillis();
        
        int [] array = new int[100];
        Random angka = new Random();
        for (int i = 0; i <array.length ; i++){
            array[i] = angka.nextInt(10);
        }
        System.out.println("Array Sebelum Disort :");
        
        sorting.printArray(array);
        sorting.quicksort(array, 0, array.length-1);
        System.out.println("\nArray Setelah Disort :");
        sorting.printArray(array);

        long end = System.currentTimeMillis();
        System.out.println("\nWaktu yang dibutuhkan: "+(end-start)+ " Miliseconds");
    }
}

