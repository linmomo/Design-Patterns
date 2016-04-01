package com.iterator;

/**
 * 定义一些集合的操作
 * @author Administrator
 *
 */
public interface Collection {
	
	Iterator iterator();
	
	int size();
	
	Object get(int i);
	
}
