package acm_328;

public class getLoopNode {

	/**
	 * 判断一个链表是否有环，有的话返回入环的节点
	 * @param args
	 */
	 public Node getLoopNode(Node head){
		 if(head==null || head.next==null || head.next.next==null){//首先判断边界条件
			 return null;
		 }
		 Node node1=head.next;
		 Node node2=head.next.next;
		 while(node1!=node2){
			 if(node1==null || node2==null){
				 return null;
			 }
			 node1=head.next;
			 node2=head.next.next;
		 }
		 node2=head;
		 while(node1!=node2){
			 node1=head.next;
			 node2=head.next;
		 }
		 return node1;
	 }
}
