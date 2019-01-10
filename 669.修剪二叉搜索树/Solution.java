/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        while (root != null) {
            if (root.val < L)
                root = root.right;
            else if (root.val > R)
                root = root.left;
            else
                break;
        }
        if (root != null) {
            TreeNode t = root;
            while (t.left != null) {
                if (t.left.val < L)
                    t.left = t.left.right;
                else
                    t = t.left;
            }
            t = root;
            while (t.right != null) {
                if (t.right.val > R)
                    t.right = t.right.left;
                else
                    t = t.right;
            }
        }
        return root;
    }
}