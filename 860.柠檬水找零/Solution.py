class Solution:
    def lemonadeChange(self, bills):
        """
        :type bills: List[int]
        :rtype: bool
        """
        five = ten = twenty = 0
        for money in bills:
            if money == 5:
                five += 1
            elif money == 10:
                if five == 0:
                    return False
                five -= 1
                ten += 1
            elif money == 20:
                if ten > 0 and five > 0:
                    ten -= 1
                    five -= 1
                elif five > 3:
                    five -= 3
                else:
                    return False
                twenty += 1
        return True
