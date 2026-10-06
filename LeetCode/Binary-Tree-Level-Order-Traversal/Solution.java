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
17    public List<List<Integer>> levelOrder(TreeNode root) {
18
19        List<List<Integer>> result = new ArrayList<>();
20
21        if (root == null) {
22            return result;
23        }
24
25        Queue<TreeNode> queue = new LinkedList<>();
26        queue.add(root);
27
28        while (!queue.isEmpty()) {
29
30            int levelSize = queue.size();
31            List<Integer> level = new ArrayList<>();
32
33            for (int i = 0; i < levelSize; i++) {
34
35                TreeNode current = queue.poll();
36                level.add(current.val);
37
38                if (current.left != null) {
39                    queue.add(current.left);
40                }
41
42                if (current.right != null) {
43                    queue.add(current.right);
44                }
45            }
46
47            result.add(level);
48        }
49
50        return result;
51    }
52}