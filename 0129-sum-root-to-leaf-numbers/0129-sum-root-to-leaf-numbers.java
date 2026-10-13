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
    int total=0;
    public int sumNumbers(TreeNode root) {
     traverse(root,0);
     return total;
    }
 void traverse(TreeNode root,int num){
        if(root==null){
            return;
        }
        num=num*10+root.val;
        if(root.left==null && root.right==null){
            total+=num;
            return;
        }
        traverse(root.left,num);
        traverse(root.right,num);
    }
}