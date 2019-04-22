import java.util.*;
public class DFS extends Graph {

	public DFS(){
		super("input_adjlist.txt");
	}
	
	public void start_DFS(){
		boolean [] visited = new boolean[vertices.length];
		for(int v = 0; v < visited.length; v++){
			if(!visited[v]){
				System.out.println("Starting at --> " + vertices[v].name);
				run_DFS(v, visited);
			}
		}	
	}
	
	public void run_DFS(int v, boolean [] visited){
		visited[v] = true;
		System.out.println("Exploring --> " + vertices[v].name);
		
		for(Neighbour n = vertices[v].neighbours; n!=null ; n = n.next){
			if(!visited[n.vertexNum]){
				System.out.println(vertices[v].name + "---" + vertices[n.vertexNum].name);
				run_DFS(n.vertexNum, visited);
			}
			
		}
	}
	
	//DFS using stack
	public void stack_DFS(){
		Stack <Integer> st = new Stack<>();
		boolean [] visited = new boolean[vertices.length];
		st.push(0);
		visited[0] = true;
		
		while(!st.isEmpty()){
			int v = st.pop();
			System.out.println(" --> " + vertices[v].name);
			
			for(Neighbour n = vertices[v].neighbours; n!=null ; n = n.next){
				if(!visited[n.vertexNum]){
					st.push(n.vertexNum);
					visited[n.vertexNum] = true;
				}
			}
			System.out.println();
		}
	}

}
