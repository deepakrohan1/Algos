package com.company;

import com.company.ds.LinkedList;
import com.company.obj.Node;
import com.company.ds.Stack;
import com.company.problems.Factorial;

import java.util.*;

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
		
		Factorial f = new Factorial();
		System.out.println(f.calculateFactorial(5));
        System.out.println(f.calculateFactorial(2));


        // write your code here
//        Main main = new Main();
//        LinkedList list = main.createALinkedList();
//        main.traverseALinkedList(list);

        // String[] operands = {"0","1","2","3","4","5","6","7","8","9"};
  //       String[] operators = { "+", "-", "/","*", "(", ")"};
  //  Map<String, Integer> precedence = new HashMap<>();
//        DMAS

//        precedence.put("*", 4);
//        precedence.put("/", 4);
//        precedence.put("+", 3);
//        precedence.put("-", 3);
//
//        List<String> operatorsL = Arrays.asList(operators);
//
//        Stack postfix = new Stack();
//        String a = "5 * 5 + ( 15 / 3 ) + 2";
//        String[] tokens = a.split(" ");
//        for (int i = 0; i < a.split(" ").length; i++) {
//            if(operatorsL.indexOf(tokens[i]) >= 0) {
//                System.out.println("SYMBOL");
//                if(postfix.size() == 0) {
//                    postfix.push(tokens[i]);
//                } else {
//                    int precdeToken = precedence.get(tokens[i]);
//                    int precedeStackToken = precedence.get(postfix.peek());
//
//                    if (precdeToken > precedeStackToken) {
//                        postfix.push(tokens[i]);
//                    } else {
//                        ArrayList<String> poppedList = new ArrayList<>();;
//                        while(true) {
////                            ArrayList<String> poppedList =
//                            if(operatorsL.indexOf(postfix.pop()) == -1) {
//                                break;
//                            }
//                            if(precedence.get(postfix.peek()) < precedeStackToken) {
//                                poppedList.add(postfix.pop());
//                            } else {
//
//                            }
//                        }
//
//                        postfix.push(tokens[i]);
////                        + , - , 2
////                        for(int i = )
//
//
//                    }
//                }
//            } else {
//                System.out.println(tokens[i]);
//            }
//        }

    }
}
