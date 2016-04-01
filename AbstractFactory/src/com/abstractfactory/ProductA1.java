package com.abstractfactory;

public class ProductA1 implements IProductA{

	@Override
	public void run() {
		System.out.println(getClass().getSimpleName());
	}

}
