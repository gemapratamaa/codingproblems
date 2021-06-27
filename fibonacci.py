import datetime

def fibonacci_dp(n):
	fib = [0] * (n + 2)
	fib[0] = 0
	fib[1] = 1

	for i in range(2, n + 1):
		fib[i] = fib[i - 1] + fib[i - 2]

	return fib[n]

def fibonacci_rec(n):
	if n == 0:
		return 0
	if n == 1:
		return 1
	else:
		return fibonacci_rec(n - 1) + fibonacci_rec(n - 2)

def fibonacci_iter(n): 
	a = 0
	b = 1
	if n < 0: 
		print("Incorrect input") 
	elif n == 0: 
		return a 
	elif n == 1: 
		return b 
	else: 
		for i in range(2,n+1): 
			c = a + b 
			a = b 
			b = c 
		return b 

def fibonacci_magic(n) : 
	phi = (1 + 5**0.5) / 2
	return round(phi**n / 5**0.5)

  
  
N = int(input(">>> N = "))

print("[DP] ", end='')
start_time = datetime.datetime.now()
print(fibonacci_dp(N), end=' ')
end_time =  datetime.datetime.now()
elapsed = (end_time - start_time).total_seconds() * 1000
print("\nTime: {} ms".format(elapsed))

print("[Iter] ", end='')
start_time = datetime.datetime.now()
print(fibonacci_iter(N), end=' ')
end_time =  datetime.datetime.now()
elapsed = (end_time - start_time).total_seconds() * 1000
print("\nTime: {} ms".format(elapsed))
"""
print("[Rec] ", end='')
start_time = datetime.datetime.now()
print(fibonacci_rec(N), end=' ')
end_time =  datetime.datetime.now()
elapsed = (end_time - start_time).total_seconds() * 1000
print("\nTime: {} ms".format(elapsed))
"""
print("[Magic] ", end='')
start_time = datetime.datetime.now()
print(fibonacci_magic(N), end=' ')
end_time =  datetime.datetime.now()
elapsed = (end_time - start_time).total_seconds() * 1000
print("\nTime: {} ms".format(elapsed))