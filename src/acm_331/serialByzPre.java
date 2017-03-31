package acm_331;

public class serialByzPre {

	/**
	 * 二叉树的序列化实现
	 * 
	 * @param args
	 */
	public class Node{
		public int value;
		public Node left;
		public Node right;
		
		public Node(int data){
			this.value=data;
		}
	}
	 
	public String serialByzPre(Node head){
		if(head==null){
			return "#!";
		}
		String res=head.value+"!";
		res+=serialByzPre(head.left);
		res+=serialByzPre(head.right);
		return res;
	}

}
