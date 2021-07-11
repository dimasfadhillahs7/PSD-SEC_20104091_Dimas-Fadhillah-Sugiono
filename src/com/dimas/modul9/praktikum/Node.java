package com.dimas.modul9.praktikum;
public class Node {
    Node right, left;
    public int data;

    public Node(int data){
        this.data=data;
        left=right=null;
    }
}