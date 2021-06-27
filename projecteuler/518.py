# 518
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

def S(n: int): 
	total = 0
	for a in range(1, n, 2):
		for b in range(1, a, 2):
			for c in range(1, b, 2):
				syarat1 = is_prime(a) and is_prime(b) and is_prime(c)
				syarat2 = c < b < a < n
				syarat3 = (b+1)/(a+1) == (c+1)/(b+1)
				if syarat1 and syarat2 and syarat3:
					total += (a + b + c)
					
	return total
def main():
	start = time.time()
	print(S(100))
	end = time.time()
	print("Time: {} ms".format((end - start) * 1000))


if __name__ == "__main__":
	main()