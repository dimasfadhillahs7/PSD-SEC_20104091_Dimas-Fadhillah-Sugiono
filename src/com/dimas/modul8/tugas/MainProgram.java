package com.dimas.modul8.tugas;
import com.dimas.modul8.praktikum.Method;
import java.util.Scanner;
public class MainProgram {
     public static void main(String[] args) {
        Method <Integer, String> nama = new Method <Integer, String>();
        Scanner s = new Scanner (System.in);
        Scanner n = new Scanner (System.in);
        boolean ulang = true;
        
        System.out.println("=========== MENU ==========="
            + "\n1. Input Data"
            + "\n2. Input For Null Key"
            + "\n3. containsKey & containsValue"
            + "\n4. Size"
            + "\n5. Remove"
            + "\n6. Output"    
            + "\n0. Keluar");
            System.out.println("============================");
        do {
        System.out.print("\nMasukkan menu :");
        int menu = n.nextInt();
        switch (menu){
            case 1:
                System.out.println("\nMethod input data");
                System.out.print("Masukkan jumlah data : ");
                int jmlh = n.nextInt();

                for (int i =1; i<=jmlh; i++){
                    System.out.print("masukkan data ke- "+i+" : ");
                    String objek =s.nextLine();
                    nama.put(i, objek);
                }
              
                break;
                
            case 2 :
                System.out.println("\nMethod putForNullKey ");
                String val = null;
                nama.putForNullKey(val);
                break;
            case 3 :  
                System.out.println("\nMethod containsKey & containsValue");
                System.out.print("Masukkan key yang akan di cek\t: ");
                int cekKey = n.nextInt();
                
                System.out.print("Masukkan value yang akan di cek\t: ");
                String cekValue = s.nextLine();
                
                System.out.println("Apakah key ke-"+cekKey+" memiliki value? "+nama.containsKey(cekKey));
                System.out.println("Apakah value "+cekValue+" memiliki key? "+nama.containsKey(cekKey));
                break;        
            case 4 :
                System.out.println("\nMethod Size");
                System.out.println("Size : "+nama.size());
                break;
            case 5 :
                System.out.println("\nMethod Remove");
                System.out.print("Masukkan key yang akan dihapus : ");
                int key = n.nextInt();
                nama.remove(key);
                break;
            case 6 :
                System.out.println("\nOutput");
                for (int j=1; j<=nama.size(); j++){
                    System.out.println("Nama pada key " +j+" : "+nama.get(j));
                }  
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
