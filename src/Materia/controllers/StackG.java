package Materia.controllers;

import java.util.EmptyStackException;
import Materia.models.NodeGeneric;


public class StackG<T> {
    private NodeGeneric<T> top;
    private int size;
    public StackG(NodeGeneric<T> top, int size) {
        this.top = top;
        this.size = 0;
    } 

    public void push (T value){
        NodeGeneric<T> newNodeGeneric=new NodeGeneric<T>(value, top);
        newNodeGeneric.setNext(top);
        top=newNodeGeneric;
    }
    public T pop(){
        if(top== null){
            throw new EmptyStackException();
        }
        T value=top.getValue();
        top=top.getNext();
        return value;
    }
    public T peek() {
        if (isEmpty()) 
            throw new EmptyStackException();
        return top.getValue();
    }
    public boolean isEmpty(){
        return top==null;
    }
    public void printStack() {
    NodeGeneric<T> aux = top;
    while (aux != null) {
        System.out.print(aux.getValue() + " | ");
        aux = aux.getNext();
    }
    System.out.println();
}
    
    public int size () {
        return this.size;
    }
}
