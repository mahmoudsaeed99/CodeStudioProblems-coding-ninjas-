# -*- coding: utf-8 -*-
"""
Created on Tue Dec 20 19:17:02 2022

@author: Mahmoud Saeed
"""
"""
problem link :

    
https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/
content/118509/offering/1376578
"""

def countDistinctElements(arr, k):
    r = []
    for i in range(0,len(arr)-k+1):
        l = arr[i:i+k]
        s = set(l)
        r.append(len(s))
    return r 

    
arr = [1, 2, 1, 3, 4, 2, 3]
k = 4
r = countDistinctElements(arr, k)
print(r)
