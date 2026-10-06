1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public List<Integer> postorderTraversal(TreeNode root) {
18
19        List<Integer> result = new ArrayList<>();
20
21        postorder(root, result);
22
23        return result;
24    }
25
26    public void postorder(TreeNode root, List<Integer> result) {
27
28        if (root == null) {
29            return;
30        }
31
32        // 1. Left
33        postorder(root.left, result);
34
35        // 2. Right
36        postorder(root.right, result);
37
38        // 3. Root
39        result.add(root.val);
40    }
41}