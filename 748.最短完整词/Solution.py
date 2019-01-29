class Solution:
    def shortestCompletingWord(self, licensePlate, words):
        """
        :type licensePlate: str
        :type words: List[str]
        :rtype: str
        """
        m = {}
        result = None
        for c in licensePlate.lower():
            if c.isalpha():
                if c in m:
                    m[c] += 1
                else:
                    m[c] = 1
        for w in words:
            for (c, i) in m.items():
                if w.lower().count(c) < i:
                    break
            else:
                if result is None or len(w) < len(result):
                    result = w
        return result
