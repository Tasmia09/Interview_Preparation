
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountingValley {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
    	int pre_step,curr_step = 0;
    	
    	int valleycount = 0;
    	for(int i = 0; i<n; i++) {
    		pre_step = curr_step;
    		if(s.charAt(i) == 'D')
    			curr_step--;
    		else if(s.charAt(i)=='U')
    			curr_step++;
    		if(pre_step == 0 && curr_step == -1)
    			valleycount++;
    	}	
    	
    	return valleycount;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);
        System.out.println(result);

        /*bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();*/

        scanner.close();
    }
}
