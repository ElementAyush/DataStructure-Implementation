import java.util.ArrayList;
import java.util.List;

public class Graph {
    private List<Integer>[] adj ;
    private int V ;
    Graph(int v){
        V = v ;
        adj = new ArrayList[V];
        for(int i = 0 ; i < V ; i++)
            adj[i] = new ArrayList<>() ;
    }
    public static void main(String[] args) {
        Graph g = new Graph(5) ;

    }
}