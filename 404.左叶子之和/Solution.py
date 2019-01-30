# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def sumOfLeftLeaves(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        def leftSum(node, isLeft):
            sum = 0
            if node.left != None or node.right != None:
                if node.left != None:
                    sum += leftSum(node.left, True)
                if node.right != None:
                    sum += leftSum(node.right, False)
            elif isLeft:
                sum += node.val
            return sum
        if root is None:
            return 0
        return leftSum(root, False)
