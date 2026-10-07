def solution(n):
    i = 1
    while(i**2 <= n):
        i += 1
    if (i-1)**2 == n:
        return i**2
    else:
        return -1
