package com.visitor;

/**
 * ��������߶��󣬺��б����ʵĶ���
 * @author Administrator
 *
 */
public class MyVisitor implements IVisitor{

	@Override
	public void visitor(ISubject subject) {
		System.out.println("subject="+subject.getSubject());
	}
}
