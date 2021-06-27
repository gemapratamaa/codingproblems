import java.util.*;
import java.util.concurrent.TimeUnit;

public class A {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
 
		
		int total = 0;
		for (int i = 1; i < 10000; i++) {
			if (allPrime(i)) {
				total += i;
			}
		}
		
		//ArrayList<Integer> d = divisors(100);
		//Collections.sort(d);
		//System.out.println(d);
		System.out.println("Total: " + total);

		long endTime = System.nanoTime();
    	long durationInNano = (endTime - startTime); 
		long durationInMillis = TimeUnit.NANOSECONDS.toMillis(durationInNano);  //Total execution time in nano seconds
     
		System.out.println("Elapsed time: " + durationInMillis + " ms");
	}

	public static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}
		int i = 2;
		while (i * i <= n) {
			if (n % i == 0) {
				return false;
			}
			i += 1;
		}
		return true;
	}

	public static ArrayList<Integer> divisors(int n) {
		ArrayList<Integer> divisors = new ArrayList<Integer>();
		int i = 1;
		while (i <= Math.sqrt(n)) {
			if (n % i == 0) {
				if (n / i == i) {
					divisors.add(i);
				} else {
					divisors.add(i);
					divisors.add(n/i);
				}
				
			}
			i += 1;
		}

		Set<Integer> set = new LinkedHashSet<>(); 
  
        set.addAll(divisors); 
        divisors.clear(); 
        divisors.addAll(set); 
  
        return divisors; 

	}

	public static boolean allPrime(int n) {
		boolean zz = true;
		for (Integer divisor : divisors(n)) {
			int target = divisor + (n / divisor);
			if (isPrime(target) == false) {
				zz = false;
			}
		}
		return zz;
	}

}

