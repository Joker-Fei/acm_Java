package acm_410;

public class SingleLan {

	/*
	 * 方法被调用时，才初始化，也叫作对象的延迟加载，
	 * 成为：懒汉式
	 * */
	private SingleLan(){}
	private static SingleLan sl=null;
	public static SingleLan getInstance(){
		if(sl==null)
			return sl=new SingleLan();
		return sl;
	}
}
