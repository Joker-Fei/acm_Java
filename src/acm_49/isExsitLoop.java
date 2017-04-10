package acm_49;

public class isExsitLoop {

	/*
	 * 单链表判断是否有环
	 * */
	public static boolean loop(Node head){
		Node slow=head.next;
		Node fast=head.next;
		while(fast!=null && fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
			if(slow!=fast){
				return false;
			}
		}
		return true;
	}
}
