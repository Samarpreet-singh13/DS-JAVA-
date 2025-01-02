package Graphs;

import java.util.*;

public class Topological {
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
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }
    public static void topSortdfs(ArrayList<Edge>[]graph){
        boolean vis[]=new boolean[graph.length];
        Stack<Integer>s=new Stack<>();

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                topsortUtil(graph,i,vis,s);
            }
        }
        while (!s.isEmpty()) {
            System.out.print(s.pop()+" ");
        }
        System.out.println();
    }
    public static void topsortUtil(ArrayList<Edge>[]graph,int curr,boolean vis[],Stack<Integer>s){
        vis[curr]=true;
        // modified dfs is used     
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e=graph[curr].get(i);
            if (!vis[e.dest]) {
                topsortUtil(graph, e.dest, vis, s);
            }
        }
        // added in lasrt to get it out first LIFO-stack
        s.push(curr);
    }
    public static void calcInd(ArrayList<Edge>[]graph,int []indeg){
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e=graph[i].get(j);
                indeg[e.dest]++;
            }
        }
    }

    // Kahn's algorithm
    public static void topSortbfs(ArrayList<Edge>[]graph){
        int indeg[]=new int[graph.length];
        calcInd(graph, indeg);

        Queue<Integer>q=new LinkedList<>();
        for (int i = 0; i < indeg.length; i++) {
            if (indeg[i]==0) {
                q.add(i);
            }
        }

        while (!q.isEmpty()) {
            int curr=q.poll();
            System.err.print(curr+" ");
            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e=graph[curr].get(i);
                indeg[e.dest]--;
                if (indeg[e.dest]==0) {
                    q.add(e.dest);
                }
            }
        }
    }
    public static void main(String[] args) {
        int v=6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[]graph=new ArrayList[v];
        createGraph(graph);
        topSortdfs(graph);
        topSortbfs(graph);
    }
}
