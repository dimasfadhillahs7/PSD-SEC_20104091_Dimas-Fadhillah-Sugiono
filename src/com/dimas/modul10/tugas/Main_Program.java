package com.dimas.modul10.tugas;
import static com.dimas.modul10.praktikum.sorting.bubbleSort;
import static com.dimas.modul10.praktikum.sorting.insertSort;
import static com.dimas.modul10.praktikum.sorting.selectionSort;
import java.util.Scanner;

public class Main_Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pilih, jumlah, array[];
        System.out.println("<====MENU====>"
                +"\n1. BubbleSort"
                +"\n2. SelectionSort"
                +"\n3. InsertionSort");
        System.out.print("Pilihan : ");
        pilih = scan.nextInt();
        System.out.println();

        switch (pilih){
            case 1 :
                System.out.println("<== Sorting Dengan BubbleSort ==>");
                System.out.print("Masukan Jumlah Data : ");
                jumlah = scan.nextInt();
                array = new int[jumlah];
                for (int i = 0; i < array.length; i++){
                    System.out.print("Masukan Data ke-" +(i)+ " : ");
                    array[i] = scan.nextInt();
                }
                System.out.print("Data Sebelum Disorting : ");
                for (int a = 0; a < array.length; a++){
                    System.out.print(array[a]+" ");
                }
                System.out.println();

                System.out.print("Data Setelah Disorting : ");
                bubbleSort(array);
                for (int f = 0; f < array.length; f++){
                    System.out.print(array[f] + " ");
                }
                break;
            case 2 :
                System.out.println("<== Sorting Dengan SelectionSort ==>");
                System.out.print("Masukan Jumlah Data : ");
                jumlah = scan.nextInt();
                array = new int[jumlah];
                for (int i = 0; i < array.length; i++){
                    System.out.print("Masukan Data ke-" +(i)+ " : ");
                    array[i] = scan.nextInt();
                }
                System.out.print("Data Sebelum Disorting : ");
                for (int a = 0; a < array.length; a++){
                    System.out.print(array[a]+" ");
                }
                System.out.println();

                System.out.print("Data Setelah Disorting : ");
                selectionSort(array);
                for (int f = 0; f < array.length; f++){
                    System.out.print(array[f] + " ");
                }
                break;
            case 3 :
                System.out.println("<== Sorting Dengan InsertionSort ==>");
                System.out.print("Masukan Jumlah Data : ");
                jumlah = scan.nextInt();
                array = new int[jumlah];
                for (int i = 0; i < array.length; i++){
                    System.out.print("Masukan Data ke-" +(i)+ " : ");
                    array[i] = scan.nextInt();
                }
                System.out.print("Data Sebelum Disorting : ");
                for (int a = 0; a < array.length; a++){
                    System.out.print(array[a]+" ");
                }
                System.out.println();

                System.out.print("Data Setelah Disorting : ");
                insertSort(array);
                for (int f = 0; f < array.length; f++){
                    System.out.print(array[f] + " ");
                }
                break;
            default :
                System.out.println("Tidak Ada Pilihan");
        }
    }
}

