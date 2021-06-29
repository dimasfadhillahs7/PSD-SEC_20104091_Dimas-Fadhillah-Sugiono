package com.dimas.modul7.praktikum;
public class method {
    Node depan;
    Node belakang;
        
   
    public boolean isEmpty() {
        return (depan == null);
    }

   
    public void enqueue(Node input) {

        if (isEmpty()) {
            depan = input;
            belakang = input;
        } else {
            belakang.next = input;
            belakang = belakang.next;
        }
    }

   
    public void show() {

        if (!isEmpty()) {
            Node temp = depan;
            while (temp != null) {
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        } else {
            System.out.println("Queue kosong!");
        }
    }

   
    public Node dequeue() {
        if (isEmpty()) {
            return null;
        } 
        else {
            Node temp = depan;
            if (depan == belakang) {
                depan = belakang = null;
                return temp;
            } 
            else {
                depan = depan.next;
                return temp;
            }
        }
    }

   
    public void makeEmpty() {

        depan = null;
        belakang = null;
        System.out.println("Data queue berhasil dikosongkan!");
    }
}
    

