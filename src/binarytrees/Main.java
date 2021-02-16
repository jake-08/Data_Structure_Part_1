package binarytrees;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(8);
        tree.insert(81);
        tree.insert(7);
        tree.insert(4);
//        tree.insert(9);
//        tree.insert(11);
        tree.insert(1);
        tree.insert(6);
//        tree.insert(8);

        var ad = tree.isBalanced();
        System.out.println(tree.isPerfect());
        System.out.println(tree.isBalanced());
    }
}
