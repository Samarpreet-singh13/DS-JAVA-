package Graphs;

import java.util.*;

public class DirectedCycle {
    static class Edge{
        int src ,dest;
        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph) {//it will return true
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 2));
        graph[2].add(new Edge(1, 0));
        graph[1].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 0));
    }
    // made to check all vertices 
    public static boolean Iscycle(ArrayList<Edge>[]graph){
        boolean vis[]=new boolean[graph.length];
        // to have a check on the stack call of the function, when a node is already in the stack then the code will return true that a cycle exists 
        boolean stack[]=new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (IscycleUtil(graph,i,vis,stack)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean IscycleUtil(ArrayList<Edge>[]graph,int curr,boolean[]vis,boolean[]stack){
        vis[curr]=true;
        stack[curr]=true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e=graph[curr].get(i);
            if (stack[e.dest]) {
                return true;
            }
            if (!vis[e.dest]&& IscycleUtil(graph, e.dest, vis, stack)) {
                return true;
            }
        }
        stack[curr]=false;
        return false;
    }
    public static void main(String[] args) {
        int v=4;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[]graph=new ArrayList[v];
        createGraph(graph);
        System.out.println(Iscycle(graph));
    }
}
