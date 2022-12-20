# -*- coding: utf-8 -*-
"""
Created on Tue Dec 13 18:23:23 2022

@author: Mahmoud Saeed
"""
import observer as o

class Subject:
    def add(self,observer):
        pass
    def remove(self,observer):
        pass
    def notifyallObserver(self):
        for i in self.observerList:
            i.update(self.available)
            
            
    
    
    