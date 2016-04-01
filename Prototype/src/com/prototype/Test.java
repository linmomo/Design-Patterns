package com.prototype;

public class Test {
	public static void main(String[] args) {
		ConcreteProperty concreteProperty=new ConcreteProperty("张三");
		concreteProperty.age=18;
		ConcreteProperty concreteProperty2 = concreteProperty.clones();
		concreteProperty2.age=13;
		System.out.println(String.format("姓名：%s 年龄：%d", concreteProperty.name,concreteProperty.age));
		System.out.println(String.format("姓名：%s 年龄：%d", concreteProperty2.name,concreteProperty2.age));
	}
}
