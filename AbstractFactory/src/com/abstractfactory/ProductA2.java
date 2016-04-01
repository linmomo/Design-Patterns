package com.abstractfactory;

public class ProductA2 implements IProductA{

	@Override
	public void run() {
		System.out.println(getClass().getSimpleName());
	}

}
