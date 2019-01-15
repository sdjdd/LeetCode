class Solution:
    def isHappy(self, n):
        """
        :type n: int
        :rtype: bool
        """
        while True:
            list = self.num2list(n)
            n = self.listSum(list)
            if n == 4:
                break
            if n == 1:
                return True
        return False
    
    def num2list(self, n):
        list = []
        while n:
            list.insert(0, n % 10)
            n //= 10
        return list
    
    def listSum(self, list):
        sum = 0
        for n in list:
            sum += n**2
        return sum