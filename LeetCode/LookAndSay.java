class LookAndSay{
	public static void main(String [] args){
		System.out.println(LookAndSay(5));
	}
	
	static String LookAndSay(int n){
		if (n==1) return "1";
		if (n==2) return "11";
		
		String str = "11";
		for(int i = 3; i <= n; i++){
			str += "$";
			String temp = "";
			int count = 1;
			for(int index = 1; index < str.length(); index++){
				if(str.charAt(index) == str.charAt(index - 1)){
					
					count++;
					System.out.println("current cnt: "+count);
				}
				else{
					temp = temp + count + str.charAt(index - 1);
					System.out.println("current tmp: "+temp);
					count = 1;
				}
			}
			str = temp;
			System.out.println("current str: "+str);
		} 
		return str;
	}
}
