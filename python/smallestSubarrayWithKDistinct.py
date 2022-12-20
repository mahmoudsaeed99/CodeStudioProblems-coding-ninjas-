# -*- coding: utf-8 -*-
"""
Created on Sun Dec 18 11:44:32 2022

@author: Mahmoud Saeed
"""

def smallestSubarrayWithKDistinct(arr, k: int):
    r = []
    if len(set(arr)) < k:
        print(-1)
        return []
    for i in range(len(arr)-k+1):
        l = set()
        l.add(arr[i])
        j = i
        for j in range(i , len(arr)):
            # print(l)
            if (arr[j] not in l) and (len(l) < k):
                l.add(arr[j])
            if len(l) == k:
                r.append([i,j]) 
                break           
        if len(l) == k:
            r.append([i,j])
    n = 0
    for i in range(1 , len(r)):
        if (r[n][1] -r[n][0]) > (r[i][1] -r[i][0]):
            n = i
    return r[n]
        
arr = [2]
k = 1
r = smallestSubarrayWithKDistinct(arr, k)

print(r)


