package leetode;
public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] strs = {};
		System.out.println(longestCommonPrefix(strs));
	}
	
	public static String longestCommonPrefix(String[] strs) {
	    if (strs.length == 0) return "";
	    String prefix = strs[0];
	    for (int i = 1; i < strs.length; i++) {
	        while (strs[i].indexOf(prefix) != 0)
	        {	System.out.println("prefix.indexOf(strs[i]) : " + prefix + " "+ strs[i]+" "+strs[i].indexOf(prefix));

	            prefix = prefix.substring(0, prefix.length() - 1);
	            System.out.println(prefix);
	            if (prefix.isEmpty()) return "";
	        } 
	    }
	    return prefix;
	}

}
