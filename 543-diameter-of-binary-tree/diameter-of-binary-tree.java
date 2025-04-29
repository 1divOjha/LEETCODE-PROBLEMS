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
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }

    public int height(TreeNode node){
        //base case
        if(node==null){
            return 0;
        }

        //max height of (left,right subtree) +1, is the height of their parent nodes height 
        int lheight= height(node.left);
        int rheight= height(node.right);
        //leftHeight + rightHeight) because its diameter, lonest path between any two nodes, 
        //passing through any node, so for a given node, 
        //max dia can be its left sub tree,+ right subtree height
        diameter = Math.max(lheight+rheight, diameter);

        return 1+ Math.max(lheight, rheight);
    }
}