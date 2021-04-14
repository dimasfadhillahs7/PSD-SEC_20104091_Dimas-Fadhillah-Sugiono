package com.dimas.modul0.tugas;
import java.util.Scanner;
public class SWITCH {
    public static void main(String[] args) {
        Scanner n = new Scanner (System.in);
        System.out.print("Masukkan hari ke- : ");
        int a = n.nextInt();
        
        switch (a){
            case 1 :
                System.out.println("Hari ke-"+a+" adalah hari senin");
                break;
            case 2 :
                System.out.println("Hari ke-"+a+" adalah hari selasa");
                break;
            case 3 :
                System.out.println("Hari ke-"+a+" adalah hari rabu");
                break;
            case 4 :
                System.out.println("Hari ke-"+a+" adalah hari kamis");
                break;
            case 5 :
                System.out.println("Hari ke-"+a+" adalah hari jumat");
                break;
            case 6 :
                System.out.println("Hari ke-"+a+" adalah hari sabtu");
                break;
            case 7 :
                System.out.println("Hari ke-"+a+" adalah hari minggu");
                break;
            default :
                System.out.println("Tidak ada dalam pilihan");
                break;
        }
    }
}