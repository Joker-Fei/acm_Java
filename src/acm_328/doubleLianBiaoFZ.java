package acm_328;

public class doubleLianBiaoFZ {

	/**
	 * 双链表反转/逆序
	 * @param args
	 */
	public DoubleNode doubleNodeFZ(DoubleNode head){

		DoubleNode pre=null;
		DoubleNode next=null;
		while(head!=null){
			next=head.next;
			head.last=next;//与单链表不同之处
			head.next=pre;
			pre=head;
			head=next;
		}
		return pre;
	}
	 

}
