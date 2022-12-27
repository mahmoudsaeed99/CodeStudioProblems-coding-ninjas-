# -*- coding: utf-8 -*-
"""
Created on Mon Dec 26 11:38:53 2022

@author: Mahmoud Saeed
"""

"""
    
https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/
content/118821/offering/1381903
"""

def rotateMatRight(mat, n, m, k):
    res = mat
    if k % m == 0:
        return mat
    k = k % m
    c = 0
    while c < m:
        if k == m:
            k = 0
        for i in range(n):
            res[i][k] = mat[i][c]
        
        c += 1
        k += 1
     
    return res

      



