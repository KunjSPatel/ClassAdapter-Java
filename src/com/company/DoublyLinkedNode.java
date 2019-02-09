package com.company;

public class DoublyLinkedNode <T> {
    private DoublyLinkedNode <T> nextNode;
    private DoublyLinkedNode <T> previousNode;
    private T nodeData;

    public DoublyLinkedNode(T nodeData) {
        this.nodeData = nodeData;
    }

    public DoublyLinkedNode<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(DoublyLinkedNode<T> nextNode) {
        this.nextNode = nextNode;
    }

    public DoublyLinkedNode<T> getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(DoublyLinkedNode<T> previousNode) {
        this.previousNode = previousNode;
    }

    public T getNodeData() {
        return nodeData;
    }

    public void setNodeData(T nodeData) {
        this.nodeData = nodeData;
    }
}
