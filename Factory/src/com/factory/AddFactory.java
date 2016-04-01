package com.factory;

/**
 * 加法工厂方法的的实现
 * @author Administrator
 *
 */
public class AddFactory implements IFactory{

	@Override
	public Operation creatOperation() {
		return new AddOperation();
	}

}
