1import java.util.*;
2
3class Solution {
4    public boolean isSymmetric(TreeNode root) {
5        Queue<TreeNode> q = new LinkedList<>();
6        q.add(root);
7        q.add(root);
8
9        while (!q.isEmpty()) {
10            TreeNode t1 = q.poll();
11            TreeNode t2 = q.poll();
12
13            if (t1 == null && t2 == null) continue;
14            if (t1 == null || t2 == null) return false;
15            if (t1.val != t2.val) return false;
16
17            q.add(t1.left);
18            q.add(t2.right);
19
20            q.add(t1.right);
21            q.add(t2.left);
22        }
23
24        return true;
25    }
26}