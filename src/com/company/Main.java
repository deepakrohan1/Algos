package com.company;

import com.company.ds.LinkedList;
import com.company.obj.Node;

import java.math.BigDecimal;

public class Main {

    public LinkedList createALinkedList() {
        LinkedList list = new LinkedList();
        list.setHead(new Node(1));

        list.push(2);
        System.out.println("========="+list.getHead().getNext().getData());
        list.insertAfterANode(list.getHead().getNext(),3);
        list.addNodeAtTheEnd(4);
        return list;
    }

    public void traverseALinkedList(LinkedList list) {

        Node n = list.getHead();
        while (n != null) {
            System.out.println(n.getData());
            n = n.getNext();
        }
    }

    public static void main(String[] args) {
	// write your code here
        Main main = new Main();
        LinkedList list = main.createALinkedList();
        main.traverseALinkedList(list);


    }
}
