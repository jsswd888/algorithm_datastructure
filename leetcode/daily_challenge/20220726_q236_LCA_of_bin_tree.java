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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //base case
        if (root == null || root == p || root == q) {
            return root;
        }
        
        // recursion part
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // return result
        if(left == null) {
            return right; // traverse through all in left subtree & no found LCA
        }
        else if(right == null) {
            return left; // traverse through all in right subtree & no found LCA
        }
        else { //both left and right are not null, we found our result
            return root;
        }
    }
}