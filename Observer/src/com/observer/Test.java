package com.observer;

public class Test {
	public static void main(String[] args) {
		//��ʼ��һ������
		ConcreteSubject subject=new ConcreteSubject();
		
		//��������һ���۲��ߣ�����ΪA
		subject.add(new ConcreteObserver("A",subject));
		subject.add(new ConcreteObserver("B",subject));
		//����������
		subject.setName("xyz");
		//���ⴥ���������Ĺ۲��߸���
		subject.notifyAllObserver();
	}
}
