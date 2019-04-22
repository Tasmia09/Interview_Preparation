package leetode;

public class removeDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums = {0,0,1,1,1,2,2,3,3,4,4,5,6,7,8};
		
		// nums is passed in by reference. (i.e., without making a copy)
		int len = removeDuplicates(nums);

		// any modification to nums in your function would be known by the caller.
		// using the length returned by your function, it prints the first len elements.
		for (int i = 0; i < len; i++) {
		    System.out.println(nums[i]);
		} 

	}
	
	public static int removeDuplicates(int [] nums) {
		if(nums.length == 0)
			return 0;
		
		int i = 0;
		for(int j = 1; j < nums.length; j++) {
			if(nums[i] != nums[j]) {
				i++;
				nums[i] = nums[j];
			}
			
		}
		return i+1;
		
		/*int temp,j = 0;
		temp = nums[0];
		
		for(int i = 1; i < nums.length;) {
			if(nums[i] == temp) {
				i++;
			}
			else {
				nums[j+1]=nums[i];
				temp = nums[i];
				j++;
			}
		}
		return j+1;*/
	}

}
