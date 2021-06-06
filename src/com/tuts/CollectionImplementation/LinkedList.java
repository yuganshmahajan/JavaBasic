package com.tuts.CollectionImplementation;

public class LinkedList {

    class Node{
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
            next = null;
        }
    }

    Node head;
    Node tail;
    int size;
    public LinkedList(){
        head = null;
        tail = null;
        size = 0;
    }

    public int getSize(){
        return size;
    }
    public void insertLast(int val){
        Node n = new Node(val);
        if(head == null){
            head = tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
        size++;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + "-->");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertLast(1);
        ll.insertLast(2);
        ll.insertLast(3);
        ll.display();
    }

}
