package com.facade;

/**
 * ���̵ľ���ʵ��
 * @author Administrator
 *
 */
public class Disk implements Computeriml{

	@Override
	public void starup() {
		System.out.println("diskstartup");
	}

	@Override
	public void shutdown() {
		System.out.println("diskshutdown");
	}

}
