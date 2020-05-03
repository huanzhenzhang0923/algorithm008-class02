import java.util.HashMap;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    HashMap<Integer,Integer> map=new HashMap<>();
    int[] preorder;
    int[] inorder;
    int preidx=0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder=preorder;
        this.inorder=inorder;

        int idx=0;

        for (Integer val : inorder) {
            map.put(val,idx++);
        }

        return helper(0,inorder.length);
    }

    private TreeNode helper(int in_left,int in_right) {
        if (in_left==in_right) {
            return null;
        }

        TreeNode root=new TreeNode(preorder[preidx++]);
        int index=map.get(root.val);
        root.left=helper(in_left,index);
        root.right=helper(index+1,in_right);
        return root;
    }
}
