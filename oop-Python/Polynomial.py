# -*- coding: utf-8 -*-
"""
Created on Fri Dec  9 14:35:47 2022

@author: Mahmoud Saeed
"""

from os import *
from sys import *
from collections import *
from math import *

from copy import deepcopy

class Polynomial:
    degCoeff = [] #Name of your array (Don't change this)

    def __init__(self):
        self.capacity = 10
        self.degCoeff = [0]*10
    
    def deepcopy(self , p):
        capacity = p.capacity
        degCoeff = p.degCoeff
        
    def setCoefficient(self,degree,coef):
        while degree >= self.capacity:
            s = 2*self.capacity
            newDeg = [0]*s
            for i in range(self.capacity):
                newDeg[i] = self.degCoeff[i]
            self.capacity = s
            self.degCoeff = newDeg
    
        self.degCoeff[degree] = coef

    def __add__ (self,p):
        n = Polynomial()
        i,j = 0,0
        while(i<self.capacity and j<p.capacity):
            n.setCoefficient(i, self.degCoeff[i] + p.degCoeff[j])
            i +=1
            j +=1
        while i < self.capacity:
           n.setCoefficient(i , self.degCoeff[i])
           i +=1
        while j < self.capacity:
           n.setCoefficient(j , p.degCoeff[j])
           j +=1
        return n

    def __sub__ (self,p):
        n = Polynomial()
        i,j = 0,0
        while(i<self.capacity and j<p.capacity):
            n.setCoefficient(i, self.degCoeff[i] - p.degCoeff[j])
            i +=1
            j +=1
        while i < self.capacity:
           n.setCoefficient(i , self.degCoeff[i])
           i +=1
        while j < self.capacity:
           n.setCoefficient(j , -p.degCoeff[j])
           j +=1
        return n
    

    def getCoefficient( self, degree ) :
      if (degree >= self.capacity) :
          return 0
      return self.degCoeff[degree]
  
    def __mul__(self , p):
        n = Polynomial()
        for j in range(p.capacity):
            for i in range(self.capacity):
                n.setCoefficient(i+j, n.getCoefficient(i+j) + 
                                 (self.degCoeff[i] * p.degCoeff[j]))
        
        return n

    def print(self):
        for i in range(self.capacity):
           if self.degCoeff[i] != 0:
               print(self.degCoeff[i] , end = "")
               print("x",end="")
               print(i,end=" ")
               
               
            
def run():
    count1 = int(input())

    degree1 = list(map(int,input().split()))

    coeff1 = list(map(int,input().split()))


    first = Polynomial()
    for i in range(count1):
        first.setCoefficient(degree1[i], coeff1[i])

    count2 = int(input())


    degree2 = list(map(int,input().split()))

    coeff2 = list(map(int,input().split()))


    second = Polynomial()
    for i in range(count2) :
        second.setCoefficient(degree2[i], coeff2[i])


    choice = int(input())

    result = Polynomial()
    # Add 
    if choice == 1:
        result = first + second
        result.print()
    # Subtract
    elif choice == 2:
        result = first - second
        result.print()
    # Multiply
    elif choice == 3:
        result = first * second
        result.print()

    elif choice == 4: # Copy constructor
        third = deepcopy(first)
        if (third.degCoeff == first.degCoeff) :
            print("true")
        else :
            print("false")

    else: # Copy assignment operator
        fourth = deepcopy(first)
        if (fourth.degCoeff == first.degCoeff) :
            print("true")
        else :
            print("false")
            
            
run()            
