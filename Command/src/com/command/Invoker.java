package com.command;

/**
 * 指挥者-司令，持有命名的实例，负责发号施令
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
