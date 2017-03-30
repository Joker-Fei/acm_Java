package acm_328;

public class removeTheKth {

	/**
	 * 删除单链表中倒数第k个点
	 * @param args
	 */
	 
	public Node removeKth(Node head,int k){
		if(head==null && k<1){
			return head;
		}
		Node cur=head;
		while(head!=null){
			k--;
			cur=cur.next;
		}
		if(k==0){
			head=head.next;
		}
		if(k<0){
			cur=head;
			while(++k!=0){
				cur=cur.next;
			}
			cur.next=cur.next.next;
		}
		return head;
	}

}
