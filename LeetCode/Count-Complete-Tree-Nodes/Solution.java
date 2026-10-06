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
17    public int countNodes(TreeNode root) {
18        if (root == null) {
19            return 0;
20        }
21
22        int leftHeight = getLeftHeight(root);
23        int rightHeight = getRightHeight(root);
24
25        // Perfect binary tree
26        if (leftHeight == rightHeight) {
27            return (1 << leftHeight) - 1;
28        }
29
30        // Not perfect
31        return 1 + countNodes(root.left) + countNodes(root.right);
32    }
33
34    private int getLeftHeight(TreeNode node) {
35        int height = 0;
36
37        while (node != null) {
38            height++;
39            node = node.left;
40        }
41
42        return height;
43    }
44
45    private int getRightHeight(TreeNode node) {
46        int height = 0;
47
48        while (node != null) {
49            height++;
50            node = node.right;
51        }
52
53        return height;
54    }
55}