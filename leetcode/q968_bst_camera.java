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

// q968 - Binary Tree Camera; 6.17 daily question
// Three cases we need to consider for camera:
    // 1. either of child nodes is "not monitored": we need have montor
    // at current node to monitor the "not monitored" child node
    // 2. either of child "has a camera": n need for camera at current node
    // 3. child is monitored but NO CAMERA. Camera is needed at current node. 

class Solution {
    private int num_camera = 0;
    
    public int minCameraCover(TreeNode root) {
        return dfs(root) == -1 ? num_camera + 1 : num_camera;
    }

    
    // return -1: node is not monitored
    // return  0: node is monitored
    // return  1: node has a camera
    private int dfs(TreeNode root){
        if (root == null) return 0; //base case
        
        int leftchild = dfs(root.left); //left child
        int rightchild = dfs(root.right); // right child
        
        // case 1: if either child is not monitored
        // must need a monitor at curr node
        if (leftchild == -1 || rightchild == -1) {
            num_camera++;
            return 1; 
        }
        
        // case 2: if either child has camera: no monitor needed
        if (leftchild == 1 || rightchild == 1)
            return 0; 
        
        //case 3: normal case: camera needed for current node
        return -1;
    }
}