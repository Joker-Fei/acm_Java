package acm_324;

import java.util.List;
import java.util.Stack;

import javax.xml.soap.Node;

public class erChaShu {

	/**
	 * @param args
	 */
	/*
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;
	    public TreeNode(int val) {
	        this.val = val;
	    }
	}*/
	 
	//递归实现先序遍历
	public void xianXu(TreeNode root){
		if(root==null){
			return;
		}
		System.out.println(root.val+" ");
		xianXu(root.left);
		xianXu(root.right);
	}
	//递归实现中序遍历
	public void midTraversal(TreeNode root){
		if(root==null){
			return;
		}
		midTraversal(root.left);
		System.out.println(root.val);
		midTraversal(root.right);
	}
	//递归实现后序遍历
		public void lastTraversal(TreeNode root){
			if(root==null){
				return;
			}
			midTraversal(root.left);
			midTraversal(root.right);
			System.out.println(root.val);
		}
	/*非递归实现先序遍历	
	 * 
	 * 具体过程：
	1.首先申请一个新的栈，记为stack。
	2.然后将头结点head压入stack中。
	3.每次从stack中弹出栈顶节点，记为cur，然后打印cur节点的值。如果cur右孩子不为空的话，将cur的右孩子
	先压入stack中。最后如果cur的左孩子不为空的话，将cur的左孩子压入stack中;
	4.不断重复步骤3，直到stack为空。
	*/
	public void firstStack(TreeNode root,List<Integer> list){
		Stack<TreeNode> stack=new Stack<TreeNode>(); 
		stack.push(root);		 
		while( !stack.empty()){	//不断重复步骤3，直到stack为空。
			root=stack.pop();	 
			list.add(root.val);
			if(root.right!=null){
				stack.push(root.right);
			}
			if(root.left!=null){
				stack.push(root.left);
			}
		}
	}
	/*非递归实现中序遍历
	 * 具体过程：
	   1.申请一个新栈，记为stack，申请一个变量cur，初始时令cur等于头结点。
	   2.先把cur节点压入栈中，对以cur节点为头结点的整棵子树来说，依次把整棵树的左边界压入栈中，
	        即不断令cur=cur.left；
	   3.不断重复步骤2，直到发现cur为空，此时从stack中弹出一个节点，记为node。打印node的值，
	        并让cur=node.right ，然后继续重复步骤2；
	   4.当stack为空并且cur为空时，整个过程结束。
	 * */	
	public void midStack(TreeNode root,List<Integer>list){
		Stack<TreeNode> stack=new Stack<TreeNode>();
		while(root!=null || !stack.isEmpty()){//当stack为空并且cur为空时，整个过程结束。
			if(root!=null){
				stack.push(root);
				root=root.left;
			}else{
				root=stack.pop();
				list.add(root.val);
				root=root.right;
			}
		}
		
	}
	/*使用两个栈实现：
	 具体过程：
	 1.申请一个栈，记为stack1，然后将头结点压入stack1中；
	 2.从stack1中弹出的节点记为cur，然后把cur的左孩子压入stack1中，然后把cur的右孩子压入stack1中；
	 3.在整个过程中，每一个从stack1中弹出的节点都放进第二个栈stack2中；
	 4.不断重复步骤2和23，直到stack1为空为止。 
	 * */
	public void lastStack(TreeNode root,List<Integer>list){
		Stack<TreeNode> stack1=new Stack<TreeNode>();
		Stack<TreeNode> stack2=new Stack<TreeNode>();
		stack1.push(root);
		while(!stack1.isEmpty()){
			root=stack1.pop();
			stack2.push(root);
			if(root.left!=null){
				stack1.push(root.left);
			}
			if(root.right!=null){
				stack1.push(root.right);
			}
		}
		while(!stack2.isEmpty()){
			list.add(stack2.pop().val);
		}
	}
	
	
}
