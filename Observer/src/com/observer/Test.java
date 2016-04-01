package com.observer;

public class Test {
	public static void main(String[] args) {
		//初始化一个主题
		ConcreteSubject subject=new ConcreteSubject();
		
		//主题引入一个观察者，命名为A
		subject.add(new ConcreteObserver("A",subject));
		subject.add(new ConcreteObserver("B",subject));
		//设置主题名
		subject.setName("xyz");
		//主题触发所包含的观察者更新
		subject.notifyAllObserver();
	}
}
