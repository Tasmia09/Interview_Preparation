package leetode;
public class ImplementstrStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strStr("mississippi", "issip"));
	}
	
	public static int strStr(String haystack, String needle) {
		if(needle.isEmpty())
			return 0;
		int j = 0, index =0;	
		for(int i = 0; i< haystack.length(); i++) {	
			if(haystack.charAt(i) == needle.charAt(j)) {
				if(j == 0) {
					index = i;
				}
				j++;				
				if(j == needle.length())
					return index;
			}else {
				if(j!=0)
					i = index;
				j = 0;
			}		
		}
		return -1;
	}

}
