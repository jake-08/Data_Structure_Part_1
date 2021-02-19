package weightedgraph;

public class Main {
    public static void main(String[] args) {
        var graph = new WeightedGraph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");
        graph.addEdge("A", "B", 3);
        graph.addEdge("A", "C", 2);
        graph.addEdge("A", "D", 1);
        graph.addEdge("B", "C", 5);
        graph.addEdge("A", "C", 5);
        graph.addEdge("C", "D", 5);
        var tree = graph.getMinimumSpanningTree();
        tree.print();


    }
}
