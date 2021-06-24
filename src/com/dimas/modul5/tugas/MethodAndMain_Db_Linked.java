package com.dimas.modul5.tugas;
import com.dimas.modul5.praktikum.Node;
import com.dimas.modul5.praktikum.Db_LinkedList;
import java.util.Scanner;

public class MethodAndMain_Db_Linked implements Db_LinkedList {
    private Node head;
    private Node tail;
    

    @Override
    public boolean isEmpty() {
        return head==null;
    }

    @Override
    public void addFirst(Node input) {
        if(isEmpty()){
            head = input;
            tail = input;
        }else{
            head.kiri = input;
            input.kanan = head;
            head = input;
        }
    }

    @Override
    public void addLast(Node input) {
        if(isEmpty()){
            head = input;
            tail = input;
        }else{
            tail.kanan = input;
            input.kiri = tail;
            tail = input;
        }
    }

    @Override
    public void insertAfter(Node key, Node input) {
        boolean found = false;
        Node temp = head;

        while (temp != null) {
            if (key.data == temp.data) {
                input.kanan = temp.kanan;
                temp.kanan = input;
                temp.kanan.kiri = input;
                temp.kanan = null;
                input.kiri = temp;
                temp.kanan = input;
                found = true;
                System.out.println("Data " + input.data + " berhasil dimasukan di indeks " + key.data);
                break;
            }
            temp = temp.kanan;
        }

        if (!found) {
            System.out.println("Indeks" + key.data + " tidak ditemukan dalam Node");
        }
    }

    @Override
    public void insertBefore(Node key, Node input) {
        boolean found = false;
        Node temp = head;

        while (temp != null) {
            if ((key.data == temp.data) && (temp == head)) {
                this.addFirst(input);
                System.out.println("Memasukan data " + input.data + " Sebelum data " + key.data + " sukses!!");
                break;
            } else if (temp.kanan.data == key.data) {
                input.kanan = temp.kanan;
                temp.kanan = input;
                temp.kanan.kiri = input;
                temp.kanan = null;
                input.kiri = temp;
                temp.kanan = input;
                found = true;
                System.out.println("Data " + input.data + " berhasil dimasukan di indeks " + key.data);
                break;
            }
            temp = temp.kanan;
        }

        if (!found) {
            System.out.println("Indeks" + key.data + " tidak ditemukan dalam Node");
        }
    }

    @Override
    public void insert(int index, Node input) {
        Node temp = head;
        boolean found = false;
        int i = 0;
        while (temp != null){
            if(index == 0){
                this.addFirst(input);
                found = true;
                System.out.println("Data "+input.data+" berhasil dimasukkan pada indeks "+index);
                break;
            }
            else if ((i == index-1) && (temp != tail)){
                input.kanan = temp.kanan;
                temp.kanan.kiri = input;
                input.kiri = temp;
                temp.kanan = input;
                found = true;
                System.out.println("Data "+input.data+" berhasil dimasukkan pada indeks "+index);
                break;
            }
            else if((i == index-1) && (temp == tail)){
                this.addLast(input);
                found = true;
                System.out.println("Data "+input.data+" berhasil dimasukkan pada indeks "+index);
                break;
            }
            temp = temp.kanan;
            i++;
        }
        if(!found){
        System.out.println("Indeks "+index+" out of range indeks Node!");}
    }

    @Override
    public void replace(Node data1, Node data2) {
        Node temp = head;
        boolean found = false;
        while(temp != null){
            if(temp.data == data1.data){
                temp.data = data2.data;
                found = true;
                System.out.println("Data "+data1.data+" berhasil diganti dengan data "+data2.data);
                break;
            }
            temp = temp.kanan;
        }
        if(!found){
            System.out.println("Data "+data1.data+" tidak ditemukan dalam Node !");
        }
    }

    @Override
    public void remove(Node data) {
        try{
            Node temp = head;
            while (temp != null){
                if((temp.data == data.data) && (temp == tail)){
                    this.removeLast();
                    System.out.println("Data "+data.data+" berhasil dihapus!");
                    break;
                }
                else if((temp.data == data.data) && (temp == head)){
                    this.removeFirst();
                    System.out.println("Data "+data.data+" berhasil dihapus!");
                    break;
                }
                else if((temp.kanan.data == data.data) && (temp.kanan !=
                    tail)){
                    temp.kanan = temp.kanan.kanan;
                    temp.kanan.kiri = temp;
                    System.out.println("Data "+data.data+" berhasil dihapus!");
                    break;
                }
                temp = temp.kanan;
            }
        }
        catch(Exception e){
            System.out.println("Data "+data.data+" tidak ditemukan dalam Node!");
        }
    }

