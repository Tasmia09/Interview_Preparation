import java.util.*;
public class BFS extends Graph{
	public BFS(){
 		super("input_adjlist.txt");
	}
 
	public void start_BFS(){

		boolean [] visited = new boolean[vertices.length];

		for(int v = 0; v < vertices.length; v++){
			if(!visited[v]){
				System.out.println("Starting at --> " + vertices[v].name);
				run_BFS(v, visited);
			}
		}
	}
 
	public void run_BFS(int start, boolean [] visited){
		Queue<Integer> q = new LinkedList<>();
		q.add(start);
		visited[start] = true;
		
		while(!q.isEmpty()){
			int v = q.remove();
			for(Neighbour n = vertices[v].neighbours; n!=null; n=n.next){
				if(!visited[n.vertexNum]){
					q.add(n.vertexNum);
					visited[n.vertexNum] = true;
					System.out.println(vertices[v].name + "---" + vertices[n.vertexNum].name);
				}
				
			}
		}
	 	
	}
}
