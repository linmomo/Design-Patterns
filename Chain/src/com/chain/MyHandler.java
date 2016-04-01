package com.chain;

/**
 * 具体实现类
 * @author Administrator
 *
 */
public class MyHandler extends AbstrcatHandler implements Handler{
	
	private String name;

	/**
	 * 初始化设置一个对象名称
	 * @param name
	 */
	public MyHandler(String name) {
		this.name = name;
	}

	@Override
	public void operation() {
		//具体操作，显示出该对象的名称，如果该对象中还包含另一对象，继续操作显示，层层包含
		System.out.println(name+"handler");
		if(getHandler()!=null){
			getHandler().operation();
		}
	}
	
}
