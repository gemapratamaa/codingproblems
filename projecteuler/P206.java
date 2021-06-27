import java.util.*;
import java.util.concurrent.TimeUnit;
public class P206 {
	public static void main(String[] args) {
		long startTime = System.nanoTime();

		for (long a = 0; a <= 9; a++) {
			for (long b = 0; b <= 9; b++) {
				for (long c = 0; c <= 9; c++) {
					for (long d = 0; d <= 9; d++) {
						for (long e = 0; e <= 9; e++) {
							for (long f = 0; f <= 9; f++) {
								for (long g = 0; g <= 9; g++) {
									for (long h = 0; h <= 9; h++) {
										for (long i = 0; i <= 9; i++) {
											long target = 0; 
											target += 1L * 1000000000000000000L;
											target += a * 100000000000000000L;
											target += 2L * 10000000000000000L;
											target += b * 1000000000000000L;
											target += 3L * 100000000000000L;
											target += c * 10000000000000L;
											target += 4L * 1000000000000L;
											target += d * 100000000000L;
											target += 5L * 10000000000L;
											target += e * 1000000000L;
											target += 6L * 100000000L;
											target += f * 10000000L;
											target += 7L * 1000000L;
											target += g * 100000L;
											target += 8L * 10000L;
											target += h * 1000L;
											target += 9L * 100L;
											target += i * 10L;
											
											//System.out.println(target);

											boolean zz = (a==b)&&(b==c)&&(c==d)&&(d==e)&&(e==f)&&(f==g)&&(g==h)&&(h==i);

											if (isPerfectSquare((double) target)) {
												System.out.println("target: " + target);
												System.out.println("root: " + (long) Math.sqrt(target));
												//System.out.println(target);
											}
										}	
									}
								}
							}
						}
					}
				}
			}
		}
		long endTime = System.nanoTime();
    	long durationInNano = (endTime - startTime); 
		long durationInMillis = TimeUnit.NANOSECONDS.toMillis(durationInNano);  //Total execution time in nano seconds
     
		System.out.println("Elapsed time: " + durationInMillis + " ms");
	}

	public static boolean isPerfectSquare(double x) { 
          
        // Find floating point value of 
        // square root of x. 
        double sr = Math.sqrt(x); 
      
        // If square root is an integer 
        return ((sr - Math.floor(sr)) == 0); 
    } 
	
}
