class Solution:
    def numberOfBoomerangs(self, points):
        """
        :type points: List[List[int]]
        :rtype: int
        """
        def distance(p1, p2):
            return (p1[0] - p2[0])**2 + (p1[1] - p2[1])**2
        count = 0
        for i in range(len(points)):
            m = {}
            for j in range(len(points)):
                if i != j:
                    d = distance(points[i], points[j])
                    if d in m:
                        m[d] += 1
                    else:
                        m[d] = 1
            for n in m.values():
                if n > 1:
                    count += n * (n - 1)
        return count