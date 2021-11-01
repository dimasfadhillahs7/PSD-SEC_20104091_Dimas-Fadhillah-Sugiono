package com.dimas.modul4.tugas;
public class Tugas {
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
    public void clear() {
        if (isEmpty()){
            System.out.println("Data sudah kosong!");
        } else {
            head = null;
            tail = null;
            System.out.println("Data berhasil dihapus semua! ");
        }
    }
}
