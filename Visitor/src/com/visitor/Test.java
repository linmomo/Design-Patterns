package com.visitor;

public class Test {
	public static void main(String[] args) {
		//����һ��������
		IVisitor iVisitor=new MyVisitor();
		//����һ����������
		ISubject subject=new MySubject();
		//��������ͬ�ⱻ����
		subject.accept(iVisitor);
	}
}
