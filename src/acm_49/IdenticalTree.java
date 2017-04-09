package acm_49;

class IdenticalTree {

	/**
	 * 对于两棵彼此独立的二叉树A和B，请编写一个高效算法，检查A中是否存在一棵子树与B树的拓扑结构完全相同。
	       给定两棵二叉树的头结点A和B，请返回一个bool值，代表A中是否存在一棵同构于B的子树。
	 * @param args
	 */
	 public boolean chkIdentical(TreeNode A, TreeNode B) {
		 String str1=preOrder(A);
		 String str2=preOrder(B);
		 return str1.contains(str2);
	 }
	 public String preOrder(TreeNode root){
		String result=root.val+"#";
		if(root.left!=null){
			result+=preOrder(root.left);
		}else{
			result+="!#";
		}
		if(root.right!=null){
			result+=preOrder(root.right);
		}else{
			result+="!#";
		}
		return result;
		 
	 }

}
