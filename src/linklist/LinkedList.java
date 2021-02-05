package linklist;

import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;
        public Node(int value){
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public void addLast(int item){
        var node = new Node(item);
        if (isEmpty()) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public void addFirst(int item){
        var node = new Node(item);
        if (isEmpty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
        size++;
    }

    public int indexOf(int item) {
        int index = 0;
        var current = first;
        while (current != null) {
            if(current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public void removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (first == last) {
            first = last = null;
        } else {
            var second = first.next;
            first.next = null;
            first = second;
        }
        size--;
    }

    public void removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (first == last) {
            first = last = null;
        } else {
            var previous = getPrevious(last);
            last = previous;
            last.next = null;
        }
        size--;
    }

    private Node getPrevious(Node node) {
        var current = first;
        while (current != null) {
            if(current.next == node) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public int size() {
        return size;
    }

    public int[] toArray() {
        int[] array = new int[size];
        var current = first;
        var index = 0;
        while (current != null) {
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    public void reverse() {
        // [10 -> 20 -> 30]
        //  p     c     n
        // [10 <- 20 <- 30]
        //  l           f
        if (isEmpty()) return;
        var previous = first;
        var current = previous.next;
        while (current != null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        last = first;
        last.next = null;
        first = previous;
    }

    public int getKthFromTheEnd(int k) {
        //  5      4     3     2    1
        // [10 -> 20 -> 30 -> 40 -> 50]
        //  *                        *
        //
        // K = 1 (50)
        // K = 2 (40)
        // K = 3 (30) (distance = 2)
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        var a = first;
        var b = first;
        for (int i = 0; i < k - 1; i++) {
            b = b.next;
            if (b == null) {
                throw new IllegalArgumentException();
            }
        }
        while (b != last) {
            a = a.next;
            b = b.next;
        }
        return a.value;
    }

    public void printMiddle() {
        // [1 -> 2 -> 3 -> 4 -> 5 -> 6]
        //            *         *
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        var a = first;
        var b = first;
        while (b != last && b.next != last) {
            b = b.next.next;
            a = a.next;
        }
        if (b == last) {
            System.out.println(a.value);
        } else {
            System.out.println("Middle Nodes are: " + a.value + ", " + a.next.value);
        }
    }

    public boolean hasLoop() {
        var a = first;
        var b = first;
        while (b != null && b.next != null) {
            a = a.next;
            b = b.next.next;
            if(a == b) {
                return true;
            }
        }
        return false;
    }

    public static LinkedList createWithLoop() {
        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

//      Get a reference to 30
        var node = list.last;

        list.addLast(40);
        list.addLast(50);
        list.addLast(60);
        list.addLast(70);
        // Create the loop
        list.last.next = node;

        return list;
    }

    private boolean isEmpty() {
        return first == null;
    }

}
