package com.practice.test.linkedlist;

public class SinglyLinkedList {
    Node head;
    private class Node {
        private int data;
        private Node next;
        public Node(int data){
            this.data=data;
        }
    }

    private void insert(int data){
        // 2->23->45->null
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node current = head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }

    private void insertAtFirst(int data){
        Node newNode = new Node(data);
        newNode.next=head;
        head=newNode;
    }

    private void insertAtIndex(int index, int data){
        // 75->2->47->23->45->null
        // index = 2
        // 75->2->data->47->23->45->null
        Node newNode = new Node(data);
        Node current = head;
        for (int i = 0; i < index-1; i++) {
            current=current.next;
        }
        newNode.next=current.next;
        current.next=newNode;
    }
    private Node deleteAtIndex(int index) {
        // 75->2->47->23->45->null
        if(index==0){
            head=head.next;
        }
        Node current = head;
        Node temp = null;
        for (int i = 0; i < index-1; i++) {
            current=current.next;
        }
//       current: ..2->
//
        temp=current.next;  // 47-> .....
        current.next=temp.next;
        System.out.println("check deleted node content==>"+temp.data);
        print(temp);
        return temp;
    }


        private void insertAtLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node current = head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }

    private void print(){
        Node current = head;
        while (current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }

    private void print(Node node){
        Node current = node;
        while (current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }

    private int length(){
        int length=0;
        Node current = head;
        while (current!=null){
            current=current.next;
            length++;
        }
        System.out.println("LinkedList length is :"+length);
        return length;
    }

    private Node deleteFirstNodeAndReturn(){
//      75->2->47->23->45->null
        if(head==null){
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    private Node deleteLastNodeAndReturn(){
//      75->2->47->23->45->null
        if(head==null){
            return null;
        }
        Node current = head;
        Node previous = null;
        while (current.next!=null){
            previous = current;
            current=current.next;
        }
        // if below line is not there then o/p would be 2->23->45->null
//        previous.next=null; //just collected current in head before delete last node so that we can have updated head after delete

        // Understand below concept very carefully
//        print(previous); //23->45->null
        System.out.println("Check current element===>");
        print(current); // 45->null
        return current;
    }

    private Node reverseLinkedList(){
        // 2->23->102->35->null  -> 35->105->23->2->null
        Node current = head;
        Node prev = null;
        Node next = null;
        while (current!=null){
            next = current.next;
            System.out.println("Print next ==>");
            print(next);
            current.next = prev;
            System.out.println("Print current ==>");
            print(current);
            prev = current;
            System.out.println("Print Previous ==>");
            print(prev);
            current = next;
            System.out.println("Print current ==>");
            print(current);

        }
        return prev;
    }

    public static void main(String[] args) {
          SinglyLinkedList sll = new SinglyLinkedList();
          sll.insert(2);
          sll.insert(23);
          sll.insert(45); // 2->23->45->null
          sll.insertAtFirst(75);
          sll.insertAtIndex(2,47);
          sll.print();
          System.out.println("After deleting");
//          sll.deleteAtIndex(2);
        System.out.println("Deleted node from index :"+sll.deleteAtIndex(2).data);
        sll.print();
          sll.length();
        System.out.println("Deleted first node and print here :"+sll.deleteFirstNodeAndReturn().data);
        sll.print();
        System.out.println("Deleted Last node and print here :"+sll.deleteLastNodeAndReturn().data);
        sll.print();
        sll.insert(102);
        sll.insert(35);
        sll.print();

        System.out.println("============reverse LinkedList=============");
        sll.head = sll.reverseLinkedList();
        sll.print();

    }
}
