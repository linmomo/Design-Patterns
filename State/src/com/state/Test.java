package com.state;

public class Test {
	public static void main(String[] args) {
		//״̬ʵ��1
		IState state=new ConcreteState1();
		//�������г��и�״̬ʵ��
		Context context=new Context(state);
		
		//����ִ��ʱ��1 2״̬����ı䣬�ı�1֮��ͳ���2
		context.requset();
		context.requset();
		context.requset();
		context.requset();
	}
}
