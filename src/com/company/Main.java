package com.company;

import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {

        //Testing DoublyLinkedList
        DoublyLinkedList<String> ddl = new DoublyLinkedList<>();
        System.out.println("Has and Has Next methods tested together:\nHasNext: After the final node shows null i.e. no element exists," +
                " and Next: prints the node data for the node next to the current node.\n ");

        ddl.addFirst("A");
        System.out.println("The head node");
        System.out.println(ddl.getHeadNode().getNodeData());
        ddl.addLast("B");
        ddl.addLast("C");
        ddl.addLast("D");
        System.out.println("Checking the has Next method: " + ddl.hasNext());
        ddl.addLast("E");

        System.out.println("\nThe tail node");
        System.out.println(ddl.getTailNode().getNodeData());

        ddl.addFirst("Hi");
        ddl.addFirst("Hello");
        System.out.println("\nUsing Has and Has Next");

        while(ddl.hasNext()) {
            try {
                System.out.println(ddl.next());
            }catch (NullPointerException e){
                System.out.println(e.getMessage());
            }
        }

        ddl.removeLast();
        System.out.println("\nAfter removing the last node");
        System.out.println(ddl.getTailNode().getNodeData());

        //Testing Stack : push-adds to the top; pop-removes from the top; peek-shows the top item
        Stack<String> stack = new Stack<>();
        stack.push("First");
        System.out.println("\nStack Head: "+stack.getHeadNode().getNodeData());
        stack.push("Last");
        System.out.println("Stack Tail:"+stack.getHeadNode().getNodeData());
        System.out.println("Removed: " +stack.pop());
        stack.push("Peek Test");
        System.out.println("Peek: " + stack.peek());

        //Testing Queue : enqueue-adds to the top; dequeue-removes from the top; peek-shows the top item
        Queue<String> queueTest = new Queue<>();
        queueTest.enqueue("First queue");
        System.out.println("\nQueue Head: "+queueTest.getHeadNode().getNodeData());
        queueTest.enqueue("Last queue");
        System.out.println("Queue Tail:"+queueTest.getTailNode().getNodeData());
        System.out.println("Removed queue: " +queueTest.dequeue());
        queueTest.enqueue("Peek Test");
        System.out.println("Peek: " + queueTest.peek());

    }
}
