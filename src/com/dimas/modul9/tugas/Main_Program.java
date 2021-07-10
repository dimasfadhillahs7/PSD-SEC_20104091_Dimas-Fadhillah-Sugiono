package com.dimas.modul9.tugas;

import com.dimas.modul9.praktikum.Method;
import com.dimas.modul9.praktikum.Node;
import java.util.Scanner;

public class Main_Program {
        public static void main(String[] args) {
        Method binary = new Method();
        Node objek;
        Scanner n = new Scanner (System.in);
        boolean ulang=true;
        System.out.println("=========== MENU ==========="
            + "\n1.\tInsert"
            + "\n2.\tFind"
            + "\n3.\tfindMax"
            + "\n4.\tfindMin"
            + "\n5.\tRemove"
            + "\n6.\tremoveAll"
            + "\n7.\tFind Directory"
            + "\n8.\tGetLeafCount"
            + "\n9.\tcetak PreOrder"
            + "\n10.\tcetak InOrder"
            + "\n11.\tcetak PostOrder"    
            + "\n0.\tKeluar");
            System.out.println("============================");
        
        do {
            System.out.print("\nMasukkan menu\t: ");
            int menu = n.nextInt();

            switch (menu){
                case 1:
                    System.out.print("Masukkan banyaknya data\t: ");
                    int jmlh = n.nextInt();
                    for(int x = 0; x < jmlh; x++) {
                        System.out.print("Masukkan Data ke-"+(x+1)+" : ");	
                        objek = new Node (n.nextInt());
                        binary.insert(objek);
                    }
                    break;
                case 2:  
                    System.out.print("\nMasukkan data yang ingin dicari\t: ");
                    int cari = n.nextInt();
                    binary.find(cari);
                    break;
                case 3:
                    System.out.println("Nilai terbesar adalah\t: " + binary.findMax().data);
                    break;

                case 4:
                    System.out.println("Nilai terkecil adalah\t: "+binary.findMin().data);
                    break;
                case 5:
                    System.out.print("Masukkan data yang ingin dihapus\t: ");
                    int hapus = n.nextInt();
                    binary.remove(hapus);
                    break;
                case 6:
                    binary.removeAll();
                    break;
                case 7:
                    System.out.print("Masukkan direktori yang ingin dicari\t: ");
                    int dir = n.nextInt();
                    binary.findDirectory(dir);
                    break;
                case 8:
                    System.out.println("jumlah leaf\t: "+binary.getLeafCount());
                    break;
                case 9:
                    System.out.print("Traversal dengan preorder : ");
                    binary.preOrder();
                    System.out.println();
                    break;
                case 10:             
                    System.out.print("Traversal dengan inorder : ");
                    binary.inOrder();
                    System.out.println();
                    break;
                case 11:
                    System.out.print("Traversal dengan postorder : ");
                    binary.postOrder();
                    System.out.println();
                    break;
                case 0 :
                    ulang = false;
                    System.out.println("Anda Keluar");
                    break;
                default :
                    System.out.println("404 Error Not Found");
                    break;

            }
        }while (ulang==true);
    }
}