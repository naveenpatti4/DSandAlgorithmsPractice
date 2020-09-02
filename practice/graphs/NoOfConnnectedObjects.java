package DSandAlgorithmsPractice.practice.graphs;

import java.util.*;

public class NoOfConnnectedObjects {

   //n=5, [[0,1], [1,2], [3,4]]

   //1. build a graph
   //2. DFS/BFS
   //3. Overview



   public int countComponentsWithadjList(int n, int[][] edges) {
      // build a graph using adjList
      List<List<Integer>> adjList = new ArrayList<>();

      for(int i=0; i < n ; i++){
         adjList.add(new LinkedList<>());
      }

      for (int[] edge : edges){
         adjList.get(edge[0]).add(edge[1]);
         adjList.get(edge[1]).add(edge[0]);
      }

      int components = 0;
      boolean[] visited = new boolean[n];

      //external loop

      System.out.println(adjList.toString());

      for(int i =0; i< n; i++){
         if(!visited[i]){
            components++;
            //bfs/dfs
            bfs(adjList, i, visited);
         }

      }

      return components;
   }


   private void bfs(List<List<Integer>> adjList, int v, boolean[] visited){

      Queue<Integer> queue = new LinkedList<>();

      queue.offer(v);

      visited[v] = true;

      while(!queue.isEmpty()){
         int ver = queue.poll();

         for(int neighbor : adjList.get(ver)){
            if(!visited[neighbor]){
               visited[neighbor] = true;
               queue.offer(neighbor);
            }
         }
      }
   }

   public int countComponentsWithadjMap(int n, int[][] edges) {
      // build a graph using adjList
      Map<Integer, List<Integer>> adjMap = new HashMap<>();

      for(int i=0; i < n ; i++){
         adjMap.put(i, new LinkedList<>());
      }

      for (int[] edge : edges){
         adjMap.get(edge[0]).add(edge[1]);
         adjMap.get(edge[1]).add(edge[0]);
      }

      int components = 0;
      boolean[] visited = new boolean[n];

      //external loop

      System.out.println(adjMap.toString());

      for(int i =0; i< n; i++){
         if(!visited[i]){
            components++;
            //bfs/dfs
            bfs(adjMap, i, visited);
         }

      }

      return components;
   }


   private void bfs(Map<Integer, List<Integer>> adjList, int v, boolean[] visited){

      Queue<Integer> queue = new LinkedList<>();

      queue.offer(v);

      visited[v] = true;

      while(!queue.isEmpty()){
         int ver = queue.poll();

         for(int neighbor : adjList.get(ver)){
            if(!visited[neighbor]){
               visited[neighbor] = true;
               queue.offer(neighbor);
            }
         }
      }
   }


}
