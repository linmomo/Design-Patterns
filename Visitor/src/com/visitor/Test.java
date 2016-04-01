package com.visitor;

public class Test {
	public static void main(String[] args) {
		//定义一个访问者
		IVisitor iVisitor=new MyVisitor();
		//定义一个被访问者
		ISubject subject=new MySubject();
		//被访问者同意被访问
		subject.accept(iVisitor);
	}
}
