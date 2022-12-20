import math


def checkValidString(s):
    low = high = 0
    for char in s:
         low += 1 if char == '(' else -1
         high += 1 if char != ')' else -1
         if high < 0: break
         low = max(low, 0)

    return low == 0

s = "()()"
r = checkValidString(s)
print(r)



# bool checkValidString(string &s){
# 	int n = s.length()-1;
#         int opencount = 0, closecount = 0;
#         for(int i=0; i<=n; i++){
#             if(s[i]=='(' || s[i]=='*')
#                 opencount++;
#             else opencount--;
#             if(s[n-i]==')' || s[n-i]=='*')
#                 closecount++;
#             else closecount--;
#             if(opencount<0 || closecount<0) return false;
#         }
#         return true;
# }