    @Override
    public void removeAt(int index) {
        Node temp = head;
        try{
            int i = 0;
            while(temp != null) {
                if(index == 0) {
                    this.removeFirst();
                    System.out.println("Data pada indeks "+index+" berhasil dihapus !");
                    break;
                }
                else if((i == index - 1) && (temp.kanan != tail)) {
                    temp.kanan = temp.kanan.kanan;
                    temp.kanan.kiri = temp;
                    System.out.println("Data pada indeks "+index+" berhasil dihapus !");
                    break;
                }
                else if((i == index - 1) && (temp.kanan == tail)){
                    this.removeLast();
                    System.out.println("Data pada indeks "+index+" berhasil dihapus !");
                    break;
                }
                temp = temp.kanan;
                i++;
            }
        }
        catch(Exception e){
            System.out.println("Indeks "+index+" out of range indeks Node!");
        }
    }

    @Override
    public void removeFirst() {
        Node temp = head;
        if(isEmpty()){
            System.out.println("Data Kosong !");
        }else {
            if(head == tail){
                head = tail = null;
            }
            else{
                head = temp.kanan;
                head.kiri = null;
                temp.kanan = null;
                temp = null;
            }
        }
    }

    @Override
    public void removeLast() {
        Node temp = tail;
        if(isEmpty()){
            System.out.println("Data Kosong!");
        }else {
            if(tail == head){
                head = tail = null;
            }
            else{
                tail = tail.kiri;
                tail.kanan = null;
                temp.kiri = null;
                temp=null;
            }
        }
    }

    @Override
    public void clear() {
        if(isEmpty()){
            System.out.println("Data masih kosong !");
        }
        else{
            head = null;
            tail = null;
            System.out.println("Data berhasil dihapus semua !");
        }
    }

