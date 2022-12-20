# -*- coding: utf-8 -*-
"""
Created on Sat Dec 10 10:38:32 2022

@author: Mahmoud Saeed
"""

"""
problem link :

    
https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/
content/118509/offering/1376555
"""

from os import *
from sys import *
from collections import *
from math import *

from sys import stdin, stdout, setrecursionlimit


def findTriplets(arr, n):
    found = False
    lis = []
    arr.sort()
    for i in range(n-1):
        l = i+1
        r = n-1
        a = arr[i]
        while(l < r):
            if a + arr[l] + arr[r] == 0:
                lis.append([ arr[l] , arr[r] , arr[i]])
                l +=1
                r -=1
                found = True            
            elif a + arr[l] + arr[r] < 0:
                l +=1
            else:
                r -=1


    
    return lis
    
        