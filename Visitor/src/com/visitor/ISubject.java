package com.visitor;

/**
 * ���󱻷����ߵķ���
 * @author Administrator
 *
 */
public interface ISubject {
	void accept(IVisitor visitor);
	
	String getSubject();
}
