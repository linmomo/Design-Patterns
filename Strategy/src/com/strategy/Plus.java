package com.strategy;

/**
 * �ӷ��ľ���ʵ��
 * @author Administrator
 *
 */
public class Plus extends AbstractCalculate implements IStrategy{

	@Override
	public int calculate(String exp) {
		int[] is = split(exp, "\\+");
		return is[0]+is[1];
	}


}
