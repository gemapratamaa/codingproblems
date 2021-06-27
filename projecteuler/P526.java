import java.util.concurrent.TimeUnit;

public class P526 {

	public static void main(final String[] args) {
		final long startTime = System.nanoTime();

	
		print(h(10000000000000000L));
		final long endTime = System.nanoTime();
    	final long durationInNano = (endTime - startTime); 
		final long durationInMillis = TimeUnit.NANOSECONDS.toMillis(durationInNano);
		System.out.println("Elapsed time: " + durationInMillis + " ms");
	}

	public static void print(final Object o) {
		System.out.println(o);
	}

	public static long f(long n) {  
		if (n <= 1) {  
		 return 0;  
		} else {  
			int div = 2;  
			while (div < n) {  
				if (n % div != 0) {  
		   			div++;  
		  		} else {  
		   			n = n / div;  
		   			div = 2;  
		  		}  
		 	}  
		return n;  
		}  
	}

	public static long g(final long n) {
		return f(n) + f(n+1) + f(n+2) + f(n+3) + f(n+4) + f(n+5) + f(n+6) + f(n+7) + f(n+8);
	}

	public static long h(final long n) {
		long maxVal = 0;

		for (int k = 2; k <= n; k++) {
			if (g(k) > maxVal) {
				maxVal = g(k);
			}
		}
		return maxVal;
	}


}