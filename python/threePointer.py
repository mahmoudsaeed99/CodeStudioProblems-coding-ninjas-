# -*- coding: utf-8 -*-
"""
Created on Tue Dec 20 17:49:32 2022

@author: Mahmoud Saeed
"""
"""
problem link :

    
https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/
content/118509/offering/1376575
"""

def threePointer(X, Y, Z):
    i = 0
    j = 0
    k = 0
    m = 9999999
    while i < len(X) and j < len(Y) and k < len(Z):
        m = min(m , max(abs(X[i] - Y[j]) ,
                        max(abs(Y[j] - Z[k]) ,
                           abs(X[i] - Z[k]))) )
        if (X[i] <= Y[j]) and (X[i] <= Z[k]):
            i +=1
        elif (Y[j] <= X[i]) and (Y[j] <= Z[k]):
            j +=1
        else:
            k +=1
    return m   



x = [1, 2, 3, 4, 5]
y = [1, 3, 5, 7 ,9]
z = [2, 4 ,6]

r = threePointer(x, y, z)
print(r)

