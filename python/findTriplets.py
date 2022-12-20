# -*- coding: utf-8 -*-
"""
Created on Sat Dec 10 10:38:32 2022

@author: Mahmoud Saeed
"""
from os import *
from sys import *
from collections import *
from math import *

from sys import stdin, stdout, setrecursionlimit




def findTriplets(arr, n):
    found = False
    lis = []
    for i in range(n - 1):
 
        # Find all pairs with sum
        # equals to "-arr[i]"
        s = set()
        for j in range(i + 1, n):
            x = -(arr[i] + arr[j])
            if x in s:
                lis.append([x , arr[i] , arr[j]])
            else:
                s.add(arr[j])
    return lis
        





# arr = [-10 ,5 ,5, -5, 2]
# arr = [1, 2, 3, -1, -2, -3]
# arr = [1, 2 ,3 ,4 ]
arr = [67 ,70, 72, -3, -78 ,-76, 58, -49, 26, 90 ,-78, 2, -72, -91, 5, 46, 78 ,20, -17 ,-44]
n = len(arr)
# findTriplets(arr, n)
found = False
lis = []
arr.sort()
for i in range(n-1):
    l = i+1
    r = n-1
    a = arr[i]
    while(l < r):
        if a + arr[l] + arr[r] == 0:
            lis.append([a , arr[l] , arr[r]])
            l +=1
            r -=1
            found = True            
        elif a + arr[l] + arr[r] < 0:
            l +=1
        else:
            r -=1
    

if not found:
        print("-1")
print(lis)
       
    
        