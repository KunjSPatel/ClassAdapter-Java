package com.company;

import java.util.AbstractCollection;
import java.util.Iterator;

public class Queue<T> extends DoublyLinkedList<T> {

    //Variables
    private int count;

    //Adds an item as the last item in the generic LinkedList
    public void enqueue(T nodeData){
        this.addLast(nodeData);
        count++;

    }

    //Removes the first item in the generic LinkedList and return the value
    public T dequeue(){
        T tempData = this.getHeadNode().getNodeData();
        this.removeFirst();
        count--;
        return tempData;
    }

    //Returns the value of the first item in the linked list.
    public T peek(){
        T t = this.getHeadNode().getNodeData();
        return t;

    }


}
