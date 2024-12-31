package Leetcode;

// leetcoe no 2872

// import java.util.ArrayList;
// import java.util.List;
// import java.util.Queue;

public class MaxKdivComp {
//     class Solution {
//     public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
//         List<List<Integer>>adj=new ArrayList<>();
//         int nbrs[]=new int[n]; //unproccesed nbrs
//         for(int i=0;i<n;i++) adj.add(new ArrayList<>());// adding new list in list
//         for(int[] edge:edges){ //building adjacency list by edges
//             adj.get(edge[0]).add(edge[1]);
//             adj.get(edge[1]).add(edge[0]);
//         }

//         Queue<Integer>q=new LinkedList<>(); 
//         for(int i=0;i<n;i++){ //adding leaf nodes to the queue 
//             nbrs[i]=adj.get(i).size(); //sizae of the adj list will give nbrs 
//             if(nbrs[i]==1) q.add(i);//if leaf node then added in queue
//         }
//         int ans=0;
//         while(!q.isEmpty()){ //traversing the queue 
//             int node=q.remove(); //removing the leaf
//             nbrs[node]-=1;// bond is broken and value is reduced
//             if(values[node]%k==0) ans++; //checking value of each node
//             for(int  nbr:adj.get(node)){
//                 if(nbrs[nbr]!=0){ //if not processed
//                     values[nbr]+=values[node]%k; //then the value of the leaf node is added to its parent
//                     if(--nbrs[nbr]==1) q.add(nbr);
//                 }
//             }
//         }
//         return ans==0?1:ans;
//     }
// }
}
