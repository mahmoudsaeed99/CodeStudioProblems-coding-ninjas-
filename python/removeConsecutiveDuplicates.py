# -*- coding: utf-8 -*-
"""
Created on Thu Dec 15 12:16:23 2022

@author: Mahmoud Saeed
"""

def removeConsecutiveDuplicates(s): 
    n = ""
    i = 0
    while(i < len(s)-1):
        if s[i].lower() != s[i+1].lower():
            n += s[i]
        i+=1
    n += s[i]    
    return n    

s = "xxxyyyzwwzzz"
print(removeConsecutiveDuplicates(s))
