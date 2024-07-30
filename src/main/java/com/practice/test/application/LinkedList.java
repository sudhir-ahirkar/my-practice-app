package com.practice.test.application;

//import com.test.application.rotateLinkedList.ListNode;

public class LinkedList {

    static Node head;


    public static LinkedList insert(LinkedList lst, int data) {
        Node currentNode = new Node(data);
        currentNode.next = null;
        if (head == null) {
            head = currentNode;
        } else {
            Node node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = currentNode;
        }
        return lst;
    }


    public static void printList(LinkedList list) {
        if (list.head == null) {
            return;
        } else {
            Node currentNode = list.head;
            while (currentNode.next != null) {
                System.out.println("Node data===>" + currentNode.data);
                currentNode = currentNode.next;
            }
            System.out.println("Node data===>" + currentNode.data);
        }

    }

    public static void insertAtStart(int data) {
        Node node = new Node(data);
        node.next = null;
        node.next = head;
        head = node;
    }

    public static void insertAtIndex(int index, int data) {
        Node node = new Node(data);
        node.next = null;
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        node.next = current.next;
        current.next = node;
    }

    public static void insertAtLast(int data) {
        Node node = new Node(data);
        node.next = null;
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode = node;
    }


    public static Node rotateRight1(Node head, int k) {
        if (head == null || k <= 0 || head.next == null) return head;

        Node pre = head, end = head;
        // find the k-to-the-end
        while (end.next != head || k > 0) {
            if (k > 0) { // only forward end pointer
                --k;
            } else { // forward both pointers
                pre = pre.next;
            }
            end = end.next;
            // make it a circular linked list
            if (end.next == null) end.next = head;
        }

        Node newHead = pre.next;
        pre.next = null;
        return newHead;
    }

    public static Node rotateRight(Node head, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (head == null) return null;
        Node cur = head;
        int len = 1;
        while (cur.next != null) {
            cur = cur.next;
            len++;
        }
        cur.next = head;
        int preLen = len - n % len - 1;
        Node pre = head;
        while (preLen > 0) {
            pre = pre.next;
            preLen--;
        }
        head = pre.next;
        pre.next = null;
        return head;
    }

    public static Node rotateRight2(Node head, int k) {
        // find the length of the list
        int len = 0;
        Node cur = head;
        while (cur != null) {
            ++len;
            cur = cur.next;
        }

        if (len == 0 || k % len == 0) return head;
        k = k % len;

        Node pre = head;
        cur = head;
        // find the n-to-the-end
        while (cur.next != head) {
            if (k > 0) { // only forward end pointer
                --k;
            } else { // forward both pointers
                pre = pre.next;
            }
            cur = cur.next;
            // make it a circular linked list
            if (cur.next == null) cur.next = head;
        }

        Node newHead = pre.next;
        pre.next = null;

        return newHead;
    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list = insert(list, 9);
        list = insert(list, 8);
        list = insert(list, 3);
        list = insert(list, 10);
        list = insert(list, 5);
//    printList(list);
        System.out.println("===========================");
//    insertAtStart(8);
//    insertAtIndex(2, 45);
//    deleteAtIndex(3);

//    rotateRight(list.head,2);
//    rotateRight1(list.head,2);
//    rotateRight2(list.head,2);
//    rotate(list.head, 2);
        sortList(list);
        printList(list);

    }


    private static void deleteAtIndex(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node current = head;
            Node dummy = null;
            for (int i = 0; i < index - 1; i++) {
                  current = current.next;
            }
            dummy = current.next;
            current.next = dummy.next;
        }
    }

    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }

    public static Node rotate(Node head, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (head == null) return null;
        Node cur = head;
        int len = 1;
        while (cur.next != null) {
            cur = cur.next;
            len++;
        }
        cur.next = head;
        int preLen = len - n % len - 1;
        Node pre = head;
        while (preLen > 0) {
            pre = pre.next;
            preLen--;
        }
        head = pre.next;
        pre.next = null;
        return head;
    }

    //sortList() will sort nodes of the list in ascending order
    public static void sortList(LinkedList list) {
        //Node current will point to head  
        Node current = list.head, index = null;
        int temp;
        if (current == null) {
            return;
        } else {
            while (current != null) {
                //Node index will point to node next to current  
                index = current.next;

                while (index != null) {
                    //If current node's data is greater than index's node data, swap the data between them  
                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

}
