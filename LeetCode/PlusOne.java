package leetode;
public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] test = {9,9,9};
		test = plusOne(test);
		for (int i = 0; i < test.length; i++)
			System.out.println(test[i]);
		
	}
public static int[] plusOne(int[] digits) {
	if(digits==null||digits.length==0)
        return new int[0];
 
    int carry = 1;    
    for(int i=digits.length-1; i>=0; i--){
        int sum = digits[i]+carry;
        if(sum>=10){
            carry=1;
        }else{
            carry=0;
        }
        digits[i]=sum%10;
    }
 
    if(carry==1){
        int[] result = new int[digits.length+1];
        System.arraycopy(digits, 0, result, 1, digits.length);
        result[0]=1;
        return result;
    }else{
        return digits;
    }
    }

}
