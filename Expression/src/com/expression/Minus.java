package com.expression;

/**
 * �����������ʵ�֣����о���Ĳ���
 * @author Administrator
 *
 */
public class Minus implements Expression{

	@Override
	public int interpret(Context context) {
		return context.getNum1()-context.getNum2();
	}

}
