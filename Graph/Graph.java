import java.util.*;
import java.io.*;
public class Graph{
	Vertex [] vertices;

	
	//Constructor that reads an input file with vertices and adjlist 
	public Graph(String fileName){
		
		//reading the file with Scanner
		try{
			Scanner sc = new Scanner(new File(fileName));
			
			String graphType = sc.next();
      boolean undirected=true;
      if (graphType.equals("directed")) {
          undirected=false;
      }
			
			vertices = new Vertex[sc.nextInt()];
			System.out.println(vertices.length);
			
			//populating the array of vertices
			for(int i = 0; i < vertices.length; i++)
				vertices[i] = new Vertex(sc.next(), null);	
				
			//edge scanning and creating neighbours for vertices
			while(sc.hasNext()){
				int v1 = getIndexOfVertex(sc.next());
				int v2 = getIndexOfVertex(sc.next());
				
				vertices[v1].neighbours = new Neighbour(v2, vertices[v1].neighbours);
				//if this is an undirected graph this connection will be set
				if(undirected)
					vertices[v2].neighbours = new Neighbour(v1, vertices[v2].neighbours); 
			}
			
		}catch(FileNotFoundException e){
			System.out.println(e);
			return;
		}
		
		
	
		
	}
	
	int getIndexOfVertex(String name){
		for(int i = 0; i < vertices.length; i++){
			if(vertices[i].name.equals(name))
				return i;
		}
		return -1;
	}
	
	public void print_graph(){
		System.out.println("The Graph is:");
		
		for(int i = 0; i < vertices.length; i++){
			System.out.print(vertices[i].name);
			
			for(Neighbour n = vertices[i].neighbours; n!=null; n = n.next)
				System.out.print("--->" + vertices[n.vertexNum].name);
			System.out.println();
		}
	}
}
