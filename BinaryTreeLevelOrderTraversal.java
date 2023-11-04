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
        //using BFS
        List<List<Integer>> res = new ArrayList<>();
        Deque<TreeNode> queue = new ArrayDeque<>();
        if(root != null) {
            queue.add(root);
        }
        while(!queue.isEmpty()) {
            //for loop to determine the completion of each level. after each iteration eachLevelList gets added to result list
            List<Integer> eachLevelList = new ArrayList<>();
            //defining queue size to avoid hindering with for loop iteration while neighbour nodes gets added in process
            int queueSize = queue.size();
            for (int i = 0; i < queueSize; i++) {
                TreeNode node = queue.removeFirst();
                if (node != null) {
                    System.out.println(i);
                    System.out.println(node.val);
                    System.out.println("---");
                    eachLevelList.add(node.val);                   
                    if (node.left != null) {
                        queue.add(node.left);  
                    }
                    if (node.right != null) {
                        queue.add(node.right);
                    }    
                }
            } 
            if (eachLevelList.size() != 0) {
                res.add(eachLevelList);
            }   
        }
        return res;
    }
}
