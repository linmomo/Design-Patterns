package com.iterator;

/**
 * 集合操作的具体实现
 * @author Administrator
 *
 */
public class MyCollection implements Collection{
	
	String[] a={"a","b","c","d"};

	@Override
	public Iterator iterator() {
		return new MyIterator(this) ;
	}

	@Override
	public int size() {
		return a.length;
	}

	@Override
	public Object get(int i) {
		return a[i];
	}

}
