# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def leafSimilar(self, root1, root2):
        """
        :type root1: TreeNode
        :type root2: TreeNode
        :rtype: bool
        """
        def getLeafVal(s):
            while len(s):
                top = s.pop()
                if top.left == None and top.right == None:
                    return top.val
                else:
                    if top.right != None:
                        s.append(top.right)
                    if top.left != None:
                        s.append(top.left)
            return None
        s1 = []
        s2 = []
        if root1 != None:
            s1.append(root1)
        if root2 != None:
            s2.append(root2)
        while len(s1) and len(s2):
            if getLeafVal(s1) != getLeafVal(s2):
                return False
        return len(s1) == len(s2)
