package com.company;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class DoublyLinkedList<T> extends AbstractCollection<T> implements Iterator<T>, Collection<T>{

    //Variables
    private DoublyLinkedNode<T> headNode;
    private DoublyLinkedNode<T> tailNode;
    private int count;
    public DoublyLinkedNode<T> currentNode;

    //Adding the nodeData to the top of the list
    public void addFirst(T nodeData){
        DoublyLinkedNode<T> tempNode = headNode;
        headNode = new DoublyLinkedNode<T>(nodeData);
        headNode.setNextNode(tempNode);
        count++;
        if(count == 1)
            tailNode = headNode;
        else {
            tempNode.setPreviousNode(headNode);
        }
        currentNode = headNode;
    }

    //Adding the nodeData to the last of the list
    public void addLast(T nodeData){
        DoublyLinkedNode<T> newNode = new DoublyLinkedNode<T>(nodeData);
        if(count==0){
            count++;
            headNode = this.tailNode = newNode;
        }
        else
        {
            tailNode.setNextNode(newNode);
            newNode.setPreviousNode(tailNode);

            tailNode = newNode;
            count++;
        }
        currentNode = headNode;
    }

    //Removing the nodeData to the top of the list
    public void removeFirst(){
        if(count!=0){
            headNode = headNode.getNextNode();
            count--;
            if(count==0)
                tailNode = null;
            else
                headNode.setPreviousNode(null);
        }
        currentNode = headNode;
    }

    //Removing the nodeData to the last of the list
    public void removeLast(){
        if(count==1)
        {
            headNode = null;
            tailNode = null;
        }
        else
        {
            tailNode.getPreviousNode().setPreviousNode(null);
            tailNode = tailNode.getPreviousNode();
        }
        currentNode = headNode;
    }

    //Getters and Setters
    public DoublyLinkedNode<T> getHeadNode() {
        return headNode;
    }

    public DoublyLinkedNode<T> getTailNode() {
        return tailNode;
    }

    public int getCount() {
        return count;
    }

    //Shows if there's an element after the current node
    @Override
    public boolean hasNext() {
        return currentNode.getNextNode()!=null;
    }

    //Shows the element after the current one
    @Override
    public T next() {
        if(!hasNext()){
            throw new NoSuchElementException();
        }else{
            currentNode = currentNode.getNextNode();
            T t = currentNode.getNextNode().getNodeData();
            return t;

        }

    }


    @Override
    public Iterator<T> iterator() {
        return this;
    }

    @Override
    public int size() {
        return count;
    }
}