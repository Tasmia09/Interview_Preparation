package leetode;
public class removeElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			int [] nums = {0,1,2,2,3,0,4,2};
			int val = 2;
			// nums is passed in by reference. (i.e., without making a copy)
			int len = removeElement(nums, val);

			// any modification to nums in your function would be known by the caller.
			// using the length returned by your function, it prints the first len elements.
			for (int i = 0; i < len; i++) {
			    System.out.println(nums[i]);
			} 

		}
	
	public static int removeElement(int [] nums, int val) {
		int j = 0;
		if(nums.length == 0)
			return 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] != val) {
				nums[j] = nums[i];
				j++;
			}
		}
		return j;
	}

	}


