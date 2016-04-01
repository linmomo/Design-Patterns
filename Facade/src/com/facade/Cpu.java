package com.facade;

/**
 * cpu的具体实现
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
