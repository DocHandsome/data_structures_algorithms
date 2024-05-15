package handsome.doc.data_structures.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Graph {

    private int numberOfNodes = 0;
    private final HashMap<Integer, List<Integer>> adjacentList = new HashMap<>();

    public void addVertex(final int node) {
        adjacentList.put(node, new ArrayList<>());
        numberOfNodes++;
    }

    public void addEdge(final int node1, final int node2) {
        adjacentList.get(node1).add(node2);
        adjacentList.get(node2).add(node1);
    }
}
