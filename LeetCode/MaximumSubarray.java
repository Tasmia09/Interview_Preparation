package leetode;
public class MaximumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum contiguous sum is " +
        		maxSubArray(a));
	}
	
	public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE, sum = 0;
	
	for(int i = 0; i < nums.length; i++) {
		sum = sum + nums [i];
        if(sum > max)
			max = sum;
		if(sum < 0)
			sum = 0;
		
	}
	
    return max;  
      
    }

}
