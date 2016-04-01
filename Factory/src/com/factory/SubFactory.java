package com.factory;

/**
 * 减法工厂方法的实现
 * @author Administrator
 *
 */
public class SubFactory implements IFactory {

	@Override
	public Operation creatOperation() {
		return new SubOperation();
	}
	
}
