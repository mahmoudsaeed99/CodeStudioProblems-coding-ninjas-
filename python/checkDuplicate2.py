# -*- coding: utf-8 -*-
"""
Created on Tue Dec 20 19:23:32 2022

@author: Mahmoud Saeed
"""

def checkDuplicate(arr, n, k):   
    d = {}
    for i in range(len(arr)):
        if arr[i] in d.keys():
            l = i - d.get(arr[i])
            if l <= k:
                return True
        d[arr[i]] = i
    return False  


arr = [76, 79, 79, 47, 22, 82, 37, 70, 89, -2]
n = len(arr)
k = 7

r = checkDuplicate(arr, n, k)

print(r)
