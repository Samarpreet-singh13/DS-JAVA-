package Graphs;

import java.util.*;
// same could be used for all other traversal of the graph
public class Connected {
    static class Edge{
        int src,dest,wt;
        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    // this will be used as the main function that will traverse all along the connected and not connected parts of the graph
    public static void bfs(ArrayList<Edge>[]graph){
        boolean vis[]=new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                bfsutil(graph, vis);
            }
        }
    }

    // it will be taken as a helper function for each connected component of the graph
    public static void bfsutil(ArrayList<Edge>[]graph,boolean []vis){
        Queue<Integer>q=new LinkedList<>();
        q.add(0);
        while (!q.isEmpty()) {
            int curr=q.remove();
            if (!vis[curr]) {
                System.out.print(curr+" ");
                vis[curr]=true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
}
