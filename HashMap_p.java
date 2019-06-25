import java.util.*;

public class HashMap_p{
	public static void main(String [] args){
		HashMap_List();
		
	}
	
	public static void HashMap_Basic(){
		HashMap <Integer, Integer> hm = new HashMap<>();
		
		hm.put(1,11);
		hm.put(1,12);
		hm.put(2,21);
		hm.put(2,22);
		hm.put(3,31);
		hm.put(3,32);
		
		hm.put(4, hm.getOrDefault(4,40)+1);
		hm.put(4, hm.getOrDefault(4,40)+1);
		
		for(int i = 0; i < 2; i++){
			if(hm.get(5) == null){
				hm.put(5,51);
			}else{
				hm.put(5, hm.get(5)+1);
			}
		}
		
		//iterate over keys
		for (Integer key : hm.keySet()) {
			System.out.println(key);
		}
		
		//iterate the values
		for (Integer val : hm.values()) {
			System.out.println(val);
		}
		
		//iterate over the pair
		for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			Integer key = entry.getKey();
			Object value = entry.getValue();
			System.out.println(key + "--"+value);
		}
	}
	
	public static void HashMap_List(){
		HashMap <Integer, List<Integer>> hm = new HashMap<>();
		
		List<Integer> arr = new ArrayList<>();
		arr.add(11);
		arr.add(12);
		hm.put(1,arr);
		
		List<Integer> arr1 = new ArrayList<>();
		arr1.add(21);
		arr1.add(22);
		hm.put(2,arr1);
		
		List<Integer> arr2 = new ArrayList<>();
		arr2.add(31);
		arr2.add(32);
		hm.put(3,arr2);
		
		
		
		//hm.put(4, hm.getOrDefault(4,40)+1);
		//hm.put(4, hm.getOrDefault(4,40)+1);
		
		for(int i = 0; i < 2; i++){
			if(hm.get(5) == null){
				List<Integer> arr3 = new ArrayList<>();
				arr3.add(51);
				hm.put(5,arr3);
			}else{
				List<Integer> temp = hm.get(5);
				temp.add(52);
				hm.put(5, temp);
			}
		}
		
		//iterate over keys
		for (Integer key : hm.keySet()) {
			System.out.println(key);
		}
		
		//iterate the values
		for (List<Integer> val : hm.values()) {
			System.out.println(Arrays.toString(val.toArray()));
		}
		
		//iterate over the pair
		/*for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			Integer key = entry.getKey();
			Object value = entry.getValue();
			System.out.println(key + "--"+value);
		}*/
		
		String[] arr6 = {"6","6"};
		System.out.println(Arrays.toString(arr6));
	}
}
