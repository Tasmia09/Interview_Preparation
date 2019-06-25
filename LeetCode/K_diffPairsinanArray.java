class K_diffPairsinanArray {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        if( k < 0)
            return 0;
        for(int x : nums){
            hm.put(x, hm.getOrDefault(x,0)+1);
        }
        int count = 0;
        
        for(Integer i : hm.keySet()){
            if(k != 0 && hm.get(i+k) != null)
                count++;
            else if(k==0 && hm.get(i) > 1 )
                count++;
            
        }
        return count;
    }
}
