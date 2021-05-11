package com.dimas.modul4.praktikum;
import java.util.Scanner;
public class Linked implements List {
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
        }
        else{
            input.next = head;
            head = input;
        }
    }

    @Override
    public void addLast(Node input) {
        if(isEmpty()){
            head = input;
            tail = input;
        }
        else{
            tail.next = input;
            tail = input;
        }
    }

    @Override
    public void insertAfter(int key, Node input) {
        Node temp = head;
        boolean found = false;
        do{
            if(temp.data == key){
                input.next = temp.next;
                temp.next = input;
                found = true;
                System.out.println("Memasukkan data "+input.data+"setelah data "+key+" sukses!");
                break;
            }
            temp = temp.next;
        }
        while(temp != null);
        if(!found){
            System.out.println("Data "+key+" tidak ditemukan dalam Node");
        }
    }

    @Override
    public void insertBefore(int key, Node input) {
        try{
            Node temp = head;
            while(temp != null){
                if((temp.data == key) && (temp == head)){
                    this.addFirst(input);
                    System.out.println("Memasukkan data "+input.data+"sebelum data "+key+" sukses!");
                    break;
                }
                else if (temp.next.data == key){
                    input.next = temp.next;
                    temp.next = input;
                    System.out.println("Memasukkan data "+input.data+"sebelum data "+key+" sukses!");
                    break;
                }
                temp = temp.next;
            }}
        catch(Exception e){
            System.out.println("Data "+key+" tidak ditemukan dalam Node");
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
            else if (i == index-1){
                input.next = temp.next;
                temp.next = input;
                found = true;
                System.out.println("Data "+input.data+" berhasil dimasukkan pada indeks "+index);
                break;
            }else{
                temp = temp.next;
                i++;
            }
        }
        if(!found){
            System.out.println("Indeks "+index+"out of range indeks Node");
        }
    }

    @Override
    public void replace(int data1, int data2) {
        Node temp = head;
        boolean found = false;
        while(temp != null){
            if(temp.data == data1){
                temp.data = data2;
                found = true;
                System.out.println("Data "+data1+" berhasil diganti dengan data "+data2);
                break;
            }
            else temp = temp.next;
        }
        if(!found){
            System.out.println("Data"+data1+"tidak ditemukan dalam Node ");
        }

    }

    @Override
    public void remove(int data) {
        try{
            Node temp = head;
            while (temp != null){
                if(temp.next.data == data){
                    temp.next = temp.next.next;
                    System.out.println("Data "+data+" berhasil dihapus !");
                    break;
                }
                else if((temp.data == data) && (temp == head)){
                    this.removeFirst();
                    System.out.println("Data "+data+" berhasil dihapus !");
                    break;
                }
                temp = temp.next;
            }}
        catch(Exception e){
            System.out.println("Data "+data+" tidak ditemukan dalam Node !");
        }
    }

    @Override
    public void removeAt(int index) {
        if (head == null) {
            return;
        }
        Node temp = head;

        if (index == 0){
            head = temp.next;
            return;
        }

        for (int i = 0; temp != null && i < index - 1; i++){
            temp = temp.next;
        }
        if (temp == null || temp.next == null){
            return;
        }

        Node next = temp.next.next;
        temp.next = next;
        }
    

    @Override
    public void removeFirst() {
        Node temp = head;
        if(!isEmpty())
        {
            if(head == tail) {
                head = tail = null;
            }
            else {
                head = temp.next;
                temp.next = null;
                temp = null;
            }
        }
        else System.out.println("Data Kosong!");
    }

    @Override
    public void removeLast() {
        Node temp = head;
        if(!isEmpty())
        {
            if(tail == head) {
                head = tail = null;
            }
            else {
                while(temp.next !=tail) {
                    temp = temp.next;
                }
                temp.next = null;
                tail = temp;
                temp = null;
            }
        }
        else System.out.println("Data Kosong!");
    }

    @Override
    public void clear() {
        if (isEmpty()){
            System.out.println("Data sudah kosong!");
        } else {
            head = null;
            tail = null;
            System.out.println("Data berhasil dihapus semua! ");
        }
    }

    @Override
    public void find(int data) {
        int i = 0;
        boolean found = false;
        Node temp = head;
        while(temp != null)
        {
            if(temp.data == data)
            {
                found = true;
                System.out.println(data+" ditemukan pada indeks ke-"+i);
            }i++; temp = temp.next;
        }
        if(!found){
            System.out.println("Data tidak ditemukan!");
        }
    }

    @Override
    public void printNode() {
        Node temp;
        temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    @Override
    public int length() {
        Node temp = head;
        int i=0;
        if(isEmpty()){
            System.out.println("Data kosong !");
        }
        else
            while(temp != null)
            {
                temp = temp.next;
                i++;
            }
        System.out.println("Panjang data : "+i);
        return i;
    }
    
public static void main(String[] args) {
    int pilih, jumlah;
    Scanner n = new Scanner(System.in);
    Linked list = new Linked();
    boolean found = false;
    

    System.out.println("System.out.println(\"=========== MENU ===========\");"
            + "\n1.addFirst"
            + "\n2.addLast"
            + "\n3.insertAfter"
            + "\n4.insertBefore"
            + "\n5.insert"
            + "\n6.replace"
            + "\n7.remove"
            + "\n8.removeFirst"
            + "\n9.removeLast"
            + "\n10.find"
            + "\n11.printNode"
            + "\n12.length"
            + "\n13.removeAt"
            + "\n14.clear"
            + "\n15.keluar");

 
 
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
                    Node objek = new Node();
                    System.out.print("> Masukkan data ke "+(i+1)+" : ");
                    int input = n.nextInt();
                    objek.data = input;
                    list.addFirst(objek);
                }
                System.out.println();
                System.out.println("============================");
                System.out.print("> Data : ");
                list.printNode();
                System.out.println("============================");
                System.out.println();
                break;
            case 2:
                System.out.println("> 2. Method addLast");
                System.out.print("> Masukan Banyak Data : ");
                jumlah=n.nextInt();
                for (int i = 0; i < jumlah; i++) {
                    Node objek = new Node();
                    System.out.print("> Masukkan data ke "+(i+1)+" : ");
                    int input = n.nextInt();
                    objek.data = input;
                    list.addLast(objek);
                }
                System.out.println();
                System.out.println("============================");
                System.out.print("> Data : ");
                list.printNode();
                System.out.println("============================");
                System.out.println();
                break;
            case 3:
                System.out.println("> 3. Method insertAfter" );
                for (int i = 0; i < 1; i++) {
                    Node objek = new Node();
                    System.out.print("> Masukkan key : ");
                    int key = n.nextInt();
                    System.out.print("> Masukkan data : ");
                    int input = n.nextInt();
                    objek.data = input;
                    list.insertAfter(key, objek);
                }
                System.out.println();
                System.out.println("============================");
                System.out.print("> Data : ");
                list.printNode();
                System.out.println("============================");
                System.out.println();
                break;
            case 4:
                System.out.println("> 4. Method insertBefore");
                for (int i = 0; i < 1; i++) {
                    Node objek = new Node();
                    System.out.print("> Masukkan key : ");
                    int key = n.nextInt();
                    System.out.print("> Masukkan data : ");
                    int input = n.nextInt();
                    objek.data = input;
                    list.insertBefore(key, objek);
                }
                System.out.println();
                System.out.println("============================");
                System.out.print("> Data : ");
                list.printNode();
                System.out.println("============================");
                System.out.println();
                break;
            case 5:
                System.out.println("> 5. Method insert");
                for (int i = 0; i < 1; i++) {
                    Node objek = new Node();
                    System.out.print("> Masukkan index : ");
                    int index = n.nextInt();
                    System.out.print("> Masukkan data : ");
                    int input = n.nextInt();
                    objek.data = input;
                    list.insert(index, objek);
                }
                System.out.println();
                System.out.println("============================");
                System.out.print("> Data : ");
                list.printNode();
                System.out.println("============================");
                System.out.println();
                break;
            case 6:
                System.out.println("> 6. Method replace");
                System.out.print("> Input data yang ingin diganti : ");
                int data1 = n.nextInt();
                System.out.print("> Input data baru : ");
                int data2 = n.nextInt();
                list.replace(data1, data2);
                System.out.println();
                System.out.println("============================");
                System.out.print("> Data : ");
                list.printNode();
                System.out.println("============================");
                System.out.println();
                break;
            case 7:
                System.out.println("> 7. Method remove");
                System.out.print("> Input data yang akan dihapus : ");
                int hapus = n.nextInt();
                list.remove(hapus);
                System.out.println();
                System.out.println("============================");
                System.out.print("> Data : ");
                list.printNode();
                System.out.println("============================");
                System.out.println();
                break;
            case 8:
                System.out.println("> 8. Method removeFirst");
                System.out.println("> Remove data awal");
                list.removeFirst();
                System.out.println();
                System.out.println("============================");
                System.out.print("> Data : ");
                list.printNode();
                System.out.println("============================");
                System.out.println();
                break;
            case 9:
                System.out.println("> 9. Method removeLast");
                System.out.println("> Remove data akhir");
                list.removeLast();
                System.out.println();
                System.out.println("============================");
                System.out.print("> Data : ");
                list.printNode();
                System.out.println("============================");
                System.out.println();
                break;
            case 10:
                System.out.println("> 10. Method find");
                System.out.println("> Mencari data");
                System.out.print("> Masukkan data yang dicari : ");
                int cari = n.nextInt();
                list.find(cari);
                break;
            case 11:
                System.out.println("> 11. Method printNode");
                System.out.println();
                System.out.println("============================");
                System.out.print("> Data : ");
                list.printNode();
                System.out.println("============================");
                System.out.println();
                break;
            case 12:
                System.out.println("> 12. Method length");
                System.out.println();
                System.out.println("============================");
                System.out.print("> Data : ");
                list.printNode();
                System.out.println("============================");
                System.out.println();
                list.length();
                break;
            case 13:
                System.out.println("> 13. Method removeAt");
                System.out.print("> Data pada indeks node ke : ");
                int hapusAt = n.nextInt();
                list.removeAt(hapusAt);
                System.out.println();
                System.out.println("============================");
                System.out.print("> Data : ");
                list.printNode();
                System.out.println("============================");
                System.out.println();
                break;
            case 14:
                System.out.println("> 14. Method clear");
                list.clear();
                System.out.println();
                System.out.println("============================");
                System.out.print("> Data : ");
                list.printNode();
                System.out.println("============================");
                System.out.println();
                break;
            case 15:
                found = true;
                System.out.println("> 15. Method keluar");
                System.out.println("> Anda memilih keluar");
                break;
            default:
                System.out.println("> "+ pilih + " tidak ada dalam pilihan.\n");
                break;
        }
        } while(found==false); 
    }
}
