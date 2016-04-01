package com.visitor;

/**
 * 抽象被访问者的方法
 * @author Administrator
 *
 */
public interface ISubject {
	void accept(IVisitor visitor);
	
	String getSubject();
}
