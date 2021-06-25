package com.dimas.modul6.tugas;

import com.dimas.modul6.praktikum.MethodAndMain_Stack;
import com.dimas.modul6.praktikum.Node;
import java.util.Scanner;

public class konversi {
    public static void main(String[] args) {
        MethodAndMain_Stack stack = new MethodAndMain_Stack();
        Scanner n = new Scanner(System.in);
        boolean ulang = false;
        int decimal =0;
        int i =0;
        System.out.println("===> Konverter Biner ke Desimal [inputkan 2 untuk berhenti] <===");
        do {
           
            System.out.print("Masukkan bilangan biner\t: ");
            int bilBiner = n.nextInt();
            if (bilBiner==2){
                System.out.println("Anda Keluar!");
                break;
            }
            else{
                if (bilBiner%10==1 || bilBiner%10==0){
                    while(true)
                    {
                        if(bilBiner == 0){
                            break;
                        }
                        else {
                            int temp = bilBiner%10;
                            decimal += temp*Math.pow(2, i);
                            bilBiner = bilBiner/10;
                            i++;
                        }
                    }
                    Node objek = new Node(decimal);
                    stack.push(objek);
                    System.out.print("Konversi Dalam bilangan decimal : ");
                    stack.show();
                    System.out.println("");
                    ulang=false;
                }
                else {
                    System.out.println("^[ERROR 666] biner hanya 0 dan 1\n");
                    ulang=true;
                }
            }
        }while (ulang==true);
            
    }
}
