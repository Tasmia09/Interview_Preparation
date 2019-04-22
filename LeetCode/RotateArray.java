
class RotateArray {
    public void rotate(int[] nums, int k) {
        int pivot = k % nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, pivot-1);
        reverse(nums, pivot, nums.length-1);
        
    }
    
    public void reverse(int[]arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