    @Override
    public void show() {
        Node temp = head;
        if(isEmpty()){
            System.out.println("Data Kosong !");
        }else {
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.kanan;
            }
        System.out.println();
        }
    }

    @Override
    public void find(Node data) {
        int i = 0;
        boolean found = false;
        Node temp = head;
        while(temp != null) {
            if(temp.data == data.data) {
                found = true;
                break;
            }
            i++; temp = temp.kanan;
        }
        if(found) {
            System.out.println(data.data+" ditemukan pada indeks ke-"+i);
        }
        else System.out.println("Data tidak ditemukan!");

    }

    @Override
    public int length() {
        Node temp = head;
        int i=0;
        if(isEmpty()){
            System.out.println("Data kosong !");
        }
        else
        while(temp != null){
            temp = temp.kanan;
            i++;
        }
        System.out.println("Panjang data : "+i);
        return i;
    }

    @Override
    public boolean checking(Node input) {
        Node temp = head;
        while(temp != null){
            if(temp.data == input.data){
                System.out.println("Data ada dalam DoubleLinkedList\n");
                return true;
            }
            temp = temp.kanan;
        }
        System.out.println("Data tidak ada dalam DoubleLinkedList\n");
        return false;
    }

    @Override
    public void showReversed() {
        Node temp = tail;
        if(isEmpty()){
            System.out.println("Data Kosong !");
        }
        else {
            while(temp != null) {
                System.out.print(temp.data+" ");
                temp = temp.kiri;
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int pilih, jumlah;
    Scanner n = new Scanner(System.in);
    MethodAndMain_Db_Linked list = new MethodAndMain_Db_Linked();
    boolean found = false;

    System.out.println("=========== MENU ===========\");"
            + "\n1.addFirst"
            + "\n2.addLast"
            + "\n3.insertAfter"
            + "\n4.insertBefore"
            + "\n5.insert"
            + "\n6.replace"
            + "\n7.remove"
            + "\n8.removeAt"
            + "\n9.removeFirst"
            + "\n10.removeLast"
            + "\n11.clear"
            + "\n12.show"
            + "\n13.find"
            + "\n14.length"
            + "\n15.checking"
            + "\n16.showReversed"
            + "\n17.Keluar");

        System.out.println("============================");
        do{
        System.out.print("> Pilih Menu : ");
        pilih = n.nextInt();
        System.out.println("============================");
        switch (pilih) {
            case 1:
                System.out.println("> 1. Method addFirst");
                System.out.print("> Masukan Banyak Data : ");
                jumlah=n.nextInt();
                for (int i = 0; i <jumlah; i++) {
                    
                    System.out.print("> Masukkan data ke "+(i+1)+" : ");
                    int input = n.nextInt();
                    Node objek = new Node(input);
                    list.addFirst(objek);
                }
                System.out.println();
                System.out.println("============================");
                System.out.print("> Data : ");
                list.show();
                System.out.println("============================");
                System.out.println();
                break;
            case 2:
                System.out.println("> 2. Method addLast");
                System.out.print("> Masukan Banyak Data : ");
                jumlah=n.nextInt();
                for (int i = 0; i < jumlah; i++) {
                    System.out.print("> Masukkan data ke "+(i+1)+" : ");
                    int input = n.nextInt();
                    Node objek = new Node(input);
                    list.addLast(objek);
                }
                System.out.println();
                System.out.println("============================");
                System.out.print("> Data : ");
                list.show();
                System.out.println("============================");
                System.out.println();
                break;
            case 3: 
                System.out.println("> 3. Method insertAfter" );
                for (int i = 0; i < 1; i++) {
                    System.out.print("> Masukkan key : ");
                    int key = n.nextInt();
                    System.out.print("> Masukkan data : ");
                    int input = n.nextInt();
                    Node objek1 = new Node(key);
                    Node objek2 = new Node(input);
                    list.insertAfter(objek1, objek2);
                }
                System.out.println();
                System.out.println("============================");
                System.out.print("> Data : ");
                list.show();
                System.out.println("============================");
                System.out.println();
                break;
            case 4:
                System.out.println("> 4. Method Insert Before" );
                for (int i = 0; i < 1; i++) {
                    System.out.print("> Masukkan key : ");
                    int key = n.nextInt();
                    System.out.print("> Masukkan data : ");
                    int input = n.nextInt();
                    Node objek1 = new Node(key);
                    Node objek2 = new Node(input);
                    list.insertBefore(objek1, objek2);
                }
                System.out.println();
                System.out.println("============================");
                System.out.print("> Data : ");
                list.show();
                System.out.println("============================");
                System.out.println();
                break;
            case 5:
                System.out.println("> 5. Method insert");
                for (int i = 0; i < 1; i++) {
                    
                    System.out.print("> Masukkan index : ");
                    int index = n.nextInt();
                    System.out.print("> Masukkan data : ");
                    int input = n.nextInt();
                    Node objek = new Node (input);
                    list.insert(index, objek);
                }
                System.out.println();
                System.out.println("============================");
                System.out.print("> Data : ");
                list.show();
                System.out.println("============================");
                System.out.println();
                break;
            case 6:
                System.out.println("> 6. Method replace");
                System.out.print("> Input data yang ingin diganti : ");
                int x = n.nextInt();
                System.out.print("> Input data baru : ");
                int y = n.nextInt();
                Node data1 = new Node(x);
                Node data2 = new Node(y);
                list.replace(data1, data2);
                System.out.println();
                System.out.println("============================");
                System.out.print("> Data : ");
                list.show();
                System.out.println("============================");
                System.out.println();
                break;
            case 7:
                System.out.println("> 7. Method remove");
                System.out.print("> Input data yang akan dihapus : ");
                int hapus = n.nextInt();
                Node data = new Node(hapus);
                list.remove(data);
                System.out.println();
                System.out.println("============================");
                System.out.print("> Data : ");
                list.show();
                System.out.println("============================");
                System.out.println();
                break;
            case 8:
                System.out.println("> 8. Method removeAt");
                System.out.print("> Data pada indeks node ke : ");
                int hapusAt = n.nextInt();
                list.removeAt(hapusAt);
                System.out.println();
                System.out.println("============================");
                System.out.print("> Data : ");
                list.show();
                System.out.println("============================");
                System.out.println();
                break;
            case 9:
                System.out.println("> 9. Method removeFirst");
                System.out.println("> Remove data awal");
                list.removeFirst();
                System.out.println();
                System.out.println("============================");
                System.out.print("> Data : ");
                list.show();
                System.out.println("============================");
                System.out.println();
                break;
            case 10:
                System.out.println("> 10. Method removeLast");
                System.out.println("> Remove data akhir");
                list.removeLast();
                System.out.println();
                System.out.println("============================");
                System.out.print("> Data : ");
                list.show();
                System.out.println("============================");
                System.out.println();
            case 11:
                System.out.println("> 11. Method clear");
                list.clear();
                System.out.println();
                System.out.println("============================");
                System.out.print("> Data : ");
                list.show();
                System.out.println("============================");
                System.out.println();
                break;
            case 12:
                System.out.println("> 12. Method show");
                System.out.println();
                System.out.println("============================");
                System.out.print("> Data : ");
                list.show();
                System.out.println("============================");
                System.out.println();
                break;
            case 13:
                System.out.println("> 13. Method find");
                System.out.println("> Mencari data");
                System.out.print("> Masukkan data yang dicari : ");
                int f = n.nextInt();
                Node cari = new Node(f);
                list.find(cari);
                break;
            case 14:
                System.out.println("> 14. Method length");
                System.out.println();
                System.out.println("============================");
                System.out.print("> Data : ");
                list.show();
                System.out.println("============================");
                System.out.println();
                list.length();
                break;
            case 15:
                System.out.println("> 15. Method Checking");
                System.out.print("Masukkan data: ");
                int c = n.nextInt();
                Node Data = new Node(c);
                list.checking(Data);
                break;
            case 16:
                System.out.println("> 16. Method showReversed");
                list.showReversed();
                break;
            case 17:
                found = true;
                System.out.println("> 15. Method keluar");
                System.out.println("> Anda memilih keluar");
                break;
            default:
                System.out.println("> "+ pilih + " tidak ada dalam pilihan.\n");
                break;
            }   
    
        }while(found==false);
    }
}
