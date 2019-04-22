package leetode;

import java.util.HashMap;

public class LongestHarmoniousSubsequence {
	public int findLHS(int[] nums) {
        HashMap <Integer, Integer> hm = new HashMap <Integer, Integer>();
        int max = 0;
        int check = 0;
        for(int x:nums){
            if(!hm.containsKey(x))
                hm.put(x, 1);
            else
                hm.put(x, hm.get(x)+1);
        }
        
        for(int x:nums){
            if(hm.containsKey(x-1)){
                check = hm.get(x)+hm.get(x-1);
                if( check > max)
                    max = check;
            }
            if(hm.containsKey(x+1)){
                check = hm.get(x)+hm.get(x+1);
                if( check > max)
                    max = check;
            }
        }
       
        
     return max;    
}
}
