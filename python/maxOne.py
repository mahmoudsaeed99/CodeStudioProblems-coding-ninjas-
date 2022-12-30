# -*- coding: utf-8 -*-
"""
Created on Fri Dec 30 10:47:30 2022

@author: Mahmoud Saeed
"""
"""
problem link :

    
https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/
content/118821/offering/1381908

"""

def maxOne(arr):
    m = -1
    m_index = -1
    for i in range(len(arr)):
        new_m = -1
        for j in range(len(arr[i])):
            if arr[i][j] == 1:
                new_m = len(arr[i]) - j
                break
        if new_m > m :
            m = new_m
            m_index = i
    return m_index   
