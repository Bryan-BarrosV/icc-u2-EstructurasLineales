package controllers;
import java.util.EmptyStackException;

import  models.Node;

public class Stack {
    private Node top;

    public Stack(Node top) {
        this.top = top;
    }
    public void push (int value){
        Node newNode=new Node (value);
        newNode.setNext(top);
        top =newNode;   
    }
    public int pop(){
        if(top== null){
            throw new EmptyStackException();
        }
        int value=top.getValue();
        top=top.getNext();
        return value;
    }
    public int peek() {
        if (isEmpty()) 
            throw new EmptyStackException();
        return top.getValue();
    }

    public boolean isEmpty(){
        return top==null;
    }
    public void printStack() {
        Node current=top;
        while (current != null){
            System.out.println(current.getValue());
            current=current.getNext();
             if (current != null) {
                System.out.print(" -> ");
            }
        }
        System.out.println("null");
    }
}


