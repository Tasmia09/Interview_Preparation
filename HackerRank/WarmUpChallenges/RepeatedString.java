import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
    	int counter = 0;
    	int extra_counter = 0;
    	long total_substring = n/s.length();
    	int left_substring = (int)(n - (total_substring*s.length()));
    	for(int i = 0; i<s.length();i++) {
    		if(s.charAt(i) == 'a')
    			counter++;
    		if(i < left_substring && s.charAt(i) == 'a')
    			extra_counter++;
    		
    	}
    	
    	
    	return total_substring * counter + extra_counter;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);
        System.out.println(result);

        /*bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();*/

        scanner.close();
    }
}
