# -*- coding: utf-8 -*-
"""
Created on Thu Dec  8 12:31:11 2022

@author: Mahmoud Saeed
"""

def isValidIPv4(ipAddress):
    x = ipAddress.split(".")
    if len(x) != 4:
        return False;
    for i in x:
        if len(i) == 0:
            return False
        try:
            n = int(i)
            if n not in range(0,256):
                return False
        except:
            return False
    return True    
        

b = isValidIPv4("122.0.330.0")
print(b)
