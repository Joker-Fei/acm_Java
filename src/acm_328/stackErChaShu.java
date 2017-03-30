package acm_328;

import java.util.List;
import java.util.Stack;

public class stackErChaShu {

	/**
	 * 二叉树使用栈实现非递归打印
	 * @param args
	 */
	public void stackErChaShu(TreeNode root,List<Integer> list){
		Stack<TreeNode> stack=new Stack<TreeNode>();
		stack.push(root);
		while(!stack.empty()){
			root=stack.pop();
			list.add(root.val);
			if(root.right!=null){
				stack.push(root.right);
			}
			if(root.right!=null){
				stack.push(root.left);
			}
		}
	}
	 

}
