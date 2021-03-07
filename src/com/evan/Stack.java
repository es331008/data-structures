package com.evan;

public class Stack {
    private int[] arr;
    private int top;
    private int size = 0;

    public Stack(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    public void push(int i) {
        arr[++top] = i;
    }

    public int pop() {
        return arr[top--];
    }

    public int peek() {
        return arr[top];
    }

    public boolean isEmpty() {
        return arr.length == 0;
    }

}
