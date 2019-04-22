package leetode;
import java.util.Scanner;

public class palindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter :");
		int num = s.nextInt();
		int const_num = num;
		int current, rev_num = 0;
		if(num < 0 || (num % 10 == 0 && num != 0)) {
			System.out.println("false");
			return;
		}
			
		while(num != 0) {
			current = num%10;
			rev_num = rev_num * 10 + current;
			num = num/10;
		}
		
		if(rev_num == const_num)
			System.out.println("true");
		else
			System.out.println("false");
		
		
		/*// Special cases:
        // As discussed above, when x < 0, x is not a palindrome.
        // Also if the last digit of the number is 0, in order to be a palindrome, 
        // the first digit of the number also needs to be 0.
        // Only 0 satisfy this property.
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        
        int revertedNumber = 0;
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        
        // When the length is an odd number, we can get rid of the middle digit by revertedNumber/10
        // For example when the input is 12321, at the end of the while loop we get x = 12, revertedNumber = 123, 
        // since the middle digit doesn't matter in palidrome(it will always equal to itself), we can simply get rid of it.
        return x == revertedNumber || x == revertedNumber/10;*/
	}

}
