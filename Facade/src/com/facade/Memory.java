package com.facade;

/**
 * �ڴ�ľ���ʵ��
 * @author Administrator
 *
 */
public class Memory implements Computeriml{

	@Override
	public void starup() {
		System.out.println("memorystartup");
	}

	@Override
	public void shutdown() {
		System.out.println("memoryshutdown");
	}

}
