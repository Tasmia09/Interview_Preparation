import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
    	Hashtable <Integer, Integer> ht = new Hashtable<Integer, Integer>();
    	int i=0, pairCounter = 0;
    	
    	
    	Set<Integer> unique = removeDupInIntArray(ar);
    	for(int x: ar) {
    		if(ht.get(x) == null)
    			ht.put(x,0);
    		ht.put(x, ht.get(x)+1);
    	}
    	for(int s : unique) {
    		
    		pairCounter += ht.get(s)/2;
    	}
    	return pairCounter;

    }
    
    public static Set<Integer> removeDupInIntArray(int[] ints){
        Set<Integer> setString = new LinkedHashSet<Integer>();
        for(int i=0;i<ints.length;i++){
            setString.add(ints[i]);
        }
        return setString;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
    	
    	
    	
        int n = scanner.nextInt();
	    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }
        

        int result = sockMerchant(n, ar);
        System.out.println(result);

       

        scanner.close();
    }
}
