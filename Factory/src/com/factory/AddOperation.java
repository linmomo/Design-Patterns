package com.factory;

/**
 * 加法的实现
 * @author Administrator
 *
 */
public class AddOperation extends Operation{

	@Override
	public double getResult() {
		return num1+num2;
	}
	
}
