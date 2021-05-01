package com.dimas.modul1.praktikum;
import java.util.Scanner;
public class program4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double luas, phi = 3.14;
        int r;
        System.out.print("Masukan Jari-jari : ");
        r = input.nextInt();
        luas = phi*r*r;
        System.out.println("Luas Lingkaran = "+luas);
    }
}
