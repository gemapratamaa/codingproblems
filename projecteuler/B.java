import java.math.BigInteger;
import java.util.*;

public class B { 

    public static BigInteger leastPrimeFactor(BigInteger n) { 

		BigInteger[] least_prime = new BigInteger[n+1]; 
		BigInteger sum = new BigInteger("0");
  
        // We need to print 1 for 1. 
        least_prime[1] = 1; 
  
        for (int i = 2; i <= n; i++) { 

            if (least_prime[i] == 0) { 

                least_prime[i] = i; 
  
                for (int j = 2*i; j <= n; j += i) 
                    if (least_prime[j] == 0) 
                        least_prime[j] = i; 
            } 
        } 
  

        for (int i = 2; i <= n; i++) {
			Long lpf = Long.valueOf(least_prime[i]);
			BigInteger summand = BigInteger.valueOf(lpf);
			sum = sum.add(summand);
		}
		return sum;
    } 
    public static void main (String[] args) { 
		BigInteger n = new BigInteger("1000000000000");
        System.out.println(leastPrimeFactor(n));
    } 
} 
  

