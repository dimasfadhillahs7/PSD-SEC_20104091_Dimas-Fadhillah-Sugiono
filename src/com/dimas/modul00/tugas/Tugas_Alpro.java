package com.dimas.modul00.tugas;
import java.util.Date;
import java.util.Scanner;
public class Tugas_Alpro {
    static Scanner input = new Scanner(System.in);
    static Scanner inputAngka = new Scanner(System.in);
    static String username;
    static String password;
    //inisiasi tanggal
    static Date date = new Date();
    static String user1 = "admin", pass1 = "admin";
    static String user2 = "adam", pass2 = "adam";

    public static void main(String[] args) {
        login();
        menu();

    }

    private static void login() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int blokakun = 1;

        do {
            System.out.println("\t* * Program Kasir * *\t\t");
            System.out.print("\nMasukan username : ");
            username = input.next();

            System.out.print("Masukan password : ");
            password = input.next();

            if (blokakun < 3) {
                if (username.compareTo(user1) == 0 && password.compareTo(pass1) == 0) {
                    System.out.println("Login Berhasil!!");
                    break;
                } else if (username.compareTo(user2) == 0 && password.compareTo(pass2) == 0) {
                    System.out.println("Login Berhasil!!");
                    break;
                } else {
                    System.out.println("\nmaaf username dan password anda salah");
                    System.out.println(" ");
                    blokakun++;
                }
            } else {
                System.out.println("\n Akun Anda Kami Tangguhkan!");
                System.exit(0);
                break;
                

            }

        } while (true);
    }

    private static void menu() {
        boolean salah = false;
        char exit;
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        do {
            if (username.compareTo(user1) == 0 && password.compareTo(pass1) == 0) {
                System.out.println("\nPT.MENCARI CINTA SEJATI");
                System.out.println("1600 Amphitheatre Pkwy, Mountain View, CA 94043, Amerika Serikat");
                System.out.println("Telp : 028 2111182");
                System.out.print("Fax : 022 2341182\t");
                //write akun yang telah diformat
                System.out.printf("%1$s %2$tB %2$td, %2$tY",
                        "Tanggal :", date);
                System.out.println("");
                System.out.println("Kasir :" + user1);

                System.out.println("---------------------");
                System.out.println("1.Profil Akun");
                System.out.println("2.Registrasi");
                System.out.println("3.Keluar");
                System.out.println("0.LogOut");
                System.out.println("---------------------");
                System.out.print("Masukan Menu : ");
                int menu = inputAngka.nextInt();
                switch (menu) {
                    case 1:
                        System.out.println("\n\t* * Informasi Akun * *\t\t");
                        System.out.println("\n Akun Anda");
                        System.out.println("Username :" + user1);
                        System.out.println("Password :" + pass1);
                        System.out.println("\n Akun Karyawan");
                        System.out.println("Username :" + user2);
                        System.out.println("Password :" + pass2);
                        do{
                        System.out.print("Klik 0 untuk kembali :");
                        menu = inputAngka.nextInt();
                            if (menu==0){
                                    menu();
                            }else {
                                System.out.println("\n>> Input anda salah <<");
                                salah = false;
                            }
                        }while(salah==false);
                        break;
                    case 2:
                        
                        System.out.println("\n\t* * Registrasi Akun * *\t\t");
                        System.out.println("Registrasi akun dinegara anda belum tersedia");
                        do {
                        System.out.print("Klik 0 untuk kembali :");
                        menu = inputAngka.nextInt();
                        if (menu==0){
                                    menu();
                            }else {
                                System.out.println("\n>> Input anda salah <<");
                                salah = false;
                            }
                        }while(salah==false);
                        break;
                    case 3:
                        System.out.println("\n\t* * Keluar Aplikasi* *\t\t");
                        System.out.print("Apakah anda ingin menutup aplikasi ini? Klik Y/N : ");
                        exit = input.next().toUpperCase().charAt(0);
                        switch (exit) {
                            case 'Y' :
                                //System.exit(0), dengan hanya mengeksekusi sedikit kode tersebut, program akan langsung berhenti dan keluar. 
                                System.exit(0);
                                break;
                            case 'N' :
                                menu();
                                break;
                            default :
                                System.out.println("Tidak Tersedia, Silahkan Input Kembali");
                                menu();
                                break;
                        }
                        break;
                    case 0:
                        System.out.println("Akun anda akan dikeluarkan secara otomatis, silahkan login kembali! \n");
                        login();
                        break;
                    default:
                        System.out.println("Tidak ada dalam pilihan");
                        salah = false;
                        break;
                }
            }

            if (username.compareTo(user2) == 0 && password.compareTo(pass2) == 0) {
                System.out.println("\nPT.MENCARI CINTA SEJATI");
                System.out.println("1600 Amphitheatre Pkwy, Mountain View, CA 94043, Amerika Serikat");
                System.out.println("Telp : 028 2111182");
                System.out.print("Fax : 022 2341182\t");
                //write waktu yang telah diformat
                System.out.printf("%1$s %2$tB %2$td, %2$tY",
                        "Tanggal :", date);
                System.out.println("");
                System.out.println("Kasir :" + user2);

                System.out.println("---------------------");
                System.out.println("1.Transaksi");
                System.out.println("2.Keluar");
                System.out.println("0.LogOut");
                System.out.println("---------------------");
                System.out.print("Masukan Menu : ");
                int menu = inputAngka.nextInt();
                switch (menu) {
                    case 1:
                        transaksi();
                        break;
                    case 2:
                        System.out.println("\n\t* * Keluar Aplikasi* *\t\t");
                        System.out.print("Apakah anda ingin menutup aplikasi ini? Klik Y/N :");
                        exit = input.next().toUpperCase().charAt(0);
                        switch (exit) {
                            case 'Y' :
                                //System.exit(0), dengan hanya mengeksekusi sedikit kode tersebut, program akan langsung berhenti dan keluar. 
                                System.exit(0);
                                break;
                            case 'N' :
                                menu();
                                break;
                            default :
                                System.out.println("Tidak Tersedia, Silahkan Input Kembali");
                                menu();
                                break;
                        }
                        break;
                    case 0:
                        System.out.println("Akun anda akan dikeluarkan secara otomatis, silahkan login kembali! \n");
                        login();
                        break;
                    default:
                        System.out.println("Tidak ada dalam pilihan");
                        salah = false;
                        break;
                }
            }
        } while (salah == false);
    }

    public static void transaksi() {
        boolean x;
        double bayar, kembali, total = 0;
        int i = 0;
        System.out.println("Masukkan harga barang, note: inputkan 0 untuk menjumlahkan");

        double[] harga = new double[100];
        do {
            System.out.print("Masukkan Harga Barang\t: ");
            harga[i] = inputAngka.nextDouble();
            total = total + harga[i];
            i++;
        } while (harga[i - 1] != 0);

        System.out.println("---------------------------------");
        System.out.println("Total\t\t\t: " + total);
        if (total >= 500000) {
            total = total - (total * 0.02);
            System.out.println("Diskon\t\t\t: 2%");
            System.out.println("Total Setelah diskon\t: " + total);
        }

        System.out.print("Bayar\t\t\t: ");
        bayar = inputAngka.nextDouble();

        kembali = bayar - total;
        System.out.println("Kembali\t\t\t: " + kembali);
        System.out.println(" ");

        do {
            System.out.print("Ingin cetak Struk?? [Y | N] ");
            char ctk = input.next().toUpperCase().charAt(0);
            switch (ctk) {
                case 'Y':
                    print(harga, bayar, kembali);
                    x = true;
                    break;
                case 'N':
                    x = true;
                    break;
                default:
                    System.out.println("Tidak ada dalam pilihan");
                    x = false;
                    break;
            }
        } while (x == false);
        do {
            System.out.print("\nIngin mengulang program?? [Y | N] ");
            char ulang = input.next().toUpperCase().charAt(0);
            switch (ulang) {
                case 'Y':
                    menu();
                    x = true;
                    break;
                case 'N':
                    System.out.println("Program Selesai. Terima Kasih :)");
                    x = true;
                    System.exit(0);
                    break;
                default:
                    System.out.println("Tidak ada dalam pilihan");
                    x = false;
                    break;
            }

        } while (x == false);

    }

    public static void print(double[] harga,
            double bayar, double kembali) {

        System.out.println("\nPT.MENCARI CINTA SEJATI");
        System.out.println("1600 Amphitheatre Pkwy, Mountain View, CA 94043, Amerika Serikat");
        System.out.println("Telp : 028 2111182");
        System.out.print("Fax : 022 2341182\t");
        //write waktu yang telah diformat
        System.out.printf("%1$s %2$tB %2$td, %2$tY",
                "Tanggal :", date);
        System.out.println("");
        System.out.println("Kasir :" + user2);

        System.out.println("^ ======================================");
        int i;
        double total = 0;
        for (i = 0; i < 100; i++) {
            if (harga[i] == 0) {
                break;
            }
            System.out.println("^ Harga Barang " + (i + 1) + "\t" + harga[i]);
            total = total + harga[i];
        }
        System.out.println("^ --------------------------------------");
        System.out.println("^ Total\t\t\t: " + total);
        if (total >= 500000) {
            total = total - (total * 0.02);
            System.out.println("^ Diskon\t\t: 2%");
            System.out.println("^ Total Setelah diskon\t: " + total);
        }
        System.out.println("^ Bayar\t\t\t: " + bayar);
        System.out.println("^ Kembali\t\t: " + kembali);
    }

}