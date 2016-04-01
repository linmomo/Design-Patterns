package com.visitor;

/**
 * 具体访问者对象，含有被访问的对象
 * @author Administrator
 *
 */
public class MyVisitor implements IVisitor{

	@Override
	public void visitor(ISubject subject) {
		System.out.println("subject="+subject.getSubject());
	}
}
