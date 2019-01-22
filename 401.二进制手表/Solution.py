class Solution:
    def readBinaryWatch(self, num):
        """
        :type num: int
        :rtype: List[str]
        """
        def oneCount(num):
            count = 0
            while num:
                count += num % 2
                num >>= 1
            return count
        result = []
        hourMap = [[] for i in range(4)]
        minuteMap = [[] for i in range(6)]
        for hour in range(12):
            hourMap[oneCount(hour)].append(hour)
        for minute in range(60):
            minuteMap[oneCount(minute)].append(minute)
        for i, hours in enumerate(hourMap):
            if i > num:
                break
            elif num - i > 5:
                continue
            for hour in hours:
                hour = str(hour) + ':'
                for minute in minuteMap[num - i]:
                    if minute < 10:
                        minute = '0' + str(minute)
                    else:
                        minute = str(minute)
                    result.append(hour + minute)
        return result
