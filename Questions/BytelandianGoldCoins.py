
from cgitb import lookup
from math import floor


lookup = {}
def solve(n: int) -> int:
    
    if n <= 3:
        return n
    
    if n not in lookup:
        lookup[n] = floor(n/2) + floor(n/3) + floor(n/4)
    
    return lookup[n]

if __name__ == "__main__":
    print(solve(2))

# q from http://www.spoj.com/problems/COINS/