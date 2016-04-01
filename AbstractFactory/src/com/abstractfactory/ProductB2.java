package com.abstractfactory;

public class ProductB2 implements IProductB{

	@Override
	public void run() {
		System.out.println(getClass().getSimpleName());
	}
	
}
