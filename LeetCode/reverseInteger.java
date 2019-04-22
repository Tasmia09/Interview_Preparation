package leetode;
import java.util.*;
public class reverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter :");
		int num = s.nextInt();
		
		 boolean negativeFlag = false;
	        if (num < 0)
	        {
	            negativeFlag = true;
	            num = -num ;
	        }
	      
	        int prev_rev_num = 0, rev_num = 0;
	        while (num != 0)
	        {
	            int curr_digit = num%10;
	            rev_num = rev_num * 10 + curr_digit;
	            
	            if((rev_num-curr_digit)/10 != prev_rev_num) {
	            	System.out.println("WARNING OVERFLOWED!!!");
	            	return;
	            }
	            
	            num = num/10;	        
	            prev_rev_num = rev_num;	        
	        }
	      
	        if (negativeFlag == true)
	        	System.out.println(-rev_num);
	        else
	        	System.out.println(rev_num);
	        
	        
	        /*int flag = 0;
	        
			if (x < 0) {
				flag = 1;
				x = x * -1;
			}
	        int length = String.valueOf(x).length();
			int [] arr = new int [length];
			for(int i = length; i > 0; i--) {
				int val = (int)(x/Math.pow(10, i-1));
				x = (int) (x % Math.pow(10, i-1));
				arr[i-1] = val;
			}
			
			StringBuilder strNum = new StringBuilder();

			for (int n : arr) 
			{
			     strNum.append(n);
			}
	        long finalInt = Long.parseLong(strNum.toString());
	        
	        if(flag == 1)
	            finalInt = -1 * finalInt;
	        
			if(finalInt > Integer.MAX_VALUE || finalInt < Integer.MIN_VALUE) 
				return 0;
	        
	        return (int)finalInt;*/
		
	}

}
