package GraphAlgoritham;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph{
    static class Edge{
        int src;
        int dest;

        public Edge(int s, int d){
          this.dest=d;
          this.src=s;
        }
    }

    public static void createGraph(ArrayList <Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
    graph[0].add(new Edge(0, 2));
    graph[1].add(new Edge(1,3));
    graph[1].add(new Edge(1, 2));
    graph[2].add (new Edge(2,3));
    graph[2].add(new Edge(2,1));
    graph[2].add(new Edge(2,0));

    }

    public static void bfs(ArrayList<Edge>graph[],int v){
     Queue<Integer> q= new LinkedList<>();
     boolean vis[]=new boolean[v];
      q.add(0);
      while(!q.isEmpty()){
        int current= q.remove();
        if(vis[current]==false){
            System.out.println(current+" ");
            vis[current]=true;

           for(int i=0; i<graph[current].size();i++){
            Edge e =graph[current].get(i);
               q.add(e.dest);
           }
        }
      }
    }
   

    public static void main(String[] args){
        int v=4;
       ArrayList <Edge> garph[]=new ArrayList[v];
       createGraph(garph);
       bfs(garph,v);
    }

}