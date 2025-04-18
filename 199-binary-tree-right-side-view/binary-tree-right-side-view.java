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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> help = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> r = new ArrayList<>();
        if(root == null){
            return ans;
        }
        q.add(root);
        while(q.isEmpty()==false){
            int s = q.size();
            while(s-- > 0){
                TreeNode f = q.remove();
                r.add(f.val);
                if(f.left!=null){
                    q.add(f.left);
                }
                if(f.right!=null){
                    q.add(f.right);
                }
            }
            help.add(new ArrayList<>(r));
            r.clear();
        }
        
         for (List<Integer> i : help) {
            if (!i.isEmpty()) {  
                int last = i.get(i.size() - 1);  
                ans.add(last);  
            }
        }
        return ans;
    }
}