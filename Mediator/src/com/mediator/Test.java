package com.mediator;

public class Test {
	public static void main(String[] args) {
		//实现一个中介类
		Mediator mediator=new MyMediator();
		//中介类创建所有工作实例
		mediator.creteMediator();
		//通过中介指挥工作
		mediator.workAll();
	}
}
