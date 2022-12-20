# -*- coding: utf-8 -*-
"""
Created on Fri Dec 16 10:26:28 2022

@author: Mahmoud Saeed
"""
"""
problem link :

https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/
content/118509/offering/1376571
"""

# def minCostToGivenString(str1, str2) :
#     str1 = list(str1)
#     str2 = list(str2)
#     c = 0
#     for i in range(len(str1)): 
#         if str1[i] == str2[i]:
#             continue
#         else:
#             s = str1[i]
#             str1.pop(i)
#             str1.append(s)
#             i -=1
#             # j = 0
#             # while j < len(str1):
#             #     if str1[j] == str2[i]:
#             #         break
#             #     j +=1
#             # s = str1[i]
#             # str1[i] = str1[j]
#             # str1[j] = s
#             c += 1  
#     print("".join(str1) , "   ","".join(str2))
#     return c        

def minCostToGivenString(str1, str2) :
    if len(str1) < len(str2):
        return -1
    c = 0
    i = 0
    j = 0
    while (i <len(str1)) and (j < len(str2)):
        if str1[i] == str2[j]:
            i +=1
            j +=1
        else:
            c +=1
            i +=1
    return c



s1 = "IFDfxPCdNvCNXPe"
s2 = "NFfPICxeCNDdXPv"

# s1 = list(s1)
# i = 0
# s = s1[i]
# s1 = s1[i+1:]
# s1.append(s)
# print(s1)
r = minCostToGivenString(s1, s2)
print(r)
