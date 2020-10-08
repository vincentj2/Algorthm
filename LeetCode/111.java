//111 Minimum Depth of Binary Tree
public int minDepth(TreeNode root) {
        int min = Integer.MAX_VALUE;
        if(root == null) return 0;

        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> count = new Stack<>();

        stack.push(root);
        count.push(1);

        while(!stack.isEmpty()){
        TreeNode node = stack.pop();
        int temp = count.pop();

        if(node.right==null && node.left==null){
        min = Math.min(min,temp);
        }

        if(node.left != null){
        stack.push(node.left);
        count.push(temp+1);
        }
        if(node.right != null){
        stack.push(node.right);
        count.push(temp+1);
        }
        }
        return min;
        }
