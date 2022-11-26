package Graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DetectCycleInDirectedGraph {
    int v;
    List<List<Integer>> graph = new ArrayList<>();

    public DetectCycleInDirectedGraph(int v){
        this.v = v;
        for(int i=0; i<v; i++){
            graph.add(new ArrayList<Integer>());
        }
    }

    public void addEdge(int u, int v){
        graph.get(u).add(v);
    }

    public boolean detectCycle(){
        boolean[] visited = new boolean[this.v];
        for(int i=0; i<this.v; i++){
            visited[i] = false;
        }
        for(int i=0; i<this.v; i++){
            if(!visited[i]){
            if(isCycle(i, visited)) {
                return true;
            }

            }
        }
        return false;
    }

    public boolean isCycle(int vertex, boolean[] visited){
        visited[vertex] = true;
        Stack stack = new Stack();
        stack.push(vertex);
        while(!stack.isEmpty()){
            int u = (int) stack.pop();
            for(int i=0; i<graph.get(u).size(); i++){
                int neighbor = graph.get(u).get(i);
                if(!visited[neighbor]){
                    visited[neighbor] = true;
                    stack.push(neighbor);
                }
                else {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        DetectCycleInDirectedGraph graph = new DetectCycleInDirectedGraph(8);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge( 2, 3);
        graph.addEdge( 3, 7);
        graph.addEdge( 4, 5);
        graph.addEdge( 4, 6);
        graph.addEdge( 4, 7);
        graph.addEdge( 5, 6);
        graph.addEdge( 6, 7);
        boolean res = graph.detectCycle();
        System.out.println(res);
    }
}
