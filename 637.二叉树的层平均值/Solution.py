# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def averageOfLevels(self, root):
        """
        :type root: TreeNode
        :rtype: List[float]
        """
        q = []
        result = []
        nextCount = count = i = sum = 0
        if root != None:
            q.append(root)
            count += 1
        while len(q) > 0:
            t = q.pop(0)
            sum += t.val
            if t.left != None:
                q.append(t.left)
                nextCount += 1
            if t.right != None:
                q.append(t.right)
                nextCount += 1
            i += 1
            if i == count:
                result.append(sum / i)
                count = nextCount
                sum = i = nextCount = 0
        return result
