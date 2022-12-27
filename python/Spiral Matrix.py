# -*- coding: utf-8 -*-
"""
Created on Sun Dec 25 11:36:12 2022

@author: Mahmoud Saeed
"""

"""
    
https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/
content/118509/offering/1376560
"""




def spiralPathMatrix(matrix, n, m):
    t = 0
    b = n-1
    r = m-1
    l = 0
    res = []
    while(True):
        
        for i in range(l,r+1):
            res.append(matrix[t][i])
        t +=1
        if (l > r) or (t > b):
            break
        
        for i in range(t , b +1):
            res.append(matrix[i][r])
        r -= 1
        if (l > r) or (t > b):
            break
        
        for i in range(r,l-1,-1):
            
            res.append(matrix[b][i])
        b -=1
        if (l > r) or (t > b):
            break
        
        for i in range(b,t-1 , -1):
            
            res.append(matrix[i][l])
        l +=1
        if (l > r) or (t > b):
            break
    return res


     
mat = [[5 ,6 ,7 ,8], 
[9 ,10, 11 ,12],
[13, 14, 15 ,16]]

r = spiralPathMatrix(mat, 3, 4)
