
import java.util.*;
import java.util.concurrent.TimeUnit;

class P521 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();

		//Long result = S(100);
		//int length = result.toString().length();

		print(S(1000000000000L));

		long endTime = System.nanoTime();

		long duration = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);
		System.out.println("Elapsed time: " + duration + " ms");

	}

	public static long S(long n) {
		long total = 0;
		long m = 1000000000L;
		for (int i = 2; i <= n; i++) {
			long summand = smpf(i);

			total = mod(mod(total, m) + mod(summand, m), m);
		}
		return total;
	}

	public static long mod(long a, long b) {
		return a % b;
	}

	public static void print(Object o) {
		System.out.println(o);
	}

	public static long smpf(long n) {  

		if (n % 2 == 0) {
			return 2;  
		}

		for (int i = 3; i * i <= n; i += 2) {  
			if (n % i == 0)  
				return i;  
		}  
	
		return n;  
	} 
}