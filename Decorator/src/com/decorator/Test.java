package com.decorator;

public class Test {
	public static void main(String[] args) {
		DecoratorA a=new DecoratorA(new Source());
		DecoratorB b=new DecoratorB(new Source());
		b.method1();
		a.method1();
	}
}
