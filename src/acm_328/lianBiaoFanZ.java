package acm_328;

public class lianBiaoFanZ {

	/**
	 * 单链表的反转/逆序
	 * @param args
	 */
	public Node lianBiaoFZ(Node head){
		Node pre=null;
		Node next=null;
		while(head!=null){
			next=head.next;
			head.next=pre;
			pre=head;
			head=next;
		}
		return pre;
	}

}
