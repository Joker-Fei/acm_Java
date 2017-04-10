package acm_410;

public class Single {

	/*
	 * 先初始化对象
	 * 成为：饿汉式
	 * Single类一进内存，就已经创建好了对象。
	 * */
	private Single(){}
	private static Single s=new Single();
	public static Single getInstance(){
		return s;
	}
	
	
}
