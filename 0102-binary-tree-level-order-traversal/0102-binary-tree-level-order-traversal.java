/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        List<List<Integer>> list = new ArrayList<>();
        if (root == null) return list;
        List<Integer> sublist = new ArrayList<>();

        while (!queue.isEmpty()){
            TreeNode currNode = queue.remove();
            if (currNode == null){
                list.add(sublist);
                sublist = new ArrayList<>();
                if (!queue.isEmpty()) {
                    queue.add(null);
                } else break;
            } else {
                sublist.add(currNode.val);
                if (currNode.left != null) queue.add(currNode.left);
                if (currNode.right != null) queue.add(currNode.right);
            }
        }
        return list;
    }
}