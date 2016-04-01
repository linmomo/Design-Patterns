package com.command;

public class Test {
	public static void main(String[] args) {
		//实现一个命令者，包含执行者实例
		Command command=new MyCommand(new Receiver());
		//指挥者包含命名实例，通过命令实例让执行者执行
		Invoker invoker=new Invoker(command);
		//通过命名实例将指挥者和执行者解耦
		invoker.action();
	}
}
