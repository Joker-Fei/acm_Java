package acm_328;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class queue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Queue<String> queue=new LinkedList<String>();
		queue.offer("a");
		queue.offer("b");
		queue.offer("c");
		
		for(String q : queue){
            System.out.print(q);
        }
		
		System.out.println("");
		//queue.peek();
		queue.poll();
		
		for(String q : queue){
            System.out.print(q);
        }*/
		
		Stack<String> stack=new Stack<String>();
		stack.push("a");
		stack.push("b");
		stack.push("c");
		
		for(String q : stack){
            System.out.print(q);
        }
		
		System.out.println(" ");
		stack.push("d");
		
		for(String q : stack){
			System.out.print(q);
		}
	}

}
