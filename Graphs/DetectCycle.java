package Graphs;
import java.util.*;
public class DetectCycle {
    static class Edge{
        int src,dest;
        public Edge(int s,int d) {
            this.src=s;
            this.dest=d;
        }
    }
    public static void createGraph(ArrayList<Edge>[]graph){
        for (int i = 0; i < graph.length; i++) {
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));
        
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));
    
    }
    public static boolean cycle(ArrayList<Edge>[]graph){
        boolean []vis=new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (cycleUtil(graph, i, vis,-1)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean cycleUtil(ArrayList<Edge>[]graph,int curr,boolean vis[],int par){
        vis[curr]=true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e= graph[curr].get(i);
            if (!vis[e.dest]) {
                if (cycleUtil(graph, e.dest, vis, curr)) {
                    return true;
                }
            }
            else if (vis[e.dest]&&e.dest!=par) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int v=5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[]graph=new ArrayList[v];
        createGraph(graph);
        System.out.println(cycle(graph));
    }
}
