package acm_328;

import java.util.Stack;

public class TwoStacksQueue {

	/**
	 * 两个栈实现队列
	 * @param args
	 */

	public Stack<Integer> stackPush;
	public Stack<Integer> stackPop;
	public TwoStacksQueue(){
		stackPush=new Stack<Integer>();
		stackPop=new Stack<Integer>();
	}
	
	public void add(int pushInt){
		stackPush.add(pushInt);
	}
	
	public int peek(){
		if(stackPop.empty() && stackPush.empty()){
			throw new RuntimeException("Queue is empty");
			}
		else if(stackPop.empty()){
			while(!stackPush.empty()){
				stackPop.push(stackPush.pop());
			}
		}
		return stackPop.peek();
		}
	public int poll(){
		if(stackPop.empty() && stackPush.empty()){
			throw new RuntimeException("Queue is empty");
		}else if(stackPop.empty()){
			while(!stackPush.empty()){
				stackPop.push(stackPush.pop());
			}
		}
		return stackPop.pop();
	}
	
}
