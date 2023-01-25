# -*- coding: utf-8 -*-
"""
Created on Sat Dec 31 14:02:04 2022

@author: Mahmoud Saeed
"""

"""
problem link :

    
https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/
content/118821/offering/1381909

"""

def minSum(arr):
    l = arr.copy()
    for i in range(1,len(arr)):
        l[i][0] = min(l[i-1][1] , l[i-1][2]) + arr[i][0]
        l[i][1] = min(l[i-1][0] , l[i-1][2]) + arr[i][1]
        l[i][2] = min(l[i-1][0] , l[i-1][1]) + arr[i][2]
    n = len(arr)
    return min(min(l[n-1][0],l[n-1][1]),l[n-1][2])    
