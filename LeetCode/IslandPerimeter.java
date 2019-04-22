package leetode;

public class IslandPerimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public int islandPerimeter(int[][] grid) {
        
        int count = 0;
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[row].length; col++){
                if(grid[row][col] == 1){
                    int t = 4;
                    if(col > 0 && grid[row][col-1] == 1)
                        t--;
                    if(col < grid[row].length-1 && grid[row][col+1] == 1)
                        t--;
                    if(row > 0 && grid[row-1][col] == 1)
                        t--;
                    if(row < grid.length-1 && grid[row+1][col] == 1)
                        t--;
                    count += t;
                    
                }
            }
        }
        return count;
    }

}
