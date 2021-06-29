package com.dimas.modul7.praktikum;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        method queue = new method ();
        
        int pilih;
        boolean found = false;
        
            System.out.println("=========== MENU ===========\");"
            + "\n1. Enqueue"
            + "\n2. Dequeue"
            + "\n3. Show"
            + "\n4. makeEmpty"
            + "\n0. Keluar");
            System.out.println("============================");
            
        do{
            System.out.print("> Pilih Menu : ");
            pilih = n.nextInt();
            
           
            switch (pilih) {
                case 1:
                    System.out.print("Berapa banyak data yang diinput? : ");
                    int jumlah = n.nextInt();
                   
                    for (int i=0; i<jumlah; i++){
                        System.out.print("Masukkan angka\t: ");
                        int x = n.nextInt();
                        Node input = new Node(x);
                        queue.enqueue(input);
                    }
                    break;
                 case 2:
                    System.out.println(queue.dequeue().data + "\n");
                    break;
                case 3:
                    queue.show();
                    break;
                case 4:
                    queue.makeEmpty();
                    break;
                case 0:
                    found = true;
                    System.out.println("Anda keluar dari program");
                    break;
                default:
                    System.out.println("404 Not Found");
            }
        } while (found == false);
    
    }

}
