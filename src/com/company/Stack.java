package com.company;

import java.util.AbstractCollection;
import java.util.Iterator;

public class Stack<T> extends DoublyLinkedList<T> {

    //Variable
    private int count;

    //Add an item to the top of the stack
    public void push(T nodeData) {
        this.addFirst(nodeData);
        count++;

    }

    //Removes an item from the top of the stack and return the value
    public T pop() {
        T tempData = this.getHeadNode().getNodeData();
        this.removeFirst();
        count--;
        return tempData;

    }

    //Returns the value of the top item in the stack.
    public T peek() {
        T t = this.getHeadNode().getNodeData();
        return t;

    }

    @Override
    public int getCount() {
        return count;
    }
}