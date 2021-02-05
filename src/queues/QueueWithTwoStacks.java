package queues;

import java.util.Stack;

public class QueueWithTwoStacks {
    // Q  [10, 20, 30]
    // S1 [10, 20]       // enqueue
    // S2 [ ]            // dequeue
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    // O(1) Operation
    public void enqueue(int item) {
        stack1.push(item);
    }

    // O(n) Operation
    public int dequeue() {
        if (isEmpty())
            throw new IllegalStateException();

        moveStack1ToStack2();

        return stack2.pop();
    }

    // O(n) Operation
    public int peek() {
        if (isEmpty())
            throw new IllegalStateException();

        moveStack1ToStack2();

        return stack2.peek();
    }

    private void moveStack1ToStack2() {
        if (stack2.isEmpty())
            while (!stack1.isEmpty())
                stack2.push(stack1.pop());
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
