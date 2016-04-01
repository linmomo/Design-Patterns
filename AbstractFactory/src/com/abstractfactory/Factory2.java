package com.abstractfactory;

/**
 * 工厂类2，用于生产2号产品
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
