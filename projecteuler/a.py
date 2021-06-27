import math
import time

def is_prime(n):
	if n == 1:
		return False
	i = 2
	while i*i <= n:
		if n % i == 0:
			return False
		i += 1
	return True

#primes = [2,3,5,7,11,12]
#for p in primes:
	#print(is_prime(p))

def divisors(n):
	divisors = set()
	i = 1
	while i <= math.sqrt(n): 
		if n % i == 0 : 
			if n / i == i : 
				divisors.add(i)
			else : 
				divisors.add(int(i))
				divisors.add(int(n/i))
		i += 1
	
	return list(divisors)

#print(divisors(16))

number = 30



def allprime(n):
	zz = True
	for divisor in divisors(n):
		
		target = divisor + (n/divisor)
		
		if not is_prime(target):
			zz = False

	return zz

print(allprime(30))

def main():
	start = time.time()
	
	
	total = 0
	for i in range(1, 10000):
		if allprime(i):
			total += i
	

	print(total)
	end = time.time()
	print("Time: {} ms".format((end - start) * 1000))

if __name__ == "__main__":
	main()
