# -*- coding: utf-8 -*-
"""
Created on Tue Dec 20 17:52:23 2022

@author: Mahmoud Saeed
"""

"""
problem link :

    
https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/
content/118509/offering/1376577

"""


def findEquilibriumIndices(sequence):
    p = sequence.copy()
    for i in range(len(p)-1 , -1,-1):
        if i != len(p)-1:
            p[i] = p[i] + p[i+1]
    s = 0
    r = []
    for i in range(len(sequence)):
        s += sequence[i] 
        if s - p[i] == 0:
            r.append(i)
        # if (i == 0) or (i == len(sequence)-1):
        #     if sequence[i] - p[i] == 0:
        #         r.append(i)
        # else:
        #     if s - p[i] == 0:
        #         r.append(i)
          
    return r  


sequence = [-7, 1, 5, 2 ,-4 ,3 ,0]
r = findEquilibriumIndices(sequence)

