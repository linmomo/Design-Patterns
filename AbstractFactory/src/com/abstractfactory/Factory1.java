package com.abstractfactory;

/**
 * ������1����������1�Ų�Ʒ
 * @author Administrator
 *
 */
public class Factory1 implements IFactory{

	@Override
	public IProductA creatProductA() {
		return new ProductA1();
	}

	@Override
	public IProductB creatProductB() {
		return new ProductB1();
	}

}
