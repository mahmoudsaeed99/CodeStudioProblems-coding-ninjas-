# -*- coding: utf-8 -*-
"""
Created on Sat Dec 17 10:40:42 2022

@author: Mahmoud Saeed
"""
"""
problem link :

    
https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/
content/118509/offering/1376572
"""

def isSubSequence(str1, str2):
    j = 0
    for i in str2:
        if str1[j] == i:
            j +=1
    if j == len(str1):
        return True
    else:
        return False         


s1 = "CB"
s2 = "BCDE"
r = isSubSequence(s1, s2)
print(r)
