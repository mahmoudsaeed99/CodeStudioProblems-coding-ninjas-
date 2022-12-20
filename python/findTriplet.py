# -*- coding: utf-8 -*-
"""
Created on Mon Dec 12 12:50:06 2022

@author: Mahmoud Saeed
"""

"""
problem link :

    
https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/
content/118509/offering/1376557

"""

def findTriplet(arr,n):
    s = set(arr)
    ans = []
    for i in range(0 , n-1):
        for j in range(i+1 , n):
            r = arr[i] + arr[j]
            if r in s:
                return True
    return False

arr = [1, 2, 3, 1, 2, 3]
n = len(arr)

r = findTriplet(arr, n)
print(r)












