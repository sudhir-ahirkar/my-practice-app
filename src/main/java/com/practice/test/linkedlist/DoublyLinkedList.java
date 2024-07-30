package com.practice.test.linkedlist;

import java.util.NoSuchElementException;

public class DoublyLinkedList {
   private Node head;
   private Node tail;
   private int length;

   public DoublyLinkedList(){
     this.head=null;
     this.tail=null;
     this.length=0;
   }

   public boolean isEmpty(){
       return length==0; // head==null
   }
   public int getLength(){
       return length;
   }

   public void insertAtBeginning(int data) {
      Node newNode = new Node(data);
      if(isEmpty()) {
          tail=newNode;
      } else {
          head.prev=newNode;
          newNode.next=head;
      }
      head=newNode;
      length++;
   }

    public void insertAtEnding(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head=newNode;
        }else{
            tail.next=newNode;
            newNode.prev=tail;
        }
        tail=newNode;
        length++;
    }

    public Node deleteFirstNode(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        Node temp = head;
        if(tail==head){
            tail=null;
        }else{
            head.next.prev=null;
        }
        head=head.next;
        temp.next=null;
        length--;
        return temp;
    }

    public Node deleteLastNode(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        Node temp = tail;
        if(tail==head){
            head=null;
        }else{
            tail.prev.next=null;
        }
        tail=tail.prev;
        temp.prev=null;
        length--;
        return temp;
    }

    public void deleteNode(Node node){
       Node prevNode=node.prev;
       Node nextNode=node.next;
       prevNode.next=nextNode;
       nextNode.prev=prevNode;
    }


   private void displayForwardDir(){
       if(head==null){
           return;
       }
       Node temp =  head;
       while (temp!=null) {
           System.out.print(temp.data+"->");
           temp=temp.next;
       }
       System.out.println("null");
   }

    private void displayPreviousDir(){
        if(head==null){
            return;
        }
        Node temp =  tail;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.prev;
        }
        System.out.println("null");
    }

    private class Node {
        private int data;
        private Node prev;
        private Node next;
        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dls = new DoublyLinkedList();
//        dls.insertAtBeginning(1);
//        dls.insertAtBeginning(4);
        dls.insertAtEnding(1);
        dls.insertAtEnding(4);
        dls.insertAtEnding(11);
        dls.insertAtEnding(50);
        dls.insertAtEnding(55);
        dls.displayForwardDir();

//        dls.deleteFirstNode();
//        dls.deleteLastNode();
//        dls.deleteLastNode();
//        dls.deleteLastNode();

        Node dNode = dls.new Node(11);
//        dls.deleteNode(dNode);
//        dls.displayForwardDir();
        dls.insertAtEnding(105);
        dls.displayForwardDir();
//        dls.displayPreviousDir();
    }
}
