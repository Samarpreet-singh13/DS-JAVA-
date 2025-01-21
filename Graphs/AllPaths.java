package Graphs;

import java.util.*;

public class AllPaths {
    static class Edge{
        int src,dest;
        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void createGraph(ArrayList<Edge>[]graph){
        for (int i = 0; i < graph.length; i++) {
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 3));

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    // time complexity is exponential for this 
    public static void allPaths(ArrayList<Edge>[]graph,int src,int dest,String path){
        // check if the node is equal to destination
        if (src==dest) {
            System.out.println(path+dest);
            return;
        }
        // if not then the nebrs of the curr nodes are used 
        for (int i = 0; i < graph[src].size(); i++) {
            Edge e=graph[src].get(i);
            allPaths(graph, e.dest, dest, path+src);
        }
    }

    public static void main(String[] args) {
        int v=6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[]graph=new ArrayList[v];
        createGraph(graph); 
        int src=5;int dest=1;
        allPaths(graph, src, dest, "");
    }
}
