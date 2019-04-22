package leetode;

public class AddBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addBinary("1", "11"));
	}	
	

	public static String addBinary(String a, String b) {
		StringBuilder sb = new StringBuilder();
		int carry = 0;
		
		for(int i = a.length()-1, j = b.length()-1; i >=0 || j >= 0 || carry > 0; i--, j--) {
			int temp = 0;
			
			temp += i < 0 ? 0 : a.charAt(i)-'0';
			temp += j < 0 ? 0 : b.charAt(j)-'0';
			temp += carry;
			
			switch(temp) {
				case 3:
					sb.append(1);
					carry = 1;
					break;
				case 2: 
					sb.append(0);
					carry = 1;
					break;
				case 1:
					sb.append(1);
					carry = 0;
					break;
				default:
					sb.append(0);
					carry = 0;
			}
		}
		return sb.reverse().toString();
    }

}
