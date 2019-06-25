package leetode;
import java.util.*;

public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter :");
		String paren = s.nextLine();
		
		int flag = 0;
		
		if (paren.length() == 0) {
			System.out.println("true"); 
			return;
	}
		
		Hashtable <Character, Character> ht = new Hashtable<Character,Character>(){{
			put('{', '}');
			put('(',')');
			put('[',']');
		}};
        Stack<Character> stack = new Stack<Character>();
		
		for(int i = 0; i < paren.length(); i++) {
			if(paren.charAt(i) == '}' || paren.charAt(i) == ']' 
			|| paren.charAt(i) == ')') {
				flag = 1;
				if (stack.isEmpty()) {
					System.out.println("false"); 
					return;
				}
				if(paren.charAt(i) == ht.get(stack.pop())) 
					continue;
				else {
					System.out.println("false"); 
					return;}
			}
			else {
				stack.push(paren.charAt(i));
			}
			
			if (flag == 0 || !stack.isEmpty())
			System.out.println("false");
		else
			System.out.println("true");
				
		}
		}
		
		
	}


