package com.abstractfactory;

/**
 * ������ӿڣ�����������ƷA��ƷB�ķ���
 * @author Administrator
 *
 */
public interface IFactory {
	
	public IProductA creatProductA();
	
	public IProductB creatProductB();
}
