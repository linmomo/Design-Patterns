package com.facade;

/**
 * cpu�ľ���ʵ��
 * @author Administrator
 *
 */
public class Cpu implements Computeriml{

	@Override
	public void starup() {
		System.out.println("cpustartup");
	}

	@Override
	public void shutdown() {
		System.out.println("cpushutdown");
	}
	
}
