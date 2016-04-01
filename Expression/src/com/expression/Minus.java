package com.expression;

/**
 * 解释器具体的实现，进行具体的操作
 * @author Administrator
 *
 */
public class Minus implements Expression{

	@Override
	public int interpret(Context context) {
		return context.getNum1()-context.getNum2();
	}

}
