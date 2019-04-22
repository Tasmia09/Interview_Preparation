package leetode;

public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,3,4,10,40};
		System.out.println(searchInsert(arr, -1));

	}
	
public static int searchInsert(int[] nums, int target) {
	
	int left = 0, right = nums.length-1;
	
	while(left<=right) {
		System.out.printf("left: %d\tright: %d\n", left, right);
		
		int middle = (left+right)/2;
		
		if(nums[middle] == target)
			return middle;
		else if(target <nums[middle])
			right = middle -1;
		else
			left = middle + 1; 
		System.out.printf("left: %d\tright: %d\n", left, right);
	}
	
        return left;
    }

}
