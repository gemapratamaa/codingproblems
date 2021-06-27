
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Problem518 {

	public static ArrayList<Integer> sieveOfEratosthenes(int n) {
		boolean prime[] = new boolean[n + 1];
		Arrays.fill(prime, true);
		for (int p = 2; p * p <= n; p++) {
			if (prime[p]) {
				for (int i = p * 2; i <= n; i += p) {
					prime[i] = false;
				}
			}
		}
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
		primeNumbers.add(2);
		for (int i = 3; i <= n; i += 2) {
			if (prime[i]) {
				primeNumbers.add(i);
			}
		}
		return primeNumbers;
	}

	static final int MAX_SIZE = 100000001; 
    static Vector<Boolean>isprime = new Vector<>(MAX_SIZE); 
    static Vector<Integer>prime = new Vector<>(); 
    static Vector<Integer>SPF = new Vector<>(MAX_SIZE); 
       
    static void manipulated_seive(int N) { 

        isprime.set(0, false); 
        isprime.set(1, false); 
          

        for (int i=2; i<N ; i++) { 
            if (isprime.get(i)) { 
                prime.add(i); 
                SPF.set(i,i); 
            } 
       
            for (int j=0; 
                 j < prime.size() && 
                 i*prime.get(j) < N && prime.get(j) <= SPF.get(i); 
                 j++) { 
                isprime.set(i*prime.get(j),false); 
                SPF.set(i*prime.get(j),prime.get(j)) ; 
            } 
        } 
    } 

	public static void main(String[] args) {
		long startTime = System.nanoTime();

		//int n = 10000 * 10000;
		/*
		int n = 40000;
		
		*/
		int N = 100 ; // Must be less than MAX_SIZE 
          
        for (int i = 0; i < MAX_SIZE; i++){ 
            isprime.add(true); 
            SPF.add(2); 
		} 
		manipulated_seive(N); 
		//for (int i=0; i<prime.size() && prime.get(i) <= N ; i++) {
		//	System.out.print(prime.get(i) + " "); 
		//}
		
		int total = 0;
		for (int c = 0; c < prime.size(); c++) {
			for (int b = 0; b < c; b++) {
				for (int a = 0; a < b; a++) {
					double cx = prime.get(c) + 1;
					double bx = prime.get(b) + 1;
					double ax = prime.get(a) + 1;
					
					boolean syarat = bx/ax == cx/bx;				
					if (syarat) {
						//System.out.println(primes.get(a) + " " + primes.get(b) + " " + primes.get(c));
						total += prime.get(a) + prime.get(b) + prime.get(c);
					}
				}
			}
		}
		//System.out.println(prime);

		System.out.println(total);

		long endTime = System.nanoTime();
    	long durationInNano = (endTime - startTime); 
		long durationInMillis = TimeUnit.NANOSECONDS.toMillis(durationInNano);
		System.out.println("Elapsed time: " + durationInMillis + " ms");
		
	}
	
	
}
