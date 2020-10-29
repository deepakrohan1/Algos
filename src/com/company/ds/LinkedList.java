package com.company.ds;

import com.company.obj.Node;

public class LinkedList {
   private Node head;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.setNext(this.head);
        this.head = newNode;
    }

    public void insertAfterANode(Node prevNode, int data) {
        Node newNode = new Node(data);

        newNode.setNext(prevNode.getNext());
        prevNode.setNext(newNode);
    }

    public void addNodeAtTheEnd(int data) {
        Node newNode ;
        if (this.head != null) {
            newNode = new Node(data);

            newNode.setNext(null);

            Node last = this.head;

            while(last.getNext() != null) {
                last = last.getNext();
            }

            last.setNext(newNode);
        }
    }

    public void printList() {
        Node head = this.head;
        while(head.getNext() != null) {
            System.out.println(head.getData());

            head = head.getNext();
        }
    }
}
