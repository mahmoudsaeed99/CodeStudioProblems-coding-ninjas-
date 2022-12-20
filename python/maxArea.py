# -*- coding: utf-8 -*-
"""
Created on Tue Dec 20 18:06:21 2022

@author: Mahmoud Saeed
"""

"""
problem link :

    
https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/
content/118509/offering/1376556
"""

def maxArea( A):
    l = 0
    r = len(A) -1
    area = 0
     
    while l < r:
        # Calculating the max area
        area = max(area, min(A[l],
                        A[r]) * (r - l))
     
        if A[l] < A[r]:
            l += 1
        else:
            r -= 1
    return area