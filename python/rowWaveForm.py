# -*- coding: utf-8 -*-
"""
Created on Thu Dec 29 11:53:02 2022

@author: Mahmoud Saeed
"""

"""
problem link :

    
https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/
content/118821/offering/1381907

"""


def rowWaveForm(mat):
    l = []
    for i in range(len(mat)):
        if i % 2 ==0:
            for j in range(0,len(mat[i])):
                l.append(mat[i][j])
        else:
            for j in range(len(mat[i])-1 , -1 , -1):
                l.append(mat[i][j])
                
    return l           
              