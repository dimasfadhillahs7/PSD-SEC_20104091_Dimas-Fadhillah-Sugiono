package com.dimas.modul7.tugas;

import com.dimas.modul7.praktikum.Node;
import com.dimas.modul7.praktikum.method;
import java.util.Scanner;

public class queue_circularArray {
    public static void main(String[] args) {
            // DECLARATION
        Scanner s= new Scanner(System.in);
        Scanner n = new Scanner(System.in);
        method nim = new method();
        method nama = new method();
        method alamat = new method();

        // INPUT
        System.out.print("Masukkan jumlah mahasiswa\t: ");
        int jmlh = n.nextInt();

        for (int i = 1; i <= jmlh; i++) {
            System.out.println("Mahasiswa ke-" + i);

            System.out.print("NIM\t: ");
            Node input_nim = new Node (n.nextInt());
            nim.enqueue(input_nim);

            System.out.print("Nama\t: ");
            Node input_nama = new Node(s.nextLine());
            nama.enqueue(input_nama);

            System.out.print("Alamat\t: ");
            Node input_alamat = new Node(s.nextLine());
            alamat.enqueue(input_alamat);

            System.out.println();
        }

        // OUTPUT
        System.out.print("Keluaran mulai dari mahasiswa ke\t: ");
        int mahasiswaOutput = n.nextInt();

        if (mahasiswaOutput == 1) {
            for (int i = 1; i < jmlh; i++) {
                System.out.println(nim.dequeue().data);
                System.out.println(nama.dequeue().data);
                System.out.println(alamat.dequeue().data);
            }
        } else if (mahasiswaOutput > 1 && mahasiswaOutput <= jmlh) {
            method nimTemp = new method();
            method namaTemp = new method();
            method alamatTemp = new method();

            for (int i = 1; i < mahasiswaOutput; i++) {
                nimTemp.enqueue(nim.dequeue());
                namaTemp.enqueue(nama.dequeue());
                alamatTemp.enqueue(alamat.dequeue());
            }

            for (int i = 1; i <= jmlh - (mahasiswaOutput - 1); i++) {
                System.out.println(nim.dequeue().data);
                System.out.println(nama.dequeue().data);
                System.out.println(alamat.dequeue().data);
                System.out.println();
            }

            for (int i = 1; i < mahasiswaOutput; i++) {
                System.out.println(nimTemp.dequeue().data);
                System.out.println(namaTemp.dequeue().data);
                System.out.println(alamatTemp.dequeue().data);
                System.out.println();
            }
        }
    }
}
