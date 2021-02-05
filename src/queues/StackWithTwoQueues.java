package queues;


import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class StackWithTwoQueues {
    // Q1 -> for adding (main queue)
    // Q2 -> for popping (back-up queue)

    Queue<Integer> queue1 = new ArrayDeque<>();
    Queue<Integer> queue2 = new ArrayDeque<>();
    int top;

    // O(1)
    public void push(int item) {
        queue1.add(item);
        top = item;
    }

    // O(n)
    public int pop() {
        if (isEmpty())
            throw new IllegalStateException();

        while (queue1.size() > 1) {
            top = queue1.remove();
            queue2.add(top);
        }

        swapQueues();

        return queue2.remove();
    }

    private void swapQueues() {
        var temp = queue2;
        queue2 = queue1;
        queue1 = temp;
    }

    // O(1)
    public int peek() {
        if (isEmpty())
            throw new IllegalStateException();

        return top;
    }

    // O(1)
    public boolean isEmpty() {
        return queue1.isEmpty();
    }

    // O(1)
    public int size() {
        return queue1.size();
    }

    @Override
    public String toString() {
        return queue1.toString();
    }

}
