package com.command;

public class Test {
	public static void main(String[] args) {
		//ʵ��һ�������ߣ�����ִ����ʵ��
		Command command=new MyCommand(new Receiver());
		//ָ���߰�������ʵ����ͨ������ʵ����ִ����ִ��
		Invoker invoker=new Invoker(command);
		//ͨ������ʵ����ָ���ߺ�ִ���߽���
		invoker.action();
	}
}
