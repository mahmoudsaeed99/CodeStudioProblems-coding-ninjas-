# -*- coding: utf-8 -*-
"""
Created on Tue Dec 13 18:08:49 2022

@author: Mahmoud Saeed
"""

import observer as o

class Person(o.observer):
    def __init__(self , name):
        self.__name = name
        
    def update(self, message):
        print("{} got new notication : {}".format(self.__name , message))
        
        