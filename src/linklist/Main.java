package linklist;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       // var list = new LinkedList();
//        list.addLast(10);
//        list.addLast(20);
//        list.addLast(30);
//        list.addLast(40);
//        list.addLast(50);
//        list.addLast(60);
       // list.printMiddle();
        var list = LinkedList.createWithLoop();
        System.out.println(list.hasLoop());


    }
}
