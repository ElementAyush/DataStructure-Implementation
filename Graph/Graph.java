import java.util.ArrayList;
import java.util.List;

public class Edge{

    Edge leftNode, rightNode ;
    int weight; 
    Edge(Edge left, Edge right, int weight){
        leftNode = left;
        rightNode = right ;
        this.wight = weight ;

    }
}

public class Graph {
    private List<Integer>[] adj ;
    private int V ;
    Graph(int v){
        V = v ;
        adj = new ArrayList[V];
        for(int i = 0 ; i < V ; i++)
            adj[i] = new ArrayList<>() ;
    }

    public void addEdge()
    public static void main(String[] args) {
        Graph g = new Graph(5) ;


    }
}