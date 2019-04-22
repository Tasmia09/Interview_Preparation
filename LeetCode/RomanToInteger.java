package leetode;
import java.util.Hashtable;
import java.util.Scanner;

public class RomanToInteger {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter :");
		String roman = s.nextLine();
		int val = 0;
		Hashtable<Character,Integer> roman_hash = new Hashtable<Character,Integer>() {{
		    put('I', 1);
		    put('V', 5);
		    put('X', 10);
		    put('L', 50);
		    put('C', 100);
		    put('D', 500);
		    put('M', 1000);
		 }};
		 
		 for(int i = 0; i < roman.length(); i++) {			    
			if(i < roman.length()-1 
			&&((roman.charAt(i) == 'I' && (roman.charAt(i+1) == 'V' || roman.charAt(i+1) == 'X'))
			||(roman.charAt(i) == 'X' && (roman.charAt(i+1) == 'L' || roman.charAt(i+1) == 'C'))
			||(roman.charAt(i) == 'C' && (roman.charAt(i+1) == 'D' || roman.charAt(i+1) == 'M'))))
			{
				val = roman_hash.get(roman.charAt(++i))-roman_hash.get(roman.charAt(i-1))+val;						    			    		
			}
			else
				val = roman_hash.get(roman.charAt(i))+val;
		}
		 
		 System.out.println(val);
	}
}
