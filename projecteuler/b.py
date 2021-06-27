def leastPrimeFactor(n) : 
	total = 0
	least_prime = [0] * (n + 1) 
	least_prime[1] = 1
  
	for i in range(2, n + 1) : 

		if (least_prime[i] == 0) : 
			  
			least_prime[i] = i 

			for j in range(2 * i, n + 1, i) : 
				if (least_prime[j] == 0) : 
					least_prime[j] = i 
		  
		  
	for i in range(1, n + 1): 
		total += least_prime[i]
		  
	return total - 1

n = 10**12
print(leastPrimeFactor(n))