package com.mediator;

public class Test {
	public static void main(String[] args) {
		//ʵ��һ���н���
		Mediator mediator=new MyMediator();
		//�н��ഴ�����й���ʵ��
		mediator.creteMediator();
		//ͨ���н�ָ�ӹ���
		mediator.workAll();
	}
}
