package leetode;
import java.util.*;
public class MinimumIndexSumofTwoLists {
	public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap <String, Integer> ht = new HashMap<String, Integer>();
        ArrayList <String> ar = new ArrayList <String>();
        for(int i = 0; i < list1.length; i++){
            ht.put(list1[i], i);
        }
        int min = list1.length+list2.length;
        for(int i = 0; i < list2.length; i++){
            if(ht.containsKey(list2[i]) && (i+ht.get(list2[i])) <= min){
                if((i+ht.get(list2[i])) == min)
                    ar.add(list2[i]);
                else{
                    ar.clear();
                    ar.add(list2[i]);
                    min = i+ht.get(list2[i]);
                }
            }
        }
        
        return ar.toArray(new String[ar.size()]);
    }
}
