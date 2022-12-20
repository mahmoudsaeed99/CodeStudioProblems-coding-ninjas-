# -*- coding: utf-8 -*-
"""
Created on Tue Dec  6 19:38:25 2022

@author: Mahmoud Saeed
"""

# 4 methods in oop
# 1- Abstract 

"""
A class is called an Abstract class if it contains one or more abstract methods.
An abstract method is a method that is declared, but contains no implementation.
Abstract classes may not be instantiated,
and its abstract methods must be implemented by its subclasses

"""
"""
The abc module defines ABCMeta class which is a metaclass for defining abstract base class.
Following example defines Shape class as an abstract base class using ABCMeta.
The shape class has area() method decorated by abstractmethod.

"""


import abc

# class Shape(metaclass = abc.ABCMeta):
#     @abc.abstractmethod
#     def area(self):
#         pass
    
# class Rectangle(Shape):
    
#     def __init__(self , x , y):
#         self.x = x
#         self.y = y
   
#     def area(self):
#         return self.x * self.y
    
    
# r = Rectangle(2, 3)

# print(r.area()) 

#---------------------------------   
  
# class Shape(abc.ABC):
#     @abc.abstractmethod
#     def area(self):
#         pass

    
# class Rectangle(Shape):
    
#     def __init__(self , x , y):
#         self.x = x
#         self.y = y
        
#     def area(self):
#         return self.x * self.y
    
    
# r = Rectangle(2, 3)

# print(r.area())   

#------------------------------

class Shape(abc.ABC):
    @abc.abstractmethod
    def area(self):
        pass
    
    
    @abc.abstractmethod
    def hello(self):
        return "hello users"
        
class Rectangle(Shape):
    
    def __init__(self , x , y):
        self.x = x
        self.y = y
   
    def area(self):
        return self.x * self.y
    
    def hello(self):
       return super().hello()
    
    
    
    
   
r = Rectangle(2, 3)

print(r.area())   
  
print(r.hello())
  



