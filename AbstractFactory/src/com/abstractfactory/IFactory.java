package com.abstractfactory;

/**
 * 工厂类接口，包含生产产品A产品B的方法
 * @author Administrator
 *
 */
public interface IFactory {
	
	public IProductA creatProductA();
	
	public IProductB creatProductB();
}
