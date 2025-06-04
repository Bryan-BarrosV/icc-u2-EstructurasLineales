package controllers;
public class App {
    public static void main(String[] args) throws Exception {
        Stack stack = new Stack(null);
        stack.push(10);
        stack.push(-1);
        stack.push(0);
        stack.push(5);
        stack.printStack();
        stack.pop();
        stack.peek();
        stack.printStack();
    }
}
