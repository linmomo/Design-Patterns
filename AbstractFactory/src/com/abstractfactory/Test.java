package com.abstractfactory;

public class Test {
	public static void main(String[] args) {
		
		IFactory factory;
		IProductA creatProductA;
		IProductB creatProductB;
		
		factory=new Factory1();
		creatProductA = factory.creatProductA();
		creatProductB = factory.creatProductB();
		creatProductA.run();
		creatProductB.run();
		
		factory=new Factory2();
		creatProductA = factory.creatProductA();
		creatProductB = factory.creatProductB();
		creatProductA.run();
		creatProductB.run();
		
	}
}
