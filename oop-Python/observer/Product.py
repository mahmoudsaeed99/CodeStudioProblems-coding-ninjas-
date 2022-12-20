# -*- coding: utf-8 -*-
"""
Created on Tue Dec 13 18:24:58 2022

@author: Mahmoud Saeed
"""
import Subject as s

class Product(s.Subject):
    
    def __init__(self , name):
        self.__name = name
        self.observerList = []
        
    def add(self, observer):
        self.observerList.append(observer)
    
    def remove(self, observer):
        self.observerList.remove(observer)
     
    def setAvailability(self , available):
        if available:
            self.available ="available"
        else:
            self.available = "not available"
        super().notifyallObserver()
        
        
        