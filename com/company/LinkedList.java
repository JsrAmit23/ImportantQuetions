package com.company;

public class LinkedList {
    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }


    }

    public void show() {
        Node node = head;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;

    }

    public void insertAtIndex(int index, int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        Node n = head;

        if (index == 0) {
            insertAtStart(data);
        }

        for (int i = 0; i < index - 1; i++) {
            n = n.next;
        }
        node.next = n.next;
        n.next = node;
    }

    public void deleteAt(int index) {
        Node n = head;
        Node n1 = head;
        for (int i = 0; i < index - 1; i++) {
            n = n.next;
            n1 = n1.next;

        }
        n1 = n1.next;
        n.next = n1.next;
        n1.next = null;
    }


    public void printMiddle() {
        Node fstNode = head;
        Node slowNode = head;
        if (head != null) {
            while (fstNode != null && fstNode.next != null) {
                fstNode = fstNode.next.next;
                slowNode = slowNode.next;
            }
            System.out.println("The of the middle element is " + slowNode.data);
        }
    }

    //Delete the middle element of the linkedlist
    public void deleteMiddle() {
        int count = 0;
        Node fstNode = head;
        Node slowNode = head;
        if (head != null) {
            while (fstNode != null && fstNode.next != null) {
                fstNode = fstNode.next.next;
                slowNode = slowNode.next;
                count += 1;
            }
            deleteAt(count);
        }

    }


    //Number of nodes
    public int countNodes() {
        int count = 0;
        Node n = head;
        while (n.next != null) {
            n = n.next;
            count++;
        }
        count = count + 1;

        return count;
    }


    //Nth node from the last of LinkedList

    public int nodeFromTheLast(int nthNodeFromTheLAst) {
        int count = countNodes();
        int n = nthNodeFromTheLAst;
        int data;
        if (count - nthNodeFromTheLAst == count) {
            data = showAt(count);
        } else {
            data = showAt(count - nthNodeFromTheLAst);
        }

        return data;

    }

    //Index show
    public int showAt(int index) {
        Node n = head;
        for (int i = 0; i < index; i++) {
            n = n.next;
        }
        System.out.println(n.data);
        return n.data;

    }

    //reverse the LinkedList

    public Node reverse(){
        Node n = head;
        Node currentNode = n;
        Node nextNode=null;
        Node preNode = null;
        while(currentNode!=null){
            nextNode = currentNode.next;
            currentNode.next = preNode;
            preNode = currentNode;
            currentNode=nextNode;
        }
        n = preNode;

        while (n!=null){
            System.out.println(n.data);
            n=n.next;

        }
        return n;

    }

}
