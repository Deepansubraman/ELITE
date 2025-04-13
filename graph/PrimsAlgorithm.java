package graph;

import java.util.*;

public class PrimsAlgorithm {

    static int V; // Number of vertices

    // Function to find the vertex with minimum key value
    int minKey(int[] key, boolean[] mstSet) {
        int min = Integer.MAX_VALUE, minIndex = -1;

        for (int v = 0; v < V; v++) {
            if (!mstSet[v] && key[v] < min) {
                min = key[v];
                minIndex = v;
            }
        }
        return minIndex;
    }

    // Function to print the MST stored in parent[]
    void printMST(int[] parent, int[][] graph) {
        System.out.println("Edge \tWeight");
        for (int i = 1; i < V; i++) {
            System.out.println(parent[i] + " - " + i + "\t" + graph[i][parent[i]]);
        }
    }

    // Function to construct MST using Prim's algorithm
    void primMST(int[][] graph) {
        int[] parent = new int[V]; // Array to store MST
        int[] key = new int[V]; // Key values to pick min weight edge
        boolean[] mstSet = new boolean[V]; // To represent vertices in MST

        Arrays.fill(key, Integer.MAX_VALUE);
        key[0] = 0; // Start from the first vertex
        parent[0] = -1; // First node is always root of MST

        for (int count = 0; count < V - 1; count++) {
            int u = minKey(key, mstSet);
            mstSet[u] = true;

            for (int v = 0; v < V; v++) {
                if (graph[u][v] != 0 && !mstSet[v] && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
            }
        }

        printMST(parent, graph);
    }

    public static void main(String[] args) {
        PrimsAlgorithm prim = new PrimsAlgorithm();

        int[][] graph = {
                { 0, 2, 0, 6, 0 },
                { 2, 0, 3, 8, 5 },
                { 0, 3, 0, 0, 7 },
                { 6, 8, 0, 0, 9 },
                { 0, 5, 7, 9, 0 }
        };

        V = graph.length;
        prim.primMST(graph);
    }
}