package com.dimas.modul0.tugas;
import java.util.Scanner;
public class FOR {
    public static void main(String[] args) {
        Scanner n = new Scanner (System.in) ;
        int a,b,kpk=0;
        
	System.out.print("Masukkan bilangan bulat pertama\t: ") ;
        a = n.nextInt(); //INPUT BILANGAN PERTAMA
	System.out.print("Masukkan bilangan bulat kedua\t: ") ;
	b = n.nextInt(); //INPUT BILANGAN KEDUA
	System.out.print("KPK dari " + a + " dan " + b + " adalah : " );
        
        //STATEMEMENT FOR
	for(int x=1;x<=b;x++) { 
            kpk = (kpk + a); 
            if(kpk % b == 0) {
		System.out.println(kpk); 
                break;
            }
        }
    
    }
}