

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;

public class KeyboardRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public String[] findWords(String[] words) {
	        String [] alphaRows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
	        
	        //creating arraylist
	        ArrayList<String> result = new ArrayList<String>();
	        int lookat = -1;
	        for(int i = 0; i < words.length; i++){
	        	
	        	//creating hashset to have unique values and later to compare
	            HashSet<Character> h1 = new HashSet<Character>(), h2 = new HashSet<Character>();
	            
	            String curr = words[i].toLowerCase();
	            
	            //finding the row from the first character
	            if(alphaRows[0].indexOf(curr.charAt(0)) >= 0)
	                lookat = 0;
	            else if(alphaRows[1].indexOf(curr.charAt(0)) >= 0)
	                lookat = 1;
	            if(alphaRows[2].indexOf(curr.charAt(0)) >= 0)
	                lookat = 2;
	            
	            //adding characters to hashset to have unique values from the input string
	            for(int x = 0; x < curr.length(); x++)                                            
	            {
	                  h1.add(curr.charAt(x));
	            }
	            
	            //adding the characters to hashset so we can do hash comparison
	            for(int x = 0; x < alphaRows[lookat].length(); x++)                                            
	            {
	                  h2.add(alphaRows[lookat].charAt(x));
	            }
	            
	            //if the bigger string contains all from the smaller/input string
	            if(h2.containsAll(h1))
	                result.add(words[i]); 


	        }
	        
	        //converting a 
	        return result.toArray(new String[result.size()]);
	        
	        
	        //more efficient
	        
	        /*int [] alphaRows = {2,3,3,2,1,2,2,2,1,2,2,2,3,3,1,1,1,1,2,1,1,3,1,3,1,3};
	        ArrayList<String> result = new ArrayList<String>();
	        
	        for(String s : words){
	            String lowstr = s.toLowerCase();
	            int row = alphaRows[lowstr.charAt(0)-'a'];
	            boolean flag = true;
	            
	            for(int i = 1; i < s.length(); i++){
	                if(alphaRows[lowstr.charAt(i)-'a'] != row){
	                    flag = false;
	                    break;
	                }                    
	            }
	            if(flag)
	                result.add(s);
	        }
	        
	        return result.toArray(new String[result.size()]);*/
	    }
}
