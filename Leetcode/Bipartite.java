package Leetcode;
// 785
public class Bipartite {
    // class Solution {
//     public boolean isBipartite(int[][] graph) {
//         int col[]=new int [graph.length];
//         for(int i =0;i<col.length;i++){
//             col[i]=-1;
//         }

//         Queue<Integer>q=new LinkedList<>();

//         for(int i=0;i<graph.length;i++){
//             if(col[i]==-1){
//                 q.add(i);
//                 col[i]=0;
//                 while(!q.isEmpty()){
//                     int curr=q.remove();
//                     for(int j=0;j<graph[curr].length;j++){
//                         int nbr=graph[curr][j];
//                         if(col[nbr]==-1){
//                             int nextcol=col[curr]==0?1:0;
//                             col[nbr]=nextcol;
//                             q.add(graph[curr][j]);
//                         }else if(col[nbr]==col[curr]){
//                             return false;
//                         }
//                     }
//                 }
//             }
//         }
//         return true;
//     }
// }
}
