package com.clone;

public class Test {
	public static void main(String[] args) {
		ConcretePrototype concretePrototype=new ConcretePrototype("clone");
		concretePrototype.age=18;
		ConcretePrototype concretePrototype1 = (ConcretePrototype) concretePrototype.clones();
		concretePrototype1.age=16;
		
		System.out.println(String.format("�û���%s ���䣺%d", concretePrototype.tag, concretePrototype.age));
		System.out.println(String.format("�û���%s ���䣺%d", concretePrototype1.tag, concretePrototype1.age));
	}
}
