package com.simplefactory;

/**
 * 加法的实现
 * @author Administrator
 *
 */
public class AddOperation implements Operation{

	@Override
	public double operation(double num1, double num2) {
		return num1+num2;
	}

}
