# -*- coding: utf-8 -*-
"""
Created on Tue Dec 20 17:51:19 2022

@author: Mahmoud Saeed
"""
"""
problem link :

    
https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/
content/118509/offering/1376576

"""

def switchingSubarray(arr, n): 
    s , e , r = 0,2,-1
    if n < 3:
        return n
    
    while e < n:
        if arr[e] != arr[e-2]:
            s = e-1
        e +=1
        r = max(r , e-s)
    return r

arr = [5 ,2, 3, 5, 2 ,5]

r = switchingSubarray(arr, len(arr))

print(r)
