package leetode;

public class LengthofLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLastWord(" "));
	}
	
public static int lengthOfLastWord(String s) {
	
	int count = 0;
	for(int i = s.length(); i > 0; i--) {		
        
        if(s.charAt(i-1) != ' ') {
        	count++;
        }else if(s.charAt(s.length()-1) == ' ' && count == 0){
        	continue; 
        }else {
        	break;
        }
        	
        }	
    
	return count;
}
}
