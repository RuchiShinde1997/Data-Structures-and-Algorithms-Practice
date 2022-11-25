package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;

public class MinDistanceInUnweightedUndirectedGraph {

    ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    int noOfVertices;
    public MinDistanceInUnweightedUndirectedGraph(int noOfVertices){
        this.noOfVertices = noOfVertices;
        for(int i=0; i<noOfVertices; i++){
            graph.add(new ArrayList<Integer>());
        }
    }

    public void addEdge(int i, int j){
        graph.get(i).add(j);
        graph.get(j).add(i); // because it is an undirected graph, we provide an option to traverse in the opposite direction too
    }
    public void minDistance(int src, int dest){
        int[] distance = new int[this.noOfVertices];
        int[] prevParent = new int[this.noOfVertices];
        //BFS returns true if path exists else returns false
        if(BFS(src, dest, prevParent, distance)){
            System.out.println("Distance = "+distance[dest]);
        }
        else{
            System.out.println("No path found");
        }
    }

    public boolean BFS(int src, int dest, int[] prevParent, int[] distance){

        boolean[] visited = new boolean[this.noOfVertices];
        for(int i=0;i<this.noOfVertices; i++){
            visited[i] = false;
            prevParent[i] = -1;
            distance[i] = Integer.MAX_VALUE;
        }

        LinkedList<Integer> queue = new LinkedList<Integer>();

        distance[src] = 0;
        visited[src] = true;
        queue.add(src);

        while(!queue.isEmpty()){
            int u = (int) queue.remove();
            for(int i=0; i<graph.get(u).size(); i++){
                if(!visited[graph.get(u).get(i)]){
                    visited[graph.get(u).get(i)] = true;
                    queue.add(graph.get(u).get(i));
                    distance[graph.get(u).get(i)] = distance[u] + 1;
                    prevParent[graph.get(u).get(i)] = u;
                    if(graph.get(u).get(i) == dest){
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public void BFS(){

    }

    public static void main(String[] args){
        MinDistanceInUnweightedUndirectedGraph graph = new MinDistanceInUnweightedUndirectedGraph(8);
        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);
        graph.addEdge( 3, 4);
        graph.addEdge( 3, 7);
        graph.addEdge( 4, 5);
        graph.addEdge( 4, 6);
        graph.addEdge( 4, 7);
        graph.addEdge( 5, 6);
        graph.addEdge( 6, 7);
        graph.minDistance(1, 6);
    }
}
