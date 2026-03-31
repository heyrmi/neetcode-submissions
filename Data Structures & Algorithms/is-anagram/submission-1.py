class Solution:
    #bruteForce Solution (soft by char then )
    def isAnagramBF(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        
        charOfS = sorted(s)
        charOfT = sorted(t)

        for i in range(len(s)): 
            if charOfS[i] != charOfT[i]: 
                return False
        
        return True

    #Optimised Approach: Use dict 
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t): 
            return False
        
        dictForS, dictForT = {}, {}

        for i in range(len(s)): 
            dictForS[s[i]] = dictForS.get(s[i],0) + 1
            dictForT[t[i]] = dictForT.get(t[i], 0) + 1
        
        return dictForS == dictForT