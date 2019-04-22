package leetode;
import java.util.*;

public class Sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(mySqrt(2147395600));

	}
	
public static int mySqrt(int x) {
		long i = 0;
		while(i*i <= x) {
			i++;
		}
		return (int)i - 1;
    }

}
