package com.abstractfactory;

/**
 * 工厂类1，用于生产1号产品
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
