package stacks;

import java.util.Arrays;

public class MinStack {

    // Design a stack that supports push, pop and retrieving the minimum value in constant time.

    private Stack stack = new Stack(5);
    private Stack minStack = new Stack(5);

    public void push(int item) {
        stack.push(item);

        if (minStack.isEmpty())
            minStack.push(item);
        else if (item < minStack.peek())
            minStack.push(item);
    }

    public int pop() {
        if (stack.isEmpty())
            throw new IllegalStateException();

        var top = stack.pop();

        if (minStack.peek() == top)
            minStack.pop();

        return top;
    }

    public int min() {
        return minStack.peek();
    }

    public void print() {
        System.out.println(minStack.toString());
    }

}
