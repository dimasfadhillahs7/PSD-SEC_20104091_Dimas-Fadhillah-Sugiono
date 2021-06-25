package com.dimas.modul6.praktikum;
import java.util.Scanner;
public class MethodAndMain_Stack implements List {
    Node tos;
    
    
    @Override
    public boolean isEmpty() {
        return (tos==null);
    }

    @Override
    public void push(Node input) {
        if(isEmpty()){
            tos=input;
        }
        else {
            input.next=tos;
            tos=input;
        }
    }

    @Override
    public void pop() {
        if(!isEmpty()) {
            Node temp=tos;
            tos=tos.next;
            temp.next=null;
            System.out.println("Yang di POP : "+ temp.data.toString());
        }
        else
            System.out.println("Tidak bisa karena stack kosong!");
    }

    @Override
    public void show() {
        if(!isEmpty()) {
            Node temp=tos;
            while(temp!=null){
                System.out.print(temp.data.toString()+"\n");
                temp=temp.next;
            }
        }
        else
        System.out.println("Stack kosong !");
    }

    @Override
    public void top() {
        if(!isEmpty()) {
        Node temp = tos;
        System.out.println("TOP sekarang : " + temp.data);
        }
        else
            System.out.println("Tidak bisa karena stack kosong!");
    }

    @Override
    public void topAndPop() {
        this.top();
        this.pop();
    }

    @Override
    public void makeEmpty() {
        tos = null;
        System.out.println("Data berhasil dihapus semua !");
    }
    
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        MethodAndMain_Stack stack = new MethodAndMain_Stack();
        int pilih;
        boolean found = false;
        
            System.out.println("=========== MENU ===========\");"
            + "\n1. Push"
            + "\n2. Pop"
            + "\n3. Show"
            + "\n4. Top"
            + "\n5. Top and Pop"
            + "\n6. Make Empty"
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
                        int input = n.nextInt();
                        Node objek = new Node(input);
                        stack.push(objek);
                    }
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.show();
                    break;
                case 4:
                    stack.top();
                    break;
                case 5:
                    stack.topAndPop();
                    break;
                case 6:
                    stack.makeEmpty();
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
