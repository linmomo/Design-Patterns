package com.iterator;

/**
 * ����һЩ���ϵĲ���
 * @author Administrator
 *
 */
public interface Collection {
	
	Iterator iterator();
	
	int size();
	
	Object get(int i);
	
}
