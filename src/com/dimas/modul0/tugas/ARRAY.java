package com.dimas.modul0.tugas;
import java.util.Scanner;
public class ARRAY {
    public static void main(String[] args) {
        Scanner n = new Scanner (System.in);
        String [] array = {"dimas", "fajar", "huda", "arpan", "risjad"};
        
        System.out.print("Masukkan index ke- [0-4]: ");
        int index = n.nextInt();
        
        switch (index){
            case 0 :
                System.out.println("index ke-0 adalah "+array[0]);
                break;
            case 1 :
                System.out.println("index ke-1 adalah "+array[1]);
                break;
            case 2 :
                System.out.println("index ke-2 adalah "+array[2]);
                break;
            case 3 :
                System.out.println("index ke-3 adalah "+array[3]);
                break;
            case 4 :
                System.out.println("index ke-4 adalah "+array[4]);
                break;
            default :
                System.out.println("Tidak ada dalam pilihan");
                break;
        }
    }
}