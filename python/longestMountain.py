# -*- coding: utf-8 -*-
"""
Created on Fri Dec  9 10:51:05 2022

@author: Mahmoud Saeed
"""
"""
problem link :

    
https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/
content/118509/offering/1376554
"""

arr = [1 ,3, 1, 4 ,3, 1]
n = len(arr)

def longestMountain(arr , n):
    if n < 3:
        return 0
    i = 0
    k = 0
    while i < n:
        j = i
        if (j+1 < n) and (arr[j] < arr[j+1]):
            while (j+1 < n) and (arr[j] < arr[j+1]):
                j +=1
       
            if (j+1 < n) and (arr[j] > arr[j+1]):
                while (j+1 < n) and (arr[j] > arr[j+1]):
                    j +=1
            
                k = max(k, j - i +1)
    
        i = max(j ,i+1)   

    return k
     

    
m = longestMountain(arr, n)     

print(m)    