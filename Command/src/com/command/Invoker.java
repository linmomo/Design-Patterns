package com.command;

/**
 * ָ����-˾�����������ʵ�������𷢺�ʩ��
 * @author Administrator
 *
 */
public class Invoker {
	private Command command;

	public Invoker(Command command) {
		this.command = command;
	}
	
	public void action(){
		command.exe();
	}
}
