package com.iterator;

/**
 * ����һЩ��������
 * @author Administrator
 *
 */
public interface Iterator {
	/**ǰ�� */
	Object previous();
	/**���� */
	Object next();
	/**�Ƿ������һ�� */
	boolean hashNext();
	/**�@ȡ��һ��Ԫ�� */
	Object first();
	
}
