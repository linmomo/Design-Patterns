package com.visitor;

/**
 * 具体实现被访问者
 * @author Administrator
 *
 */
public class MySubject implements ISubject{

	@Override
	public String getSubject() {
		return "哈哈哈";
	}

	@Override
	public void accept(IVisitor visitor) {
		//同意被访问，让访问者持有被访问实例来处理这其中的操作
		visitor.visitor(this);
	}

}
