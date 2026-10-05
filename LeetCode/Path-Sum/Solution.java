1class Solution {
2    public boolean hasPathSum(TreeNode root, int targetSum) {
3        if (root == null) return false;
4
5        // If it's a leaf node
6        if (root.left == null && root.right == null) {
7            return targetSum == root.val;
8        }
9
10        int remaining = targetSum - root.val;
11
12        return hasPathSum(root.left, remaining) || 
13               hasPathSum(root.right, remaining);
14    }
15}