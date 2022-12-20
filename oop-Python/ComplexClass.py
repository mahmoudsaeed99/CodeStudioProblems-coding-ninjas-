# -*- coding: utf-8 -*-
"""
Created on Thu Dec  8 13:51:08 2022

@author: Mahmoud Saeed
"""

class ComplexNumbers:
    
    def __init__(self , n1 , i1 , n2 , i2):
        self.n1 = n1
        self.i1 = i1
        self.n2 = n2
        self.i2 = i2
        
    def plus(self):
        p = self.n1 + self.n2
        ip = self.i1 + self.i2
        print("{} + i{}".format(p , ip))
    
    def multiply(self):
        m = (self.n1 * self.n2) - (self.i1 * self.i2)
        mi = (self.n1 * self.i2) + (self.n2 * self.i1)
        print("{} + i{}".format(m, mi))






n1 , i1 = list(map(int, input().split(' ')))
n2 , i2 = list(map(int, input().split(' ')))

a = ComplexNumbers(n1, i1, n2, i2)
t = input()
if t == '1':
    a.plus()
elif t == '2':
    a.multiply()          

# my_list = input('Enter space-separated integers: ')
