# -*- coding: utf-8 -*-
"""
Created on Tue Dec 13 18:30:32 2022

@author: Mahmoud Saeed
"""

import Product as p , Person as r
import time

phone = p.Product("phone")
mahmoud = r.Person("mahmdoud")
mohamed = r.Person("mohamed")
marwan = r.Person("marwan")

phone.add(mahmoud)
phone.add(mohamed)
phone.add(marwan)

for i in range(5):
    v = i%2==0
    phone.setAvailability(v)
    if i ==2:
        phone.remove(marwan)
    
    print("-------------------------------------------------")
    time.sleep(1)
    
phone.setAvailability(True)        




