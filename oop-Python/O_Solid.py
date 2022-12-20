# -*- coding: utf-8 -*-
"""
Created on Sat May  7 11:43:57 2022

@author: MahmoudSaeed
"""

from abc import ABC ,abstractclassmethod

class Shape(ABC):
    def calculatedArea():
        pass
    
class Rectangle(Shape):
    length = 0.0
    width = 0.0
    def calculatedArea(self):
        return self.length * self.width
    

class Circle(Shape):
    radius = 0.0
    def calculatedArea(self):
        return (22/7)* self.radius*self.radius

        

class AreaCalc():
    def calcShape(self , shape):
        return shape.calculatedArea()
    

rec = Rectangle()
rec.length = 12
rec.width = 10

cir = Circle()
cir.radius = 7

areaCalc = AreaCalc()

print(areaCalc.calcShape(cir))


    