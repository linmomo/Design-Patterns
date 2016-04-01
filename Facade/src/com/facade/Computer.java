package com.facade;

/**
 * �ϲ�����࣬��ͳһ������ϵͳ
 * @author Administrator
 *
 */
public class Computer implements Computeriml{
	
	private Cpu cpu;
	private Disk disk;
	private Memory memory;

	public Computer() {
		cpu = new Cpu();
		disk = new Disk();
		memory = new Memory();
	}

	@Override
	public void starup() {
		cpu.starup();
		disk.starup();
		memory.starup();
	}

	@Override
	public void shutdown() {
		cpu.shutdown();
		disk.shutdown();
		memory.shutdown();
	}
	
}
