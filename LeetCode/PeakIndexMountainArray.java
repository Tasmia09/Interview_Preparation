
class PeakIndexMountainArray {
    public int peakIndexInMountainArray(int[] A) {
        for(int i = 1; i <= A.length-2; i++)
            if(A[i] > A[i-1] && A[i] > A[i+1])
                return i;
        
        return -1;
    }
}
