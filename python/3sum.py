# -*- coding: utf-8 -*-
"""
Created on Tue Dec 13 12:09:54 2022

@author: Mahmoud Saeed
"""
"""
problem link :

    
https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/
content/118509/offering/1376558
"""

def findTriplets(arr, n, k):
    found = False
    r = []
    arr.sort()
    for i in range(n):
        s = i+1
        e = n-1
        t = k - arr[i]
        while s < e:
            if arr[s] + arr[e] < t:
                s += 1
            elif arr[s] + arr[e] > t:
                e -= 1
            else:
                # f = arr[s]
                # b = arr[e]
                r.append([arr[i] , arr[s] , arr[e]])
                while (s < e) and (arr[s] == arr[s+1]): s += 1
                while (s < e) and (arr[e] == arr[e-1]): e -= 1
                s +=1
                e -= 1
                print(s , e)
                
        
        while (i+1 < n) and (arr[i] == arr[i+1]): i += 1
        print(i)
    return r
    
    
arr = [1 ,2 ,3 ,1, 2 ,3]
n = len(arr)
k = 6
r = findTriplets(arr, n, k)
print(r)


    