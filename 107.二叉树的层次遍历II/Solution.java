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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new LinkedList<>();
        int count = 1, nextCount = 0;
        List<Integer> currentFloor = new LinkedList<>();
        if (root == null) {
            return result;
        }
        queue.offer(root);
        do {
            TreeNode t = queue.poll();
            currentFloor.add(t.val);
            if (t.left != null) {
                queue.offer(t.left);
                nextCount++;
            }
            if (t.right != null) {
                queue.offer(t.right);
                nextCount++;
            }
            count--;
            if (count == 0) {
                result.add(currentFloor);
                currentFloor = new LinkedList<>();
                count = nextCount;
                nextCount = 0;
            }
        } while (queue.size() > 0);
        Collections.reverse(result);
        return result;
    }
}