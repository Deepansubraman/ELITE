package graph;

import java.util.*;

class Graph {
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    Graph(int val) {
        for (int i = 0; i < val; i++) {
            list.add(new ArrayList<Integer>());
        }
    }

    public void addEdge(int m, int n) {
        list.get(m).add(n);
        list.get(n).add(m);
    }

    public void display() {
        for (int i = 0; i < list.size(); i++) { // first list
            System.out.println("Vertex :" + i);
            for (int j = 0; j < list.get(i).size(); j++) { // inner list
                System.out.println(" " + list.get(i).get(j));
            }
        }
    }

    public void dfs(int v) {
        int b = list.size();
        boolean[] visit = new boolean[b];
        df(v, visit);
    }

    public void df(int v, boolean[] visit) {
        visit[v] = true;
        System.out.print(v + " ");
        for (int i = 0; i < list.get(v).size(); i++) {
            int av = list.get(v).get(i);
            if (!visit[av]) {
                df(av, visit);
            }
        }
    }
}

public class graphDFS {
    public static void main(String[] args) {
        Graph a = new Graph(5); // no.of.vertices
        a.addEdge(0, 1);
        a.addEdge(2, 3);
        a.addEdge(1, 2);
        a.addEdge(3, 4);
        a.addEdge(0, 4);
        a.addEdge(1, 4);

        a.display();
        a.dfs(0);
    }
}