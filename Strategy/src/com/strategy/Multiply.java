package com.strategy;

/**
 * �����ľ���ʵ��
 * @author Administrator
 *
 */
public class Multiply extends AbstractCalculate implements IStrategy {

	@Override
	public int calculate(String exp) {
		int[] is = split(exp, "-");
		return is[0]-is[1];
	}

}
