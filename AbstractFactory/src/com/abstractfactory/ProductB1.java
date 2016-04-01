package com.abstractfactory;

public class ProductB1 implements IProductB{

	@Override
	public void run() {
		System.out.println(getClass().getSimpleName());
	}

}
