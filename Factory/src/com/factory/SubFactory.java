package com.factory;

/**
 * ��������������ʵ��
 * @author Administrator
 *
 */
public class SubFactory implements IFactory {

	@Override
	public Operation creatOperation() {
		return new SubOperation();
	}
	
}
