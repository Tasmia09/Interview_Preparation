
class LargestNumberAtLeastTwiceofOthers {
    public int dominantIndex(int[] nums) {
        int maxIndex = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[maxIndex])
                maxIndex = i;
        }
        
        for(int i = 0; i < nums.length; i++){
            if(i != maxIndex && nums[i] * 2 > nums[maxIndex])
                return -1;
        }
                    
        return maxIndex;
        
    }
}
