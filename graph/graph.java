package graph;

import java.util.*;

class GraphData {
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    // Constructor to initialize adjacency list
    GraphData(int vertices) {
        for (int i = 0; i < vertices; i++) {
            list.add(new ArrayList<>());
        }
    }

    // Add an undirected edge between m and n
    public void addEdge(int m, int n) {
        list.get(m).add(n);
        list.get(n).add(m);
    }

    // Display the graph as an adjacency list
    public void display() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Vertex " + i + " is connected to: " + list.get(i));
        }
    }
}

public class graph {
    public static void main(String[] args) {
        // Create graph with 5 vertices
        GraphData g = new GraphData(5);

        // Add edges
        g.addEdge(0, 1);
        g.addEdge(2, 3);
        g.addEdge(1, 2);
        g.addEdge(3, 4);
        g.addEdge(0, 4);
        g.addEdge(1, 4);

        // Display the adjacency list
        g.display();
    }
}
