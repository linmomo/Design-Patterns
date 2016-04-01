package com.facade;

/**
 * 内存的具体实现
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
