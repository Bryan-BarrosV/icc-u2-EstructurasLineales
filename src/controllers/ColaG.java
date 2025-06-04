package controllers;

import java.util.EmptyStackException;
import models.NodeGeneric;

public class ColaG<T> {
    private NodeGeneric<T> primero;
    private NodeGeneric<T> ultimo;
    private int size;

    public ColaG() {
        this.primero = null;
        this.ultimo = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return primero == null;
    }

    public int size() {
        return size;
    }

    public void add(T value) {
        NodeGeneric<T> newNode = new NodeGeneric<>(value);

        if (isEmpty()) {
            primero = newNode;
            ultimo = newNode;
        } else {
            ultimo.setNext(newNode);
            ultimo = newNode;
        }

        size++;
    }

    public T remove() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        T value = primero.getValue();
        primero = primero.getNext();
        size--;

        if (primero == null) {
            ultimo = null;
        }

        return value;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return primero.getValue();
    }

    public void printCola() {
        NodeGeneric<T> actual = primero;
        while (actual != null) {
            System.out.println(actual.getValue());
            actual = actual.getNext();
        }
    }

    @Override
    public String toString() {
        return "ColaG [primero=" + primero + ", ultimo=" + ultimo + "]";
    }
}