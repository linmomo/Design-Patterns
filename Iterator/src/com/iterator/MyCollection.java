package com.iterator;

/**
 * ���ϲ����ľ���ʵ��
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
