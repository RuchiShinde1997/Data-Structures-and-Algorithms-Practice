package Graphs;

import java.util.*;

public class DetectCycleInUndirectedGraph {

    int v;
    List<List<Integer>> graph = new ArrayList<>();

    public DetectCycleInUndirectedGraph(int v){
        this.v = v;
        for(int i=0; i<v; i++){
            graph.add(new ArrayList<Integer>());
        }
    }

    void detectCycle(){
        boolean flag = false;
        boolean[] visited = new boolean[v];
        for(int i=0; i<v; i++){
            visited[i] = false;
        }
        for(int i=0; i<v; i++){
            if(!visited[i]){
                if(isCyclePresent(i, -1, visited)){
                    flag = true;
                    break;
                }
            }
        }
        if(flag)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    boolean isCyclePresent(int vertex, int parent, boolean[] visited){
        visited[vertex] = true;
        Iterator<Integer> it = graph.get(vertex).iterator();
        Integer i;
        while(it.hasNext()){
            i = it.next();
            if(!visited[i]){
                if(isCyclePresent(i, vertex, visited))
                    return true;
            }
            else if (parent!=i) {
                return true;
            }
        }
        return false;
    }
    public void addEdge(int i, int j){
        graph.get(i).add(j);
        graph.get(j).add(i); // because it is an undirected graph, we provide an option to traverse in the opposite direction too
    }

    public static void main(String[] args){
        DetectCycleInUndirectedGraph graph = new DetectCycleInUndirectedGraph(3);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
//        graph.addEdge( 3, 4);
//        graph.addEdge( 3, 7);
//        graph.addEdge( 4, 5);
//        graph.addEdge( 4, 6);
//        graph.addEdge( 4, 7);
//        graph.addEdge( 5, 6);
//        graph.addEdge( 6, 7);
        graph.detectCycle();
    }
}
