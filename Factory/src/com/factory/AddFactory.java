package com.factory;

/**
 * �ӷ����������ĵ�ʵ��
 * @author Administrator
 *
 */
public class AddFactory implements IFactory{

	@Override
	public Operation creatOperation() {
		return new AddOperation();
	}

}
