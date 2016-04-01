package com.command;

/**
 * 命令的具体实现-持有执行者的实例
 * @author Administrator
 *
 */
public class MyCommand implements Command{
	
	private Receiver receiver;

	public MyCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void exe() {
		receiver.action();
	}

}
