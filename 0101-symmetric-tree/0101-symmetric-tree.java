class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }

        return Symmetricfunction(root.left, root.right);
    }

    public boolean Symmetricfunction(TreeNode left, TreeNode right){

        if(left == null || right == null){
            return left == right;
        }

        if(left.val != right.val){
            return false;
        }

        return Symmetricfunction(left.left, right.right)
            && Symmetricfunction(left.right, right.left);
    }
}