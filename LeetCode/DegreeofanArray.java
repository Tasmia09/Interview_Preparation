class DegreeofanArray {
    public int findShortestSubArray(int[] nums) {
        HashMap <Integer, List<Integer>> hm = new HashMap<>();  
        for(int i = 0; i < nums.length; i++){
            if(hm.get(nums[i]) == null){
                List<Integer> arr = new ArrayList<>();
                arr.add(i);
                hm.put(nums[i], arr);
            }
            else{
                List<Integer> arr = hm.get(nums[i]);
                arr.add(i);
                hm.put(nums[i], arr);                
            }
        }
        
        List<Integer> max = null;
        for(List<Integer> list: hm.values()){
            if(max == null || list.size() > max.size())
                max = list;
            else if(list.size() == max.size()){
                if(max.get(max.size()-1)-max.get(0) > list.get(list.size()-1)-list.get(0))
                    max = list;
            }
        }
        
        return (max.get(max.size()-1)-max.get(0)) + 1;    
    }
}

/* Faster Solution
class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap <Integer, Index> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(hm.get(nums[i]) == null){
                Index ind = new Index();
                ind.lower_index = i;
                ind.occur = 1;
                hm.put(nums[i], ind);
            }
            else{
                Index ind = hm.get(nums[i]);
                ind.upper_index = i;
                ind.occur++;
            }
                
        }
        int max_occur = 0;
        int lowest_length = 1;
        for(Index m : hm.values()){
            if(m.occur > max_occur){
                max_occur = m.occur;
                lowest_length = m.upper_index - m.lower_index + 1;
            }else if(m.occur == max_occur && (m.upper_index - m.lower_index + 1 < lowest_length)){
                lowest_length = m.upper_index - m.lower_index + 1;
            }
        }
        if (max_occur == 1)
            return 1;
        
        return lowest_length;
    }
}

class Index{
    int lower_index;
    int upper_index;
    int occur;
}
*/
