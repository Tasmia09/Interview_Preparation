import java.util.*;
public class Main{
	public static void main(String [] args){
		Graph graph = new Graph("input_adjlist.txt");
		graph.print_graph();
		DFS dfs = new DFS();
		dfs.start_DFS();
		BFS bfs = new BFS();
		bfs.start_BFS();
	}
}
