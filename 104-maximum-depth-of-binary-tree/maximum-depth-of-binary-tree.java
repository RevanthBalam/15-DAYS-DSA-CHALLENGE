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
    public int maxDepth(TreeNode root) {
        return depthOfTree(root,0);
        

    }

    static int depthOfTree(TreeNode branch,int count){
        if(branch == null){
            return count;
        }

        int leftSide = depthOfTree(branch.left,count+1);
        int RightSide = depthOfTree(branch.right,count+1);

        return Math.max(leftSide,RightSide);
    }

}