package com.abstractfactory;

/**
 * ������2����������2�Ų�Ʒ
 * @author Administrator
 *
 */
public class Factory2 implements IFactory {

	@Override
	public IProductA creatProductA() {
		return new ProductA2();
	}

	@Override
	public IProductB creatProductB() {
		return new ProductB2();
	}
	
}
