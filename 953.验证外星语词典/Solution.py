class Solution:
    def isAlienSorted(self, words, order):
        """
        :type words: List[str]
        :type order: str
        :rtype: bool
        """
        m = {}
        i = 0
        for c in order:
            m[c] = i
            i += 1
        for i in range(1, len(words)):
            if m[words[i][0]] > m[words[i-1][0]]:
                continue
            elif m[words[i][0]] < m[words[i-1][0]]:
                return False
            changed = False
            for j in range(len(words[i])):
                if j >= len(words[i-1]):
                    break
                if m[words[i][j]] < m[words[i-1][j]]:
                    return False
                elif m[words[i][j]] > m[words[i-1][j]]:
                    changed = True
            if len(words[i]) < len(words[i-1]) and not changed:
                return False
        return True
